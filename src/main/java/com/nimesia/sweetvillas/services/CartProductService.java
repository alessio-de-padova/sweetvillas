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
        return repository.findById(cartProductId).get();
    }

    public CartProductEntity save(@NotNull CartProductEntity cartProduct) {

        ProductEntity product = productService.get(cartProduct.getProduct().getId());

        // Restore previous product quantity
        if (cartProduct.getId() != null) {
            CartProductEntity prevCartProduct = get(cartProduct.getId());
            product.setQuantity(product.getQuantity() + prevCartProduct.getQuantity());
        }

        if (product.getQuantity() < cartProduct.getQuantity()) {
            throw new IllegalStateException("QuantityInvalid");
        }

        cartProduct.setTotalPrice(product.getPrice().multiply(BigDecimal.valueOf(cartProduct.getQuantity())));
        CartProductEntity newCartProduct = repository.save(cartProduct);

        product.setQuantity(product.getQuantity() - newCartProduct.getQuantity());
        productService.save(product);

        return newCartProduct;
    }

}