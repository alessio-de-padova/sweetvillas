package com.nimesia.sweetvillas.dto;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class AccountDTO extends AbsDTO {
    private Integer id;
    @NotEmpty
    @Email(message = "EmailInvalid")
    private String email;
    private Boolean enabled;
    private String pwd;
    private String pwd2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
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

    public String getPwd2() {
        return pwd2;
    }
    public void setPwd2(String pwd2) {
        this.pwd2 = pwd2;
    }

    public boolean pdwMatch() {
        return this.pwd.equals(this.pwd2);
    }

    public boolean isPwdValid() {
        String regex = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{5,}$";
        return this.pwd.matches(regex);
    }
}
