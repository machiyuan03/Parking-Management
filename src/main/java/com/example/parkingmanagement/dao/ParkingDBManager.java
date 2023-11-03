package com.example.parkingmanagement.dao;

import com.example.parkingmanagement.model.Parking;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ParkingDBManager {
    @Select("SELECT * FROM parking WHERE user_id = #{user_id}")
    List<Parking> getParkingById(@Param("user_id") int user_id);
}