package com.nimesia.sweetvillas.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "langs", schema = "public")
public class LangEntity {

    @Id
    @Column(name = "lang_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter @Setter String id;

    @Column(name = "lang")
    private @Getter @Setter String name;


}