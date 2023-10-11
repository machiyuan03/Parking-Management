package CarBooking.Model.dao;

import CarBooking.Model.Spot;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SpotDBManager {
    private final Connection conn;

    public SpotDBManager() throws SQLException, ClassNotFoundException {
        conn = new DBConnector().openConnection();
    }

    public void addSpot(Spot spot) throws SQLException {
        String query = "INSERT INTO Spot (Location, PriceRatePH, PriceRatePD, PriceRateON, SSpot, MSpot, LSpot, PassAvailable, DiscountAvailable) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(query);
//        pstmt.setString(1, spot.getLocation());
        pstmt.setDouble(2, spot.getPriceRatePH());
        pstmt.setDouble(3, spot.getPriceRatePD());
        pstmt.setDouble(4, spot.getPriceRateON());
        pstmt.setInt(5, spot.getsSpot());
        pstmt.setInt(6, spot.getmSpot());
        pstmt.setInt(7, spot.getlSpot());
        pstmt.setInt(8, spot.getPassAvailable());
        pstmt.setInt(9, spot.getDiscountAvailable());

        int result = pstmt.executeUpdate();
        pstmt.close();


    }

    public List<Spot> readAllSpot() throws SQLException {
        List<Spot> spots = new ArrayList<>();
        String query = "SELECT * FROM Spot";
        PreparedStatement pstmt = conn.prepareStatement(query);
        ResultSet result = pstmt.executeQuery();
        while(result.next()){
            Spot spot = new Spot(result.getInt("ID"), result.getString("Location"),
                    result.getDouble("PriceRatePH"), result.getDouble("PriceRatePD"), result.getDouble("PriceRateON"),
                    result.getInt("SSpot"), result.getInt("MSpot"), result.getInt("LSpot"),
                    result.getInt("PassAvailable"), result.getInt("DiscountAvailable"));
            spots.add(spot);
        }
        result.close();
        pstmt.close();
        return spots;
    }

    public List<Spot> filterByType(Integer PassAvailable, Integer DiscountAvailable) throws SQLException {
        if(PassAvailable == null){
            PassAvailable = 0;
        }

        if(DiscountAvailable == null){
            DiscountAvailable = 0;
        }

        List<Spot> spots = new ArrayList<>();
        String query = "SELECT * FROM Spot WHERE PassAvailable = ? AND DiscountAvailable = ?";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setInt(1, PassAvailable);
        pstmt.setInt(2, DiscountAvailable);
        ResultSet result = pstmt.executeQuery();
        while(result.next()){
            Spot spot = new Spot(result.getInt("ID"), result.getString("Location"),
                    result.getDouble("PriceRatePH"), result.getDouble("PriceRatePD"), result.getDouble("PriceRateON"),
                    result.getInt("SSpot"), result.getInt("MSpot"), result.getInt("LSpot"),
                    result.getInt("PassAvailable"), result.getInt("DiscountAvailable"));
            spots.add(spot);
        }
        result.close();
        pstmt.close();
        return spots;

    }

    public void deleteSpot(int id) throws SQLException {
        String query = "DELETE FROM Spot WHERE ID = ?";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setInt(1, id);
        pstmt.executeUpdate();
        pstmt.close();
    }

    public void adjustSpot(Spot spot) throws SQLException {
        String query = "UPDATE Spot Set PriceRatePH = ?, PriceRatePD = ?, PriceRateON = ?," +
                "SSpot = ?, MSpot = ?, LSpot = ?, PassAvailable = ?, DiscountAvailable = ? WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setDouble(1, spot.getPriceRatePH());
        pstmt.setDouble(2, spot.getPriceRatePD());
        pstmt.setDouble(3, spot.getPriceRateON());
        pstmt.setInt(4, spot.getsSpot());
        pstmt.setInt(5, spot.getmSpot());
        pstmt.setInt(6, spot.getlSpot());
        pstmt.setInt(7, spot.getPassAvailable());
        pstmt.setInt(8, spot.getDiscountAvailable());
        pstmt.setInt(9, spot.getId());
        pstmt.executeUpdate();
        pstmt.close();

    }
}
