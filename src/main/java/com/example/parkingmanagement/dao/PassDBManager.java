package com.example.parkingmanagement.dao;

import com.example.parkingmanagement.model.Pass;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PassDBManager {
    @Select("SELECT * FROM passes")
    List<Pass> getAllPasses();

    @Select("SELECT * FROM passes WHERE pass_id = #{passId}")
    Pass getPassById(@Param("passId") int passId);
}
