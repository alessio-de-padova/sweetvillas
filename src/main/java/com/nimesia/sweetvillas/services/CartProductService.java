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

    public CartProductEntity save(@NotNull CartProductEntity cartProduct) {

        ProductEntity product = productService.get(cartProduct.getProduct().getId());
        if (product.getQuantity() < cartProduct.getQuantity()) {
            throw new IllegalStateException("QuantityInvalid");
        }

        cartProduct
                .getUser()
                .getCartProducts()
                .stream()
                .filter(c -> c.getProduct().getId().equals(product.getId()))
                .findFirst()
                .ifPresent(c -> {
                    cartProduct.setQuantity(c.getQuantity() + cartProduct.getQuantity());
                    cartProduct.setId(c.getId());
                });

        cartProduct.setTotalPrice(product.getPrice().multiply(BigDecimal.valueOf(cartProduct.getQuantity())));
        CartProductEntity newCartProduct = repository.save(cartProduct);

        product.setQuantity(product.getQuantity() - newCartProduct.getQuantity());
        productService.save(product);

        return newCartProduct;
    }

    public void remove(@NotNull CartProductEntity cartProduct) {

        ProductEntity product = productService.get(cartProduct.getProduct().getId());

        cartProduct
                .getUser()
                .getCartProducts()
                .stream()
                .filter(c -> c.getProduct().getId().equals(product.getId()))
                .findFirst()
                .ifPresent(c -> {
                    cartProduct.setQuantity(c.getQuantity() - cartProduct.getQuantity());
                });

        if ( !cartProduct.getQuantity().equals(0) ) {
            cartProduct.setTotalPrice(product.getPrice().multiply(BigDecimal.valueOf(cartProduct.getQuantity())));
            repository.save(cartProduct);
        } else {
            repository.delete(cartProduct);
        }

        product.setQuantity(product.getQuantity() + cartProduct.getQuantity());
        productService.save(product);

    }

}