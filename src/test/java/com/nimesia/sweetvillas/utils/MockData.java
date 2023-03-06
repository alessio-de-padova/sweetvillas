package com.nimesia.sweetvillas.utils;

import com.nimesia.sweetvillas.models.*;
import com.nimesia.sweetvillas.services.CityService;
import com.nimesia.sweetvillas.services.ProductService;
import com.nimesia.sweetvillas.services.StoreService;
import com.nimesia.sweetvillas.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class MockData {
    @Autowired
    private UserService userService;
    @Autowired
    private StoreService storeService;
    @Autowired
    private CityService cityService;
    @Autowired
    private ProductService productService;

    public UserEntity createUser() {
        AccountEntity account = new AccountEntity();
        account.setEmail("paziente.provy@gmail.com");
        account.setPwd("Lollo1195!");

        RoleEntity role = new RoleEntity();
        role.setId("ADM");
        role.setName("Scribaldino");


        UserEntity user = new UserEntity();
        user.setName("Paziente");
        user.setSurname("Prova");
        user.setFiscalCode("NGMPFP56E4GL420Z");
        user.setAccount(account);
        user.setRole(role);

        return userService.create(user);
    }

    public ProductEntity createProduct(@Nullable Integer quantity ) {
        ProductEntity product = new ProductEntity();
        BigDecimal price = new BigDecimal("12.34");

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
        product.setQuantity(quantity != null ? quantity : 30);

        return productService.save(product);

    }

    public StoreEntity createStore() {
        StoreEntity store = new StoreEntity();
        UserEntity user = userService.search("", 0, 10).get(0);

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
