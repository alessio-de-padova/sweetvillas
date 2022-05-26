package com.nimesia.sweetvillas.dao;

import com.nimesia.sweetvillas.models.CartProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CartProductRepository extends JpaRepository  <CartProductEntity, String>{

    @Query("SELECT p FROM CartProductEntity p  WHERE p.id = (:id)")
    CartProductEntity findById(Integer id);

}