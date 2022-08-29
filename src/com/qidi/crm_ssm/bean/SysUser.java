package com.qidi.crm_ssm.bean;

public class SysUser {
	private int user_id;//id
	private String user_code;//账号名
	private String user_password;//密码
	private String user_name;//昵称
	private String user_state; //状态  0正常  1暂停
	public SysUser(int user_id, String user_code, String user_password, String user_name, String user_state) {
		super();
		this.user_id = user_id;
		this.user_code = user_code;
		this.user_password = user_password;
		this.user_name = user_name;
		this.user_state = user_state;
	}
	public SysUser() {
		super();
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_code() {
		return user_code;
	}
	public void setUser_code(String user_code) {
		this.user_code = user_code;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_state() {
		return user_state;
	}
	public void setUser_state(String user_state) {
		if(user_state.equals("0")) {
			this.user_state = "可用";
		}else if(user_state.equals("1")){
			this.user_state = "停用";
		}else if(user_state.equals("可用")) {
			this.user_state = "0";
		}else if(user_state.equals("停用")) {
			this.user_state = "1";
		}
		
	}
	@Override
	public String toString() {
		return "SysUser [user_id=" + user_id + ", user_code=" + user_code + ", user_password=" + user_password
				+ ", user_name=" + user_name + ", user_state=" + user_state + "]";
	}
}
