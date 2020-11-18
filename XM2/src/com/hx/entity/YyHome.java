package com.hx.entity;

/**
 * 房屋订单预约实体类
 * @author bear
 *
 */
public class YyHome {
	private int y_id ;
	private String y_type ;
	private String y_direction ;
	private String y_address1 ;
	private String y_address2 ;
	private String y_address3 ;
	private String user_id ;
	
	private User user ;

	public YyHome() {
		super();
		// TODO Auto-generated constructor stub
	}

	public YyHome(int y_id, String y_type, String y_direction, String y_address1, String y_address2, String y_address3,
			String user_id, User user) {
		super();
		this.y_id = y_id;
		this.y_type = y_type;
		this.y_direction = y_direction;
		this.y_address1 = y_address1;
		this.y_address2 = y_address2;
		this.y_address3 = y_address3;
		this.user_id = user_id;
		this.user = user;
	}

	public int getY_id() {
		return y_id;
	}

	public void setY_id(int y_id) {
		this.y_id = y_id;
	}

	public String getY_type() {
		return y_type;
	}

	public void setY_type(String y_type) {
		this.y_type = y_type;
	}

	public String getY_direction() {
		return y_direction;
	}

	public void setY_direction(String y_direction) {
		this.y_direction = y_direction;
	}

	public String getY_address1() {
		return y_address1;
	}

	public void setY_address1(String y_address1) {
		this.y_address1 = y_address1;
	}

	public String getY_address2() {
		return y_address2;
	}

	public void setY_address2(String y_address2) {
		this.y_address2 = y_address2;
	}

	public String getY_address3() {
		return y_address3;
	}

	public void setY_address3(String y_address3) {
		this.y_address3 = y_address3;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
