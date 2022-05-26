package com.nimesia.sweetvillas.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "states", schema = "crm")
public class StateEntity {

    @Id
    @Column(name = "state_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private @Getter @Setter Integer id;

    @Column(name = "state")
    private @Getter @Setter String name;
}
