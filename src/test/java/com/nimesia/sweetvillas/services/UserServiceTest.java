package com.nimesia.sweetvillas.services;

import com.nimesia.sweetvillas.entities.AccountEntity;
import com.nimesia.sweetvillas.entities.UserEntity;
import org.apache.catalina.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void get_valid_id() {
        AccountEntity account = new AccountEntity();
        account.setEmail("paziente.provy@gmail.com");
        account.setPwd("Lollo1195!");

        UserEntity user = new UserEntity();
        user.setName("Paziente");
        user.setSurname("Prova");
        user.setFiscalCode("NGMPFP56E4GL420Z");
        user.setAccount(account);

        UserEntity createdUser = userService.create(user);

        UserEntity newUser = userService.get(createdUser.getId()).get();

        assertThat(newUser.getId())
                .isEqualTo(user.getId());

        userService.delete(user.getId());


    }

}