package CarBooking.Controller;

import CarBooking.Model.Spot;
import CarBooking.Model.dao.SpotDBManager;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "DeleteSpotServlet", value = "/deleteSpot")
public class DeleteSpotServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp){
        try{

            int id = Integer.parseInt(req.getParameter("id"));

            SpotDBManager spotDBManager = new SpotDBManager();
            spotDBManager.deleteSpot(id);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
