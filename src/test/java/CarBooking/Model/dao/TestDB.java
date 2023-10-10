package CarBooking.Model.dao;

import java.sql.*;

public abstract class TestDB {
    protected String driver = "org.sqlite.JDBC";
    protected String url = "jdbc:sqlite:D:\\Github repo\\Parking-Management\\TestDB.db";

    protected Connection conn;
}