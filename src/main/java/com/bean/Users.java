package com.bean;

import org.springframework.stereotype.Component;

@Component
public class Users {
private Integer user_Id;
private String user_name;
private String user_pwd;
private String user_role;
private String user_status;
public Integer getUser_Id() {
	return user_Id;
}
public void setUser_Id(Integer user_Id) {
	this.user_Id = user_Id;
}
public String getUser_name() {
	return user_name;
}
@Override
public String toString() {
	return "Users [user_Id=" + user_Id + ", user_name=" + user_name + ", user_pwd=" + user_pwd + ", user_role="
			+ user_role + ", user_status=" + user_status + "]";
}
public void setUser_name(String user_name) {
	this.user_name = user_name;
}
public String getUser_pwd() {
	return user_pwd;
}
public void setUser_pwd(String user_pwd) {
	this.user_pwd = user_pwd;
}
public String getUser_role() {
	return user_role;
}
public void setUser_role(String user_role) {
	this.user_role = user_role;
}
public String getUser_status() {
	return user_status;
}
public void setUser_status(String user_status) {
	this.user_status = user_status;
}
}
