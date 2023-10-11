package CarBooking.Model.dao;

import CarBooking.Model.Spot;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.util.List;

public class SpotDBManagerTest {

    SpotDBManager spotDBManager;

    public SpotDBManagerTest() throws SQLException, ClassNotFoundException {
        spotDBManager = new SpotDBManager();

    }

    @org.junit.jupiter.api.Test
    public void testAddSpot() throws Exception {
        Spot testSpot = new Spot("UTS", 1.5, 10.0, 14.0, 20, 100, 500, 1, 0);
        spotDBManager.addSpot(testSpot);

        // Retrieve all spots from the database
        List<Spot> spots = spotDBManager.readAllSpot();

        // Make sure the list isn't empty
        assertFalse(spots.isEmpty(), "The list of spots is empty");

        // Get the last spot in the list, assuming this is the one just added
        Spot lastRetrievedSpot = spots.get(spots.size() - 1);

        // Now you would compare the fields one by one since you may not have an 'equals' method in your Spot class
        assertEquals(testSpot.getLocation(), lastRetrievedSpot.getLocation(), "Locations are not equal");
    }
}
