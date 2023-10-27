package com.example.parkingmanagement.dao;

import com.example.parkingmanagement.model.Reservation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ReservationDBManager {
    @Insert("INSERT INTO reservations (spot_id, user_id, start_time, end_time) VALUES (#{spotId}, #{userId}, #{startTime}, #{endTime})")
    void addReservation(Reservation reservation);

    @Select("SELECT * FROM reservations WHERE user_id = #{userId}")
    @ResultMap("reservationMap")
    List<Reservation> getReservationsByUser(@Param("userId") int userId);

    @Select("SELECT * FROM reservations WHERE reservation_id = #{reservationId}")
    @ResultMap("reservationMap")
    Reservation findReservationById(@Param("reservationId") int reservationId);

    @Select("SELECT * FROM reservations")
    @ResultMap("reservationMap")
    List<Reservation> getAllReservations();

    @Update("UPDATE reservations SET spot_id = #{spotId}, user_id = #{userId}, start_time = #{startTime}, end_time = #{endTime} WHERE reservation_id = #{reservationId}")
    void modifyReservation(Reservation reservation);

    @Delete("DELETE FROM reservations WHERE reservation_id = #{reservationId}")
    void deleteReservation(@Param("reservationId") int reservationId);
}
