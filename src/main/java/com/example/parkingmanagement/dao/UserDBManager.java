package com.example.parkingmanagement.dao;

import com.example.parkingmanagement.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDBManager {
    @Insert("INSERT INTO users (username, password, email, first_name, last_name) VALUES (#{username}, #{password}, #{email}, #{firstName}, #{lastName})")
    void addUser(User user);

    @Select("SELECT * FROM users WHERE username = #{username}")
    User findByUsername(@Param("username") String username);

    @Select("SELECT * FROM users WHERE username = #{username} AND password = #{password}")
    User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
