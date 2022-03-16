package com.nimesia.sweetvillas.services;

import com.nimesia.sweetvillas.entities.CityEntity;
import com.nimesia.sweetvillas.entities.ProductEntity;
import com.nimesia.sweetvillas.entities.StoreEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StoreServiceTest {

    @Autowired
    private StoreService storeService;
    @Autowired
    private CityService cityService;

    @Test
    public void create_store() {
        StoreEntity store = new StoreEntity();

        String name = "Mercato veneziano";
        String street = "contrada san domenico";
        Integer postalCode = 6234;

        CityEntity city = cityService.get(1);

        store.setName( name );
        store.setStreet(street);
        store.setPostalCode(postalCode);
        store.setCity(city);

        StoreEntity createdStore = storeService.save(store);
        StoreEntity newStore = storeService.get(createdStore.getId());

        assertThat(newStore.getId())
                .isEqualTo(store.getId());
        assertThat(newStore.getName())
                .isEqualTo(store.getName());
        assertThat(newStore.getStreet())
                .isEqualTo(store.getStreet());
        assertThat(newStore.getPostalCode())
                .isEqualTo(store.getPostalCode());

        assertThat(newStore.getCity().getName())
                .isEqualTo(store.getCity().getName());

        storeService.delete(newStore.getId());
    }

    @Test
    public void update_store() {
        StoreEntity store = new StoreEntity();

        String name = "Mercato veneziano";
        String street = "contrada san domenico";
        Integer postalCode = 6234;

        CityEntity city = cityService.get(1);

        store.setName( name );
        store.setStreet(street);
        store.setPostalCode(postalCode);
        store.setCity(city);

        StoreEntity createdStore = storeService.save(store);

        String newName = "Mercato veneziano";
        String newStreet = "contrada san domenico";
        Integer newPostalCode = 6234;

        String newCityName = "Firenze";

        CityEntity newCity = cityService.get(2);
        newCity.setName(newCityName);

        createdStore.setName(newName);
        createdStore.setStreet(newStreet);
        createdStore.setPostalCode(newPostalCode);
        createdStore.setCity(newCity);
        createdStore.setProducts(new ArrayList<ProductEntity>());

        StoreEntity updatedStore = storeService.save(createdStore);
        StoreEntity newStore = storeService.get(updatedStore.getId());

        assertThat(newStore.getName())
                .isEqualTo(newName);
        assertThat(newStore.getStreet())
                .isEqualTo(newStreet);
        assertThat(newStore.getPostalCode())
                .isEqualTo(newPostalCode);

        assertThat(newStore.getCity().getId())
                .isEqualTo(newCity.getId());

        assertThat(newStore.getCity().getName())
                .isNotEqualTo(newCityName);

        storeService.delete(newStore.getId());
    }

    @Test
    public void get_test() {

        StoreEntity newStore = storeService.get(49);
        System.out.println(newStore);

    }



}