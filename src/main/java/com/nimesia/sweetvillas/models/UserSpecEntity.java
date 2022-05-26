package com.nimesia.sweetvillas.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "specs", schema = "crm")
public class UserSpecEntity extends AbsEntity {

    @Id
    @Column(name = "spec_id")
    private @Getter @Setter String id;

    @OneToMany(cascade = CascadeType.DETACH)
    @JoinTable(
            name = "specs_translations",
            schema = "crm",
            joinColumns = @JoinColumn(name = "spec_id"),
            inverseJoinColumns = @JoinColumn(name = "translation_id")
    )
    private @Getter @Setter
    Set<TextEntity> texts;

}
