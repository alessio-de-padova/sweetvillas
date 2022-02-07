package com.nimesia.sweetvillas.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "categories", schema = "ecommerce")
public class CategoryEntity extends AbsEntity {

    @Id @Column(name = "category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter @Setter Integer id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "categories_translations",
            schema = "ecommerce",
            joinColumns = @JoinColumn(name = "category_id"),
            inverseJoinColumns = @JoinColumn(name = "translation_id")
    )
    private @Getter @Setter Set<TextEntity> texts;

}