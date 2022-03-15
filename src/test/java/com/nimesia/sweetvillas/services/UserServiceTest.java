package com.nimesia.sweetvillas.services;

import com.nimesia.sweetvillas.entities.AccountEntity;
import com.nimesia.sweetvillas.entities.UserEntity;
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
    public void get_by_valid_id() {
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
        assertThat(newUser.getName())
                .isEqualTo(user.getName());
        assertThat(newUser.getSurname())
                .isEqualTo(user.getSurname());
        assertThat(newUser.getFiscalCode())
                .isEqualTo(user.getFiscalCode());

        assertThat(newUser.getAccount().getEmail())
                .isEqualTo(user.getAccount().getEmail());

        userService.delete(user.getId());
    }

    @Test
    public void valid_login() {
        String email = "paziente.provy@gmail.com";
        String pwd = "Lollo1195!";
        AccountEntity account = new AccountEntity();
        account.setEmail(email);
        account.setPwd(pwd);

        UserEntity user = new UserEntity();
        user.setName("Paziente");
        user.setSurname("Prova");
        user.setFiscalCode("NGMPFP56E4GL420Z");
        user.setAccount(account);

        UserEntity createdUser = userService.create(user);

        UserEntity loginUser = userService.getByEmailAndPassword(email, pwd);

        assertThat(createdUser.getAccount().getEmail())
                .isEqualTo(loginUser.getAccount().getEmail());

        userService.delete(user.getId());

    }

    @Test
    public void update_user() {
        AccountEntity account = new AccountEntity();
        account.setEmail("paziente.provy@gmail.com");
        account.setPwd("Lollo1195!");

        UserEntity user = new UserEntity();
        user.setName("Paziente");
        user.setSurname("Prova");
        user.setFiscalCode("NGMPFP56E4GL420Z");
        user.setAccount(account);

        UserEntity createdUser = userService.create(user);

        String newName = "Pippo";
        String newSurname = "Pluto";
        String newEmail = "paziente.prova@tiscali.it";

        createdUser.setName( newName );
        createdUser.setSurname( newSurname );
        createdUser.getAccount()
                    .setEmail( newEmail);

        UserEntity updatedUser = userService.update( createdUser );

        UserEntity newUser = userService.get(updatedUser.getId()).get();

        assertThat(newUser.getId())
                .isEqualTo(updatedUser.getId());
        assertThat(newUser.getName())
                .isEqualTo(newName);
        assertThat(newUser.getSurname())
                .isEqualTo(newSurname);

        assertThat(newUser.getAccount().getEmail())
                .isEqualTo(newEmail);

        userService.delete(user.getId());
    }


}