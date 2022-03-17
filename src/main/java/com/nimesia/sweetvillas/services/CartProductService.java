package com.nimesia.sweetvillas.services;

import com.nimesia.sweetvillas.dao.CartProductRepository;
import com.nimesia.sweetvillas.entities.CartProductEntity;
import com.nimesia.sweetvillas.entities.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;

@Service
@Transactional
public class CartProductService extends AbsService {

    @Autowired
    private CartProductRepository repository;
    @Autowired
    private ProductService productService;


    public CartProductEntity save(CartProductEntity cartProduct) {
        ProductEntity product = productService.get(cartProduct.getProduct().getId());
        cartProduct.setTotalPrice( product.getPrice().multiply(BigDecimal.valueOf(cartProduct.getQuantity() )) );
        return repository.save(cartProduct);
    }

}