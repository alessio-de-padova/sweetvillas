package com.nimesia.sweetvillas.services;

import com.nimesia.sweetvillas.dao.UserDAO;
import com.nimesia.sweetvillas.entities.UserEntity;
import com.nimesia.sweetvillas.dao.UserRepository;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
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

    public Optional<UserEntity> get(String id) {
        return repository.findById(id);
    }

    public List<UserEntity> search(JSONObject params) throws JSONException {
        return dao.search(params);
    }

    public Serializable save(UserEntity user) {
        return repository.save(user);
    }
}
