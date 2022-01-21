package com.nimesia.sweetvillas.services;

import com.nimesia.sweetvillas.entities.AccountEntity;
import com.nimesia.sweetvillas.dao.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class AccountService extends AbsService {

    @Autowired
    private AccountRepository repository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public AccountEntity get(Integer id)  {return repository.findById(id);}

    public Serializable update(AccountEntity account) {
        account
            .setPwd(
                    passwordEncoder.encode(account.getPwd())
            );

        return repository.save(account);
    }

}
