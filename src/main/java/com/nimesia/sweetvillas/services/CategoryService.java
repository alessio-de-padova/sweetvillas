package com.nimesia.sweetvillas.services;

import com.nimesia.sweetvillas.entities.CategoryEntity;
import com.nimesia.sweetvillas.dao.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CategoryService extends AbsService {

    @Autowired
    private CategoryRepository repository;

    public CategoryEntity get(Integer id) {
        return repository.findById(id);
    }

    public CategoryEntity save(CategoryEntity category) { return repository.save(category); }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

}
