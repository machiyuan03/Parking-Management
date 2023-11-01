package com.example.parkingmanagement.model;

public class Pass {
    private int pass_id;
    private String pass_type;
    private Integer total_duration;

    public Pass(int pass_id, String pass_type, Integer total_duration) {
        this.pass_id = pass_id;
        this.pass_type = pass_type;
        this.total_duration = total_duration;
    }

    public Pass() {
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
}
