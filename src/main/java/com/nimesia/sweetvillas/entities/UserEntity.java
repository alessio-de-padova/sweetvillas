package com.nimesia.sweetvillas.entities;

import com.nimesia.sweetvillas.encryptors.AttributeEncryptor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users", schema = "crm")
public class UserEntity extends AbsEntity {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter @Setter String id;

    @Column(name = "name")
    @Convert(converter = AttributeEncryptor.class)
    private @Getter @Setter String name;

    @Column(name = "fiscal_code")
    @Convert(converter = AttributeEncryptor.class)
    private @Getter @Setter String fiscalCode;

    @Column(name = "enabled")
    private @Getter @Setter Boolean enabled;

    @Column(name = "surname")
    @Convert(converter = AttributeEncryptor.class)
    private @Getter @Setter String surname;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id")
    private @Getter @Setter AccountEntity account;

    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "role_id")
    private @Getter @Setter RoleEntity role;

    @OneToMany(cascade = CascadeType.DETACH)
    @JoinTable(
            name = "users_specs",
            schema = "crm",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "spec_id")
    )
    private @Getter @Setter List<UserSpecEntity> specs;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(
            name = "users_stores",
            schema = "ecommerce",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "store_id")
    )
    private @Getter @Setter List<StoreEntity> stores;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private @Getter @Setter List<CartProductEntity> cartProducts;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(
            name = "users_orders",
            schema = "ecommerce",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private @Getter @Setter List<ProductEntity> orderedProducts;
}