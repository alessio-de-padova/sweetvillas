package com.nimesia.sweetvillas.services;

import com.nimesia.sweetvillas.dao.UserDAO;
import com.nimesia.sweetvillas.entities.UserEntity;
import com.nimesia.sweetvillas.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService extends AbsService {

    @Autowired
    private UserRepository repository;
    @Autowired
    private UserDAO dao;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public UserEntity get(String id) {

        return repository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Not found"));
    }

    public List<UserEntity> search(String str, Integer page, Integer limit) {
        return dao.search(str, page, limit);
    }

    public UserEntity update(UserEntity user) {

        // This is where you set previous data you don't want to change
        UserEntity prevUser = get( user.getId() );
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

        UserEntity user = repository.getByAccountEmail(email);

        if (user != null && passwordEncoder.matches(pwd, user.getAccount().getPwd())) {
            return user;
        }

        return null;
    }
}
