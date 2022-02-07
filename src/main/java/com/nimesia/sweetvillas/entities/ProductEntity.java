package com.nimesia.sweetvillas.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products", schema = "ecommerce")
public class ProductEntity extends AbsEntity {

    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter @Setter Integer id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "products_translations",
            schema = "ecommerce",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "translation_id")
    )
    private @Getter @Setter
    List<TextEntity> names;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "products_categories",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private @Getter @Setter
    List<TextEntity> categories;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "stores_products",
            schema = "ecommerce",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "store_id")
    )
    private @Getter @Setter
    List<StoreEntity> stores;

    @Column(name = "price")
    private @Getter @Setter Number price;

}