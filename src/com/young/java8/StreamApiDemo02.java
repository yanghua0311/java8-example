package com.young.java8;

import java.util.Arrays;
import java.util.stream.Stream;

import com.young.java8.pojo.User;

public class StreamApiDemo02 {
	//根据年龄排序
	static void dis(){
		User u1=new User(11,"kakao");
		User u2=new User(11,"tom");
		User u3=new User(13,"mark");
		User u4=new User(11,"david");
		User u5=new User(11,"tomas");
		User u6=new User(11,"tom");
		Stream<User> userStream=Arrays.asList(u1,u2,u3,u4,u5,u6).stream();
		userStream.sorted((o1,o2)->o1.getAge()-o2.getAge()).forEach(System.out::println);
	}
	//通过构造方法引用获取User对象的Stream流
	static void parse(){
		String names="tom,jarry,notor,tomas,david"; 
		Stream.of(names.split(",")).map(User::new).forEach(System.out::println);;
	}
	
	public static void main(String[] args) {
		dis();
		parse();
	}
}
