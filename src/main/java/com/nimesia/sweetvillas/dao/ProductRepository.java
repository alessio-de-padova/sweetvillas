package com.nimesia.sweetvillas.dao;

import com.nimesia.sweetvillas.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository  <ProductEntity, String>{

    @Query("SELECT p FROM ProductEntity p JOIN FETCH p.store WHERE p.id = (:id)")
    ProductEntity findById(Integer id);

}

