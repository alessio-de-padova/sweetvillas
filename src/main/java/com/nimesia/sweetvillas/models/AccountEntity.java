package com.nimesia.sweetvillas.models;

import com.nimesia.sweetvillas.encryptors.AttributeEncryptor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "accounts", schema = "crm")
public class AccountEntity extends AbsEntity {

    @Id
    @Column(name = "account_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter @Setter Integer id;

    @Column(name = "email")
    @Convert(converter = AttributeEncryptor.class)
    private @Getter @Setter String email;

    @Column(name = "pwd")
    private @Getter @Setter String pwd;

    @Column(name = "enabled")
    private @Getter @Setter Boolean enabled;

}