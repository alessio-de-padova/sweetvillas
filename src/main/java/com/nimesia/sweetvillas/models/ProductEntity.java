package com.nimesia.sweetvillas.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "products", schema = "ecommerce")
public class ProductEntity extends AbsEntity {

    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter @Setter Integer id;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinTable(
            name = "products_translations",
            schema = "ecommerce",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "translation_id")
    )
    private @Getter @Setter
    List<TextEntity> names;

    @OneToMany(cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    @JoinTable(
            schema = "ecommerce",
            name = "products_categories",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private @Getter @Setter
    List<CategoryEntity> categories;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    @JoinTable(
            name = "stores_products",
            schema = "ecommerce",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "store_id")
    )
    private @Getter @Setter
    StoreEntity store;

    @Column(name = "price")
    @NotNull
    private @Getter @Setter
    BigDecimal price;

    @Column(name = "quantity")
    @NotNull
    private @Getter @Setter
    Integer quantity;
}