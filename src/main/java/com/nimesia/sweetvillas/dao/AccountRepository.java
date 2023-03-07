package com.nimesia.sweetvillas.dao;

import com.nimesia.sweetvillas.models.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface AccountRepository extends JpaRepository  <AccountEntity, String>{

    Optional<AccountEntity> findById(Integer id);
    Optional<AccountEntity> findByEmail(String email);

}

