package com.hx.entity;

/**
 * 用户实体类
 */
public class User {
    private int u_id ;
    private Long u_num;
    private String u_name;
    private String u_password ;
    private Long u_phone ;

    public User(){

    }


    public User(int u_id, Long u_num, String u_name, String u_password, Long u_phone) {
        this.u_id = u_id;
        this.u_num = u_num;    //账号
        this.u_name = u_name;  //用户名
        this.u_password = u_password;   //密码
        this.u_phone = u_phone;   //手机
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public Long getU_num() {
        return u_num;
    }

    public void setU_num(Long u_num) {
        this.u_num = u_num;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_password() {
        return u_password;
    }

    public void setU_password(String u_password) {
        this.u_password = u_password;
    }

    public Long getU_phone() {
        return u_phone;
    }

    public void setU_phone(Long u_phone) {
        this.u_phone = u_phone;
    }

}
