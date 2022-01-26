package com.nimesia.sweetvillas.services;

import com.nimesia.sweetvillas.dao.SpecRepository;
import com.nimesia.sweetvillas.entities.SpecEntity;
import com.nimesia.sweetvillas.entities.SpecEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class SpecService {

    @Autowired
    private SpecRepository repository;

    public Optional<SpecEntity> get(String id) {
        return repository.findById(id);
    }

    public SpecEntity create(SpecEntity user) {

        return repository.save(user);
    }

}
