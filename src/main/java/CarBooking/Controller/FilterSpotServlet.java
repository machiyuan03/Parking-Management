package CarBooking.Controller;

import CarBooking.Model.Spot;
import CarBooking.Model.dao.SpotDBManager;
import com.alibaba.fastjson.JSON;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.List;


@WebServlet(name = "FilterSpotServlet", value = "/filterSpotServlet")
public class FilterSpotServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp){
        try{
            int passAvailable = Integer.parseInt(req.getParameter("passAvailable"));
            int discountAvailable = Integer.parseInt(req.getParameter("discountAvailable"));

            SpotDBManager spotDBManager = new SpotDBManager();
            List<Spot> allSpots = spotDBManager.filterByType(passAvailable, discountAvailable);
            String allSpotJson = JSON.toJSONString(allSpots);

            resp.setCharacterEncoding("UTF-8");
            resp.setContentType("application/json");
            resp.getWriter().write(allSpotJson);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
