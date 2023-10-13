package CarBooking.Model.dao;
import java.sql.*;

public abstract class DB {
    protected String driver = "org.sqlite.JDBC";
    protected String url = "jdbc:sqlite::resource:ASD_DB.db";
    protected Connection conn;
}