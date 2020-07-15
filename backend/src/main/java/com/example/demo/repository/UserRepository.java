package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
    @Query(value = "from User where User_Name = :username and Password = :password")
    User checkUser(@Param("username") String username, @Param("password") String password);
    @Query (value="select u from User u WHERE u.User_Name=:username")
    User findUserByUsername(@Param("username") String username);
}
