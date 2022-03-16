package com.nimesia.sweetvillas.dao;

import com.nimesia.sweetvillas.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository  <ProductEntity, String>{

    ProductEntity findById(Integer id);

}

