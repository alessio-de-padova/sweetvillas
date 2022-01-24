package com.nimesia.sweetvillas.dao;

import com.nimesia.sweetvillas.entities.AccountEntity;
import com.nimesia.sweetvillas.entities.UserEntity;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {

    @Query("select u from UserEntity u join AccountEntity a on u.account.id = a.id where a.email = :email")
    public UserEntity getByAccountEmail(String email);

    @Query("delete from UserEntity u where u.id = :id")
    public void deleteById(String id);
}