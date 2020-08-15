package com.jiten.springdemo.domain;

public class User {
	public User() {
	}

	public User(int age, String fullName) {
		super();
		this.age = age;
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	private int age;
	private String fullName;

}
