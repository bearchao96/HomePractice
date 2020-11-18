package com.hx.entity;

public class Picture {
    private int p_id ;
    private String p_address1 ;
    private String p_address2 ;
    private String p_address3;
    private int home_id ;

    public Picture(){

    }

    public Picture(int p_id, String p_address1, String p_address2, String p_address3, int home_id) {
        this.p_id = p_id;
        this.p_address1 = p_address1;
        this.p_address2 = p_address2;
        this.p_address3 = p_address3;
        this.home_id = home_id;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getP_address1() {
        return p_address1;
    }

    public void setP_address1(String p_address1) {
        this.p_address1 = p_address1;
    }

    public String getP_address2() {
        return p_address2;
    }

    public void setP_address2(String p_address2) {
        this.p_address2 = p_address2;
    }

    public String getP_address3() {
        return p_address3;
    }

    public void setP_address3(String p_address3) {
        this.p_address3 = p_address3;
    }

    public int getHome_id() {
        return home_id;
    }

    public void setHome_id(int home_id) {
        this.home_id = home_id;
    }
}
