package com.nimesia.sweetvillas.dao;

import com.nimesia.sweetvillas.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {

    @Query("select u from UserEntity u join AccountEntity a on u.account.id = a.id where a.email = :email")
    public Optional<UserEntity> getByAccountEmail(String email);

    public void deleteById(String id);

    public Optional<UserEntity> getByFiscalCode(String fiscalCode);


}