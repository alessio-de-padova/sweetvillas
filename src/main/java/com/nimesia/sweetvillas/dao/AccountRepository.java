package com.nimesia.sweetvillas.dao;

import com.nimesia.sweetvillas.entities.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountRepository extends JpaRepository  <AccountEntity, String>{

    public AccountEntity findById(Integer id);

}

