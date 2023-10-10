package CarBooking.Model.dao;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import CarBooking.Model.Spot;

public class SpotDBManagerTest {
    SpotDBManager spotDBManager;

    public SpotDBManagerTest() throws SQLException, ClassNotFoundException {
        TestDBConnector db;
        spotDBManager = new SpotDBManager();

    }

    @Test
    void addSpot(){
        try {
            Spot testSpot = new Spot("UTS", 1.5, 10.0, 14.0, 20, 100, 500, 1, 0);
            spotDBManager.addSpot(testSpot);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
