package com.nimesia.sweetvillas.dao;

import com.nimesia.sweetvillas.entities.StoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
public interface StoreRepository extends JpaRepository  <StoreEntity, String>{

    @Query("SELECT s FROM StoreEntity s LEFT JOIN FETCH s.products WHERE s.id = :id")
    StoreEntity findById(Integer id);

    @Transactional
    @Modifying
    @Query("delete from StoreEntity s where s.id = :id")
    void deleteById(Integer id);
}

