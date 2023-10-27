package com.example.parkingmanagement.dao;

import com.example.parkingmanagement.model.Spot;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SpotDBManager {
    @Insert("INSERT INTO spots (Location, PriceRatePH, PriceRatePD, PriceRateON, SSpot, MSpot, LSpot, PassAvailable, DiscountAvailable) VALUES (#{location}, #{priceRatePH}, #{priceRatePD}, #{priceRateON}, #{sSpot}, #{mSpot}, #{lSpot}, #{passAvailable}, #{discountAvailable})")
    void addSpot(Spot spot);

    @Select("SELECT * FROM spots")
    List<Spot> readAllSpot();

    @Select("SELECT * FROM spots WHERE ID = #{id}")
    Spot findSpotById(@Param("id") int id);

    @Select("SELECT * FROM spots WHERE PassAvailable = #{passAvailable} AND DiscountAvailable = #{discountAvailable}")
    List<Spot> filterByType(@Param("passAvailable") Integer PassAvailable, @Param("discountAvailable") Integer DiscountAvailable);

    @Delete("DELETE FROM spots WHERE ID = #{id}")
    void deleteSpot(@Param("id") int id);

    @Update("UPDATE spots Set PriceRatePH = #{priceRatePH}, PriceRatePD = #{priceRatePD}, PriceRateON = #{priceRateON}, SSpot = #{sSpot}, MSpot = #{mSpot}, LSpot = #{lSpot}, PassAvailable = #{passAvailable}, DiscountAvailable = #{discountAvailable} WHERE id = #{id}")
    void adjustSpot(Spot spot);
}
