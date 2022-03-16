package com.nimesia.sweetvillas.services;

import com.nimesia.sweetvillas.entities.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTest {

    @Autowired
    private ProductService productService;


    @Test
    public void create_store() {
        ProductEntity product = new ProductEntity();
        BigDecimal price = new BigDecimal("12.34");

        List<TextEntity> texts = new ArrayList<>();

        TextEntity enText = new TextEntity();
        TextEntity itText = new TextEntity();

        LangEntity enLang = new LangEntity();
        LangEntity itLang = new LangEntity();

        StoreEntity store = new StoreEntity();
        store.setId(5);

        enLang.setId("en");
        itLang.setId("it");

        enText.setText("Book");
        enText.setLang(enLang);
        itText.setText("Libro");
        itText.setLang(itLang);

        texts.add(itText);
        texts.add(enText);

        product.setNames(texts);
        product.setPrice(price);
        product.setStore(store);

        ProductEntity createdProduct = productService.save(product);

        ProductEntity newProduct = productService.get(createdProduct.getId());

        assertThat(newProduct.getId())
                .isEqualTo(product.getId());
        assertThat(newProduct.getPrice())
                .isEqualTo(product.getPrice());

    }
}