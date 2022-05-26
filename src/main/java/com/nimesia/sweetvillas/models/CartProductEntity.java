package com.nimesia.sweetvillas.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "users_cart", schema = "ecommerce")
public class CartProductEntity extends AbsEntity {

    @Id
    @Column(name = "user_cart_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter @Setter Integer id;

    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "user_id")
    @NotNull
    private @Getter @Setter UserEntity user;

    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "product_id")
    @NotNull
    private @Getter @Setter ProductEntity product;

    @Column(name = "total_price")
    @NotNull
    private @Getter @Setter
    BigDecimal totalPrice;

    @Column(name = "quantity")
    @NotNull
    private @Getter @Setter
    Integer quantity;
}