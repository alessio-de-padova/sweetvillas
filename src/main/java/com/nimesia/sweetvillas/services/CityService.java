package com.nimesia.sweetvillas.services;

import com.nimesia.sweetvillas.dao.CityRepository;
import com.nimesia.sweetvillas.entities.CityEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CityService extends AbsService {

    @Autowired
    private CityRepository repository;

    public CityEntity get(Integer id) {
        return repository.findById(id);
    }

    public CityEntity save(CityEntity city) { return repository.save(city); }

}
