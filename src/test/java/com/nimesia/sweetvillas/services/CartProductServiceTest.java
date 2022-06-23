package com.nimesia.sweetvillas.services;

import com.nimesia.sweetvillas.models.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;

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

    @Test
    @Transactional
    public void add_product() {

        String userId = "d90aa567-edf6-1fd0-b30f-dc10b31fe793";
        Integer productId = 32;

        CartProductEntity cartProduct = new CartProductEntity();
        ProductEntity product = productService.get(productId);
        UserEntity user = userService.get(userId);
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

        Integer newQuantity = 23;

        newCartProduct.setQuantity(newQuantity);

        CartProductEntity updated = cartProductService.save(newCartProduct);

        assertThat(updated.getQuantity())
                .isEqualTo(newCartProduct.getQuantity());

    }
}
