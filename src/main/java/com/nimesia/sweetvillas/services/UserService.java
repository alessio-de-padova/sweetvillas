package com.nimesia.sweetvillas.services;

import com.nimesia.sweetvillas.dao.UserDAO;
import com.nimesia.sweetvillas.models.UserEntity;
import com.nimesia.sweetvillas.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService extends AbsService {

    @Autowired
    private UserRepository repository;
    @Autowired
    private UserDAO dao;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public Optional<UserEntity> get(String id) {

        return repository.findById(id);
    }

    public List<UserEntity> search(String str, Integer page, Integer limit) {
        return dao.search(str, page, limit);
    }

    public Boolean fiscalCodeExists(String fiscalCode, String id) {
        Optional<UserEntity> user =  repository.getByFiscalCode(fiscalCode);
        if ( user.isPresent() ) {
            return !user.get().getId().equals(id);
        }

        return false;
    }

    public Boolean emailExists(String email, String id) {
        Optional<UserEntity> user = repository.getByAccountEmail(email);

        if ( user.isPresent() ) {
            return !user.get().getId().equals(id);
        }

        return false;
    }

    public UserEntity update(UserEntity user) {

        // This is where you set previous data you don't want to change
        UserEntity prevUser = get( user.getId() ).get();

        user.getAccount().setPwd( prevUser.getAccount().getPwd());
        user.setRole(prevUser.getRole());

        return repository.save(user);

    }
    public UserEntity create(UserEntity user) {
        user.getAccount()
                .setPwd(passwordEncoder.encode(user.getAccount().getPwd()));
        return repository.save(user);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }

    public UserEntity getByEmailAndPassword(String email, String pwd) {

        Optional<UserEntity> user = repository.getByAccountEmail(email);

        if (user.isPresent() && passwordEncoder.matches(pwd, user.get().getAccount().getPwd())) {
            return user.get();
        }

        return null;
    }
}
