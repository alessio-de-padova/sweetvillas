package com.nimesia.sweetvillas.entities;

import com.nimesia.sweetvillas.converter.AttributeEncryptor;

import javax.persistence.*;

@Entity
@Table(name = "accounts", schema = "public")
public class AccountEntity extends AbsEntity {

    @Id
    @Column(name = "account_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "email")
    @Convert(converter = AttributeEncryptor.class)
    private String email;

    @Column(name = "pwd")
    @Convert(converter = AttributeEncryptor.class)
    private String pwd;

    @Column(name = "enabled")
    private Boolean enabled;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}