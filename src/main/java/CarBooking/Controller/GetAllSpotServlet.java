package CarBooking.Controller;

import CarBooking.Model.Spot;
import CarBooking.Model.dao.SpotDBManager;
import com.alibaba.fastjson.JSON;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.List;


@WebServlet(name = "GetAllSpotServlet", value = "/getAllSpot")
public class GetAllSpotServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp){
        try{
            SpotDBManager spotDBManager = new SpotDBManager();
            List<Spot> allSpots = spotDBManager.readAllSpot();
            String allSpotJson = JSON.toJSONString(allSpots);

            resp.setCharacterEncoding("UTF-8");
            resp.setContentType("application/json");
            resp.getWriter().write(allSpotJson);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
