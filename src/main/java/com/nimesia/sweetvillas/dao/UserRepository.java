package com.nimesia.sweetvillas.dao;

import com.nimesia.sweetvillas.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {

}