package CarBooking.Controller;

import CarBooking.Model.Spot;
import CarBooking.Model.dao.SpotDBManager;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "AdjustSpotServlet", value = "/adjustSpot")
public class AdjustSpotServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp){
        try{

            String location = req.getParameter("location");
            double priceRatePH = Double.parseDouble(req.getParameter("priceRatePH"));
            double priceRatePD = Double.parseDouble(req.getParameter("priceRatePD"));
            double priceRateON = Double.parseDouble(req.getParameter("priceRateON"));
            int sSpot = Integer.parseInt(req.getParameter("sSpot"));
            int mSpot = Integer.parseInt(req.getParameter("mSpot"));
            int lSpot = Integer.parseInt(req.getParameter("lSpot"));
            int passAvailable = Integer.parseInt(req.getParameter("passAvailable"));
            int discountAvailable = Integer.parseInt(req.getParameter("discountAvailable"));

            Spot spot = new Spot(location, priceRatePH, priceRatePD, priceRateON,
                    sSpot, mSpot, lSpot, passAvailable, discountAvailable);
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
