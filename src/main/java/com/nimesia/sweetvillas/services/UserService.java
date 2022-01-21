package com.nimesia.sweetvillas.services;

import com.nimesia.sweetvillas.dao.UserDAO;
import com.nimesia.sweetvillas.entities.AccountEntity;
import com.nimesia.sweetvillas.entities.UserEntity;
import com.nimesia.sweetvillas.dao.UserRepository;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.io.Serializable;
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

    public List<UserEntity> search(JSONObject params) throws JSONException {
        return dao.search(params);
    }

    public Serializable update(UserEntity user) {
        return repository.save(user);
    }

    public Serializable create(UserEntity user) {
        user.getAccount()
                .setPwd(
                        passwordEncoder.encode(user.getAccount().getPwd())
                );
        return repository.save(user);
    }

    public UserEntity getByEmailAndPassword(String email, String pwd) {

        String hashedPwd = passwordEncoder.encode(pwd);
        return repository.getByAccountEmailAndPwd(email, hashedPwd);

    }
}
