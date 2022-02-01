package com.nimesia.sweetvillas.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "langs", schema = "crm")
public class LangEntity {

    @Id
    @Column(name = "lang_id")
    private @Getter @Setter String id;

    @Column(name = "lang")
    private @Getter @Setter String name;

}