package com.nimesia.sweetvillas.entities;

import javax.persistence.*;

@Entity
@Table(name = "specs", schema = "public")
public class SpecEntity {

    @Id
    @Column(name = "spec_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "spec")
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
