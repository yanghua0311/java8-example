package com.young.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.young.java8.pojo.User;


/**
 * create by yanghua  2017年12月13日
 *
 */
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
//		userStream.sorted((o1,o2)->o1.getAge()-o2.getAge()).forEach(System.out::println);
	}
	//通过构造方法引用获取User对象的Stream流
	static void parse(){
		String names="tom,jarry,notor,tomas,david"; 
//		Stream.of(names.split(",")).map(User::new).forEach(System.out::println);;
	}
	
	static void reduce(){
		String concat = Stream.of("A", "B", "C", "D").reduce("", String::concat); 
		// 求最小值，minValue = -3.0
		System.out.println(concat);
		double minValue = Stream.of(-1.5, 1.0, -3.0, -2.0).reduce(Double.MAX_VALUE, Double::min); 
		// 求和，sumValue = 10, 有起始值
		System.out.println(minValue);
		int sumValue = Stream.of(1, 2, 3, 4).reduce(0, Integer::sum);
		// 求和，sumValue = 10, 无起始值
		sumValue = Stream.of(1, 2, 3, 4).reduce(Integer::sum).get();
		System.out.println(sumValue);
		// 过滤，字符串连接，concat = "ace"
		concat = Stream.of("a", "B", "c", "D", "e", "F").
		 filter(x -> x.compareTo("Z") > 0).
		 reduce("", String::concat);
		System.out.println(concat);
	}
	
	static void match(){
		String str="c,b,b,aa,cc";
		boolean a=Stream.of(str.split(",")).peek(System.out::println).anyMatch(x->x.length()==1);
		System.out.println(a);
	}
	
	static void mapto(){
		String str="1,2,3,4,";
		int a=Stream.of(str.split(",")).mapToInt(x->Integer.valueOf(x)).sum();
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		//dis();
		//parse();
		//reduce();
		//match();
		mapto();
	}
}
