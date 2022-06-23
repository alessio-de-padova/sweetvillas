package com.nimesia.sweetvillas.utils;

import com.nimesia.sweetvillas.models.AccountEntity;
import com.nimesia.sweetvillas.models.RoleEntity;
import com.nimesia.sweetvillas.models.UserEntity;
import com.nimesia.sweetvillas.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MockData {
    @Autowired
    private UserService userService;

    public UserEntity createUser() {
        AccountEntity account = new AccountEntity();
        account.setEmail("paziente.provy@gmail.com");
        account.setPwd("Lollo1195!");

        RoleEntity role = new RoleEntity();
        role.setId("ADM");
        role.setName("Scribaldino");


        UserEntity user = new UserEntity();
        user.setName("Paziente");
        user.setSurname("Prova");
        user.setFiscalCode("NGMPFP56E4GL420Z");
        user.setAccount(account);
        user.setRole(role);

        return userService.create(user);
    }


}
