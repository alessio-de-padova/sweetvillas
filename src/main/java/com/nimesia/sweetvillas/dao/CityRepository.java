package com.nimesia.sweetvillas.dao;

import com.nimesia.sweetvillas.models.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository  <CityEntity, String>{

    CityEntity findById(Integer id);

}

