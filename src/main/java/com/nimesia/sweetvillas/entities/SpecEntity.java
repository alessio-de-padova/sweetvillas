package com.nimesia.sweetvillas.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "specs", schema = "public")
public class SpecEntity {

    @Id
    @Column(name = "spec_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter @Setter String id;

    @Column(name = "spec")
    private @Getter @Setter String name;


}
