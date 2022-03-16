package com.nimesia.sweetvillas.services;

import com.nimesia.sweetvillas.entities.StoreEntity;
import com.nimesia.sweetvillas.dao.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreService extends AbsService {

    @Autowired
    private StoreRepository repository;

    public StoreEntity get(Integer id) {
        return repository.findById(id);
    }

    public StoreEntity save(StoreEntity store) { return repository.save(store); }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}