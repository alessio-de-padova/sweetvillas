package com.nimesia.sweetvillas.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "specs", schema = "crm")
public class SpecEntity extends AbsEntity {

    @Id
    @Column(name = "spec_id")
    private @Getter @Setter String id;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name = "specs_translations",
            schema="crm",
            joinColumns = @JoinColumn(name = "spec_id"),
            inverseJoinColumns = @JoinColumn(name = "translation_id")
    )
    private @Getter @Setter
    List<TextEntity> texts;
}