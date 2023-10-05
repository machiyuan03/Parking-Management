package CarBooking.Model.dao;
import java.sql.*;

public abstract class DB {
    protected String driver = "org.sqlite.JDBC";
    protected String url = "jdbc:sqlite:E:\\Git Codes\\Parking-Management\\ASD_DB.db";
    protected Connection conn;
}