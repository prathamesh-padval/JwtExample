package com.dev.entity;

public class UserCredentials {  
    private String userName;  
    private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserCredentials [userName=" + userName + ", password=" + password + "]";
	}  


    

}