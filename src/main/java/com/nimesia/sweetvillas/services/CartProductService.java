package com.nimesia.sweetvillas.services;

import com.nimesia.sweetvillas.dao.CartProductRepository;
import com.nimesia.sweetvillas.models.CartProductEntity;
import com.nimesia.sweetvillas.models.ProductEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Service
@Transactional
public class CartProductService extends AbsService {

    private final CartProductRepository repository;
    private final ProductService productService;

    public CartProductService(
            CartProductRepository repository,
            ProductService productService
    ) {
        this.productService = productService;
        this.repository = repository;
    }

    public CartProductEntity get(@NotNull Integer cartProductId) {
        return repository.findById(cartProductId)
                .orElseThrow(() -> new IllegalStateException( String.format("No cart product found with id: %s", cartProductId)));
    }

    public CartProductEntity save(@NotNull CartProductEntity cartProduct) {

        ProductEntity product = productService.get(cartProduct.getProduct().getId());

        if (product.getQuantity() < cartProduct.getQuantity()) {
            throw new IllegalStateException("QuantityInvalid");
        }

        // Restore previous product quantity
        if (cartProduct.getId() != null) {
            CartProductEntity prevCartProduct = get(cartProduct.getId());
            product.setQuantity(product.getQuantity() + prevCartProduct.getQuantity());
        }

        cartProduct.setTotalPrice(product.getPrice().multiply(BigDecimal.valueOf(cartProduct.getQuantity())));
        CartProductEntity newCartProduct = repository.save(cartProduct);

        product.setQuantity(product.getQuantity() - newCartProduct.getQuantity());
        productService.save(product);

        return newCartProduct;
    }

    public void delete(@NotNull Integer cartProductId) {

        CartProductEntity cartProduct = get(cartProductId);

        ProductEntity product = productService.get(cartProduct.getProduct().getId());

        product.setQuantity(product.getQuantity() + cartProduct.getQuantity());

        productService.save(product);
        repository.delete(cartProduct);

    }

}