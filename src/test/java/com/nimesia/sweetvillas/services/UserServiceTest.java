package com.nimesia.sweetvillas.services;

import com.nimesia.sweetvillas.dto.AccountDTO;
import com.nimesia.sweetvillas.dto.UserDTO;
import com.nimesia.sweetvillas.entities.AccountEntity;
import com.nimesia.sweetvillas.entities.RoleEntity;
import com.nimesia.sweetvillas.entities.UserEntity;
import com.nimesia.sweetvillas.mappers.UserMapper;
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
    @Autowired
    private UserMapper userMapper;

    @Test
    public void get_by_valid_id() {
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

        UserEntity createdUser = userService.create(user);

        UserEntity newUser = userService.get(createdUser.getId());
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

        assertThat(newUser.getRole().getName())
                .isNotEqualTo(user.getRole().getName());

        userService.delete(newUser.getId());
    }

    @Test
    public void valid_login() {
        String email = "paziente.prova@gmail.com";
        String pwd = "23234!";
        AccountDTO account = new AccountDTO();
        account.setEmail(email);
        account.setPwd(pwd);

        UserDTO user = new UserDTO();
        user.setName("Paziente");
        user.setSurname("Prova");
        user.setFiscalCode("NGMPFP56E4GL420Z");
        user.setAccount(account);

        UserEntity createdUser = userService.create(userMapper.map(user));

        UserEntity loginUser = userService.getByEmailAndPassword(email, pwd);

        assertThat(createdUser.getAccount().getEmail())
                .isEqualTo(loginUser.getAccount().getEmail());

        userService.delete(createdUser.getId());

    }

    @Test
    public void update_user() {
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

        UserEntity createdUser = userService.create(user);

        String newName = "Pippo";
        String newSurname = "Pluto";
        String newEmail = "paziente.prova@tiscali.it";
        String newRoleId = "OPE";
        String newRoleName = "PATACCA";

        createdUser.setName( newName );
        createdUser.setSurname( newSurname );
        createdUser.getAccount()
                    .setEmail( newEmail);
        createdUser.getRole()
                .setId(newRoleId);
        createdUser.getRole()
                .setName(newRoleName);

        UserEntity updatedUser = userService.update( createdUser );

        UserEntity newUser = userService.get(updatedUser.getId());

        assertThat(newUser.getId())
                .isEqualTo(updatedUser.getId());
        assertThat(newUser.getName())
                .isEqualTo(newName);
        assertThat(newUser.getSurname())
                .isEqualTo(newSurname);
        assertThat(newUser.getRole().getId())
                .isNotEqualTo(newRoleId);

        assertThat(newUser.getAccount().getEmail())
                .isEqualTo(newEmail);

        userService.delete(user.getId());
    }


}