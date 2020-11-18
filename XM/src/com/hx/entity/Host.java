package com.hx.entity;

/**
 * 房东实体类
 */
public class Host {
    private int f_id ;
    private String f_name ;
    private String f_jiyi ;
    private String f_company;
    private  int home_id ;
    private long f_phone ;

    public Host(){

    }

    public Host(int f_id, String f_name, String f_jiyi, String f_company, int home_id, long f_phone) {
        this.f_id = f_id;
        this.f_name = f_name;
        this.f_jiyi = f_jiyi;
        this.f_company = f_company;
        this.home_id = home_id;
        this.f_phone = f_phone;
    }

    public int getF_id() {
        return f_id;
    }

    public void setF_id(int f_id) {
        this.f_id = f_id;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getF_jiyi() {
        return f_jiyi;
    }

    public void setF_jiyi(String f_jiyi) {
        this.f_jiyi = f_jiyi;
    }

    public String getF_company() {
        return  f_company;
    }

    public void setF_company (String f_company) {
        this.f_company = f_company;
    }

    public int getHome_id() {
        return home_id;
    }

    public void setHome_id(int home_id) {
        this.home_id = home_id;
    }

    public long getF_phone() {
        return f_phone;
    }

    public void setF_phone(long f_phone) {
        this.f_phone = f_phone;
    }
}
