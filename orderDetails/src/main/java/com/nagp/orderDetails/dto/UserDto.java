package com.nagp.orderDetails.dto;

public class UserDto {
	private String name;
	private String age;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public UserDto(String name,String age,String email) {
		this.name = name;
		this.age = age;
		this.email = email;
	}
	
	public UserDto() {
		this.name = "John";
		this.age = "23";
		this.email = "john.doe@google.com";
	}
}
