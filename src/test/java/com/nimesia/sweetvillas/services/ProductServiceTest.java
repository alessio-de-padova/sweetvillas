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
    @Autowired
    private CityService cityService;
    @Autowired
    private StoreService storeService;

    @Test
    public void create_product() {

        ProductEntity product = new ProductEntity();
        BigDecimal price = new BigDecimal("12.34");
        Integer quantity = 23;

        List<TextEntity> texts = new ArrayList<>();

        TextEntity enText = new TextEntity();
        TextEntity itText = new TextEntity();

        LangEntity enLang = new LangEntity();
        LangEntity itLang = new LangEntity();

        // Test that store id will be enough
        StoreEntity store = createStore();
        store.setId( store.getId() );

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
        product.setQuantity(quantity);

        ProductEntity createdProduct = productService.save(product);
        ProductEntity newProduct = productService.get(createdProduct.getId());

        assertThat(newProduct.getId())
                .isEqualTo(product.getId());
        assertThat(newProduct.getPrice())
                .isEqualTo(product.getPrice());
        assertThat(newProduct.getQuantity())
                .isEqualTo(product.getQuantity());
        assertThat(newProduct.getStore().getId())
                .isEqualTo(store.getId());
        assertThat(newProduct.getStore().getStreet())
                .isEqualTo(store.getStreet());
        assertThat(newProduct.getStore().getPostalCode())
                .isEqualTo(store.getPostalCode());
        assertThat(newProduct.getStore().getName())
                .isEqualTo(store.getName());
    }

    private StoreEntity createStore() {
        StoreEntity store = new StoreEntity();
        UserEntity user = new UserEntity();
        user.setId("d90aa567-edf6-1fd0-b30f-dc10b31fe793");

        String name = "Prodotti veneziani";
        String street = "contrada san domenico";
        Integer postalCode = 6234;

        CityEntity city = cityService.get(1);

        store.setName( name );
        store.setStreet(street);
        store.setPostalCode(postalCode);
        store.setCity(city);
        store.setUser(user);

        return storeService.save(store);

    }
}