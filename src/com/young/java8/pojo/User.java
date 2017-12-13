package com.young.java8.pojo;

public class User {
	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + "]";
	}
	private Integer age;
	private String name;

	public User(Integer age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public User( String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
