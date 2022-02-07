package com.nimesia.sweetvillas.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

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

}