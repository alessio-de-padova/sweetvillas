package com.nimesia.sweetvillas.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

public class UserDTO extends AbsDTO {
    private String id;

    @NotNull(message = "NameNull")
    @Size(min = 1, message = "NameLength")
    private String name;
    @Size(min = 1, message = "SurnameLength")
    @NotNull(message = "SurnameNull")
    private String surname;
    @NotNull(message = "FiscalCodeNull")
    @Size(min=16, max=16, message = "FiscalCodeInvalid")
    private String fiscalCode;
    @Valid
    private AccountDTO account;
    private RoleDTO role;
    private Set<SpecDTO> specs;

    public String getId() { return id; }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public AccountDTO getAccount() {
        return account;
    }
    public void setAccount(AccountDTO account) { this.account = account; }

    public RoleDTO getRole() {
        return role;
    }

    public void setRole(RoleDTO role) {
        this.role = role;
    }

    public Set<SpecDTO> getSpecs() {
        return specs;
    }

    public void setSpecs(Set<SpecDTO> specs) {
        this.specs = specs;
    }

    public String getFiscalCode() {
        return fiscalCode;
    }

    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }
}
