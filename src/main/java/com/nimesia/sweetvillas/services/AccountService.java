package com.nimesia.sweetvillas.services;

import com.nimesia.sweetvillas.entities.AccountEntity;
import com.nimesia.sweetvillas.dao.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class AccountService extends AbsService {

    @Autowired
    private AccountRepository repository;

    public AccountEntity get(Integer id)  {

        return repository.findById(id);

    }

    public Serializable save(AccountEntity account) {
        return repository.save(account);
    }

}
