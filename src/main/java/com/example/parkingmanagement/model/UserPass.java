package com.example.parkingmanagement.model;

import java.util.Date;

public class UserPass {
    private int user_pass_id;
    private int user_id;
    private int pass_id;
    private Date purchase_date;
    private Date expiry_date;

    public UserPass(int user_pass_id, int user_id, int pass_id, Date purchase_date, Date expiry_date) {
        this.user_pass_id = user_pass_id;
        this.user_id = user_id;
        this.pass_id = pass_id;
        this.purchase_date = purchase_date;
        this.expiry_date = expiry_date;
    }

    public UserPass() {
    }

    public int getUser_pass_id() {
        return user_pass_id;
    }

    public void setUser_pass_id(int user_pass_id) {
        this.user_pass_id = user_pass_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getPass_id() {
        return pass_id;
    }

    public void setPass_id(int pass_id) {
        this.pass_id = pass_id;
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
