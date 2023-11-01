package com.example.parkingmanagement.model;

import java.util.Date;

public class PurchaseRequest {
    private int passId;
    private Date purchaseDate;

    public int getPassId() {
        return passId;
    }

    public void setPassId(int passId) {
        this.passId = passId;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}
