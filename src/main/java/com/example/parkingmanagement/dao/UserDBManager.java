package com.example.parkingmanagement.dao;

import com.example.parkingmanagement.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDBManager {
    @Insert("INSERT INTO users (username, password, email, first_name, last_name) VALUES (#{username}, #{password}, #{email}, #{firstName}, #{lastName})")
    void addUser(User user);

    @Select("SELECT * FROM users")
    List<User> getAllUsers();

    @Select("SELECT * FROM users WHERE username = #{username} AND password = #{password}")
    User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    @Update("UPDATE users SET discount_percentage = #{discountPercentage} WHERE user_id = #{userId}")
    void updateDiscountPercentage(@Param("userId") int userId, @Param("discountPercentage") int discountPercentage);
}
