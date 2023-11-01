package com.example.parkingmanagement.service;

import com.example.parkingmanagement.dao.PassDBManager;
import com.example.parkingmanagement.model.Pass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassService {

    @Autowired
    private PassDBManager passDBManager;

    public List<Pass> getAllPasses() {
        return passDBManager.getAllPasses();
    }

    public Pass getPassById(int passId) {
        return passDBManager.getPassById(passId);
    }
}

