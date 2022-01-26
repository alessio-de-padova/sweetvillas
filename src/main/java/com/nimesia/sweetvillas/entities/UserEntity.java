package com.nimesia.sweetvillas.entities;

import com.nimesia.sweetvillas.encryptors.AttributeEncryptor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users", schema = "crm")
public class UserEntity extends AbsEntity {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter @Setter String id;

    @Column(name = "name")
    @Convert(converter = AttributeEncryptor.class)
    private @Getter @Setter String name;

    @Column(name = "fiscal_code")
    @Convert(converter = AttributeEncryptor.class)
    private @Getter @Setter String fiscalCode;

    @Column(name = "enabled")
    private @Getter @Setter Boolean enabled;

    @Column(name = "surname")
    @Convert(converter = AttributeEncryptor.class)
    private @Getter @Setter String surname;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id")
    private @Getter @Setter AccountEntity account;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "role_id")
    private @Getter @Setter RoleEntity role;

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "users_specs",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "spec_id")
    )
    private @Getter @Setter List<UserSpecEntity> specs;

}