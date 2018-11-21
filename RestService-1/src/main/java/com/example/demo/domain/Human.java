package com.example.demo.domain;

public class Human {
	
	private String name;
	private String age;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
}
