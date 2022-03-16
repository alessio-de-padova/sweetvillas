package com.nimesia.sweetvillas.services;

import com.nimesia.sweetvillas.entities.ProductEntity;
import com.nimesia.sweetvillas.dao.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProductService extends AbsService {

    @Autowired
    private ProductRepository repository;

    public ProductEntity get(Integer id) {
        return repository.findById(id);
    }

    public ProductEntity save(ProductEntity store) { return repository.save(store); }



}
