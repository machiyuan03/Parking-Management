package com.example.parkingmanagement.dao;

import com.example.parkingmanagement.model.PassWithDetails;
import com.example.parkingmanagement.model.UserPass;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

@Mapper
public interface UserPassDBManager {
    @Select("INSERT INTO user_passes(user_id, pass_id, purchase_date, expiry_date) VALUES (#{userId}, #{passId}, #{purchaseDate}, #{expiryDate})")
    void purchasePass(@Param("userId") int userId, @Param("passId") int passId, @Param("purchaseDate") Date purchaseDate, @Param("expiryDate") Date expiryDate);

    @Select("SELECT * FROM user_passes WHERE user_id = #{userId}")
    List<UserPass> getUserPasses(@Param("userId") int userId);

    @Select("SELECT p.*, up.purchase_date, up.expiry_date "
            + "FROM user_passes up "
            + "JOIN passes p ON up.pass_id = p.pass_id "
            + "WHERE up.user_id = #{userId}")
    List<PassWithDetails> getUserPassDetails(@Param("userId") int userId);
}
