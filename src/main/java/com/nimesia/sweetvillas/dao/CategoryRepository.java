package com.nimesia.sweetvillas.dao;

import com.nimesia.sweetvillas.models.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
public interface CategoryRepository extends JpaRepository  <CategoryEntity, String>{

    CategoryEntity findById(Integer id);

    @Transactional
    @Modifying
    @Query("delete from CategoryEntity c where c.id = :id")
    void deleteById(Integer id);
}

