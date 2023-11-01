package com.example.parkingmanagement.model;

import java.util.Date;

public class PassWithDetails {
    private int pass_id;
    private String pass_type;
    private Integer total_duration;
    private Date purchase_date;
    private Date expiry_date;

    public PassWithDetails(int pass_id, String pass_type, Integer total_duration, Date purchase_date, Date expiry_date) {
        this.pass_id = pass_id;
        this.pass_type = pass_type;
        this.total_duration = total_duration;
        this.purchase_date = purchase_date;
        this.expiry_date = expiry_date;
    }

    public PassWithDetails() {
    }

    public int getPass_id() {
        return pass_id;
    }

    public void setPass_id(int pass_id) {
        this.pass_id = pass_id;
    }

    public String getPass_type() {
        return pass_type;
    }

    public void setPass_type(String pass_type) {
        this.pass_type = pass_type;
    }

    public Integer getTotal_duration() {
        return total_duration;
    }

    public void setTotal_duration(Integer total_duration) {
        this.total_duration = total_duration;
    }

    public Date getPurchase_date() {
        return purchase_date;
    }

    public void setPurchase_date(Date purchase_date) {
        this.purchase_date = purchase_date;
    }

    public Date getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(Date expiry_date) {
        this.expiry_date = expiry_date;
    }
}
