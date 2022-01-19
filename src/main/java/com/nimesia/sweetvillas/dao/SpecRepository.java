package com.nimesia.sweetvillas.dao;

import com.nimesia.sweetvillas.entities.SpecEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SpecRepository extends JpaRepository<SpecEntity, String> {

}