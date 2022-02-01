package com.nimesia.sweetvillas.services;

import com.nimesia.sweetvillas.dao.UserDAO;
import com.nimesia.sweetvillas.dto.UserDTO;
import com.nimesia.sweetvillas.entities.UserEntity;
import com.nimesia.sweetvillas.dao.UserRepository;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
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
        List<UserEntity> userEntities = dao.search(str, page, limit);
        return userEntities;
    }

    public UserEntity update(UserEntity user) {
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

        if ( user != null && passwordEncoder.matches(pwd, user.getAccount().getPwd())) {
            return user;
        }

        return null;
    }
}
