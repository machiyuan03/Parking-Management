package com.example.parkingmanagement;

import com.example.parkingmanagement.model.Spot;
import com.example.parkingmanagement.model.UserPass;
import com.example.parkingmanagement.service.UserPassService;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PassTest {
    @Autowired
    private UserPassService userPassService;

    @Order(1)
    @Test
    public void test1BuyPass() {
        UserPass userPass = new UserPass();
        userPass.setUser_id(1);
        userPass.setPass_id(1);
        userPass.setPurchase_date(new Date());
        userPassService.purchasePass(userPass.getUser_id(),userPass.getPass_id(),userPass.getPurchase_date());
    }
}
