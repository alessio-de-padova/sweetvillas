package com.nimesia.sweetvillas.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
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
    private @Getter @Setter UserEntity user;

    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "product_id")
    private @Getter @Setter ProductEntity product;

    @Column(name = "total_price")
    private @Getter @Setter
    BigDecimal totalPrice;

    @Column(name = "quantity")
    private @Getter @Setter
    Integer quantity;
}