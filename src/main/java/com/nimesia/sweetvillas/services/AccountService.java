package com.nimesia.sweetvillas.services;

import com.nimesia.sweetvillas.models.AccountEntity;
import com.nimesia.sweetvillas.dao.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.Optional;

@Service
@Transactional
public class AccountService extends AbsService {

    @Autowired
    private AccountRepository repository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public AccountEntity get(Integer id)  {return repository.findById(id).get();}

    public AccountEntity getByEmail(String email)  {return repository.findByEmail(email).get();}

    public Boolean emailExists(String email, Number id) {
        Optional<AccountEntity> account = repository.findByEmail(email);

        if ( account.isPresent() ) {
            return !account.get().getId().equals(id);
        }

        return false;
    }

    public Number update(AccountEntity account) {

        account.setPwd( passwordEncoder.encode(account.getPwd()) );
        return repository.save(account).getId();
    }

}
