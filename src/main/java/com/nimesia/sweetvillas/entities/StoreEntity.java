package com.nimesia.sweetvillas.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "stores", schema = "ecommerce")
public class StoreEntity extends AbsEntity {

    @Id
    @Column(name = "store_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter @Setter Integer id;

    @Column(name = "store")
    private @Getter @Setter String name;

    @Column(name = "street")
    private @Getter @Setter String street;

    @Column(name = "postalCode")
    private @Getter @Setter Integer postalCode;

    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "city_id")
    private @Getter @Setter CityEntity city;

    @OneToMany(cascade = CascadeType.DETACH)
    @JoinTable(
            name = "stores_products",
            schema = "ecommerce",
            joinColumns = @JoinColumn(name = "store_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private @Getter @Setter
    List<ProductEntity> products;

}