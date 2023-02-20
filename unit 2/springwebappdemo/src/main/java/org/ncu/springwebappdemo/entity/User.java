package org.ncu.springwebappdemo.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String userName;
	private String userPassword;
	private String aadharId;
	private String state;
	private String gender;
	private List<String> otherOptions;
	private String address;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getAadharId() {
		return aadharId;
	}
	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<String> getOtherOptions() {
		return otherOptions;
	}
	public void setOtherOptions(List<String> otherOptions) {
		this.otherOptions = otherOptions;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userPassword=" + userPassword + ", aadharId=" + aadharId + ", state="
				+ state + ", gender=" + gender + ", otherOptions=" + otherOptions + ", address=" + address + "]";
	}
	
}
