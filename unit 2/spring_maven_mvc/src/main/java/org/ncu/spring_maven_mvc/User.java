package org.ncu.spring_maven_mvc;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
import org.ncu.spring_maven_mvc.validation.CourseCode;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class User {
	@NotNull(message="is required")
	@Size(min=2, message="is required")
	private String userName;
	
	@NotNull(message="is required")
	@Pattern(regexp="^[a-zA-Z0-9]{5,30}", message="only char/digit allowed")
	private String password;
	
	  @Min(value=0, message="must be greater than or equal to zero")
	  @Max(value=10, message="must be less than or equal to ten")
	private String rollNo;
	
	@Email(message="invalid email")
	@NotEmpty(message=" is required")
	private String email;
	
	@DateTimeFormat(iso = ISO.DATE)
	@NotNull(message="is required")
	@Past
	private Date date;
	
	@CourseCode()
	private String courseCode;
	
	
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
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
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
}
