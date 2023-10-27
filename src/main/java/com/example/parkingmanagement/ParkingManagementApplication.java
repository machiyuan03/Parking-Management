package com.example.parkingmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class ParkingManagementApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(ParkingManagementApplication.class, args);
        Environment environment = configurableApplicationContext.getBean(Environment.class);
        System.out.println("\n\n ============> The system started successfully! Please visit:http://localhost:" + environment.getProperty("server.port")
                + "/spot_management.html");
    }

}
