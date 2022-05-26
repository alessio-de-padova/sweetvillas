package com.nimesia.sweetvillas.services;

import com.nimesia.sweetvillas.dao.StoreDAO;
import com.nimesia.sweetvillas.models.StoreEntity;
import com.nimesia.sweetvillas.dao.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StoreService extends AbsService {

    @Autowired
    private StoreRepository repository;
    @Autowired
    private StoreDAO dao;

    public StoreEntity get(Integer id) {
        return repository.findById(id);
    }

    public List<StoreEntity> search(String str, Integer cityId, Integer page, Integer limit) {
        return dao.search(str, cityId, page, limit);
    }

    public StoreEntity save(StoreEntity store) { return repository.save(store); }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}