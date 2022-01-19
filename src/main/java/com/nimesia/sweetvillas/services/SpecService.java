package com.nimesia.sweetvillas.services;

import com.nimesia.sweetvillas.dao.SpecRepository;
import com.nimesia.sweetvillas.entities.SpecEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpecService {

    @Autowired
    private SpecRepository repository;

    public SpecEntity get(String id) {
        return repository.findById(id).get();
    }

}
