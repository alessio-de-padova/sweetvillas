package com.nimesia.sweetvillas.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "cities", schema = "crm")
public class CityEntity extends AbsEntity {

    @Id
    @Column(name = "city_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter @Setter Integer id;

    @Column(name = "city")
    private @Getter @Setter String name;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "state_id")
    private @Getter @Setter StateEntity state;

}