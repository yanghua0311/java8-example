package com.young.java8.test;

import com.young.java8.pojo.User;

public class StaticDemo {
	public static  User user=new User();
	
	public static void main(String[] args) {
		System.out.println(user);
		user=new User();
		System.out.println(user);
	}
}
