package com.nimesia.sweetvillas.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "translations", schema = "public")
public class TextEntity {

    @Id
    @Column(name = "translation_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter @Setter String id;

    @Column(name = "translation")
    private @Getter @Setter String text;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "lang_id")
    private @Getter @Setter LangEntity lang;

}