package com.hx.entity;

/**
 * 房子实体类
 */
public class Home {
    private int h_id;
    private String h_way;
    private String h_ms ;
    private String h_type;
    private String h_direction;
    private String h_address1;
    private String h_address2;
    private String h_address3;
    private double h_money ;
    private String h_buyway;
    private String h_msg;
    private String h_hostmsg;
    public Home(){

    }

    public Home(int h_id, String h_way, String h_ms, String h_type, String h_direction, String h_address1, String h_address2, String h_address3, double h_money, String h_buyway, String h_msg, String h_hostmsg) {
        this.h_id = h_id;
        this.h_way = h_way;
        this.h_ms = h_ms;
        this.h_type = h_type;
        this.h_direction = h_direction;
        this.h_address1 = h_address1;
        this.h_address2 = h_address2;
        this.h_address3 = h_address3;
        this.h_money = h_money;
        this.h_buyway = h_buyway;
        this.h_msg = h_msg;
        this.h_hostmsg = h_hostmsg;
    }

    public int getH_id() {
        return h_id;
    }

    public void setH_id(int h_id) {
        this.h_id = h_id;
    }

    public String getH_way() {
        return h_way;
    }

    public void setH_way(String h_way) {
        this.h_way = h_way;
    }

    public String getH_ms() {
        return h_ms;
    }

    public void setH_ms(String h_ms) {
        this.h_ms = h_ms;
    }

    public String getH_type() {
        return h_type;
    }

    public void setH_type(String h_type) {
        this.h_type = h_type;
    }

    public String getH_direction() {
        return h_direction;
    }

    public void setH_direction(String h_direction) {
        this.h_direction = h_direction;
    }

    public String getH_address1() {
        return h_address1;
    }

    public void setH_address1(String h_address1) {
        this.h_address1 = h_address1;
    }

    public String getH_address2() {
        return h_address2;
    }

    public void setH_address2(String h_address2) {
        this.h_address2 = h_address2;
    }

    public String getH_address3() {
        return h_address3;
    }

    public void setH_address3(String h_address3) {
        this.h_address3 = h_address3;
    }

    public double getH_money() {
        return h_money;
    }

    public void setH_money(double h_money) {
        this.h_money = h_money;
    }

    public String getH_buyway() {
        return h_buyway;
    }

    public void setH_buyway(String h_buyway) {
        this.h_buyway = h_buyway;
    }

    public String getH_msg() {
        return h_msg;
    }

    public void setH_msg(String h_msg) {
        this.h_msg = h_msg;
    }

    public String getH_hostmsg() {
        return h_hostmsg;
    }

    public void setH_hostmsg(String h_hostmsg) {
        this.h_hostmsg = h_hostmsg;
    }
}
