package com.nimesia.sweetvillas.services;

import com.nimesia.sweetvillas.models.*;
import com.nimesia.sweetvillas.utils.MockData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CartProductServiceTest {

    @Autowired
    private ProductService productService;
    @Autowired
    private UserService userService;
    @Autowired
    private CartProductService cartProductService;
    @Autowired
    private MockData mockData;

    @Test
    @Transactional
    public void test_add_product() {

        CartProductEntity cartProduct = new CartProductEntity();
        ProductEntity product = mockData.createProduct(24);
        UserEntity user = mockData.createUser();
        cartProduct.setProduct(product);
        cartProduct.setUser(user);
        cartProduct.setQuantity(1);

        CartProductEntity newCartProduct = cartProductService.save(cartProduct);

        assertThat(newCartProduct.getQuantity())
                .isEqualTo(cartProduct.getQuantity());
        assertThat(newCartProduct.getUser().getId())
                .isEqualTo(cartProduct.getUser().getId());
        assertThat(newCartProduct.getProduct().getId())
                .isEqualTo(cartProduct.getProduct().getId());
        assertThat(newCartProduct.getTotalPrice())
                .isEqualTo(product.getPrice().multiply(BigDecimal.valueOf(cartProduct.getQuantity())));

        Integer newQuantity = 19;

        CartProductEntity updateCartProduct = new CartProductEntity();
        updateCartProduct.setId(newCartProduct.getId());
        updateCartProduct.setProduct(newCartProduct.getProduct());
        updateCartProduct.setQuantity(newQuantity);

        CartProductEntity updated = cartProductService.save(updateCartProduct);

        assertThat(updated.getQuantity())
                .isEqualTo(newCartProduct.getQuantity());

    }
}
