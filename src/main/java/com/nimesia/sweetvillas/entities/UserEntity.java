package com.nimesia.sweetvillas.entities;

import com.nimesia.sweetvillas.converter.AttributeEncryptor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users", schema = "public")
public class UserEntity extends AbsEntity {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "name")
    @Convert(converter = AttributeEncryptor.class)
    private String name;

    @Column(name = "fiscal_code")
    @Convert(converter = AttributeEncryptor.class)
    private String fiscalCode;

    @Column(name = "enabled")
    private Boolean enabled;

    @Column(name = "surname")
    @Convert(converter = AttributeEncryptor.class)
    private String surname;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id")
    private AccountEntity account;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "role_id")
    private RoleEntity role;

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "users_specs",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "spec_id")
    )
    private Set<SpecEntity> specs;

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFiscalCode() {
        return fiscalCode;
    }

    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public AccountEntity getAccount() {
        return account;
    }

    public void setAccount(AccountEntity account) {
        this.account = account;
    }

    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity role) {
        this.role = role;
    }

    public Set<SpecEntity> getSpecs() {
        return specs;
    }

    public void setSpecs(Set<SpecEntity> specs) {
        this.specs = specs;
    }
}