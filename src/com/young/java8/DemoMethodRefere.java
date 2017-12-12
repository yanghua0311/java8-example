package com.young.java8;

import java.util.function.Supplier;

public class DemoMethodRefere {
	static String get() {
		return "young";
	}

	String getForNew() {
		return "young";
	}

	static void test() {
		DemoMethodRefere de = new DemoMethodRefere();
		Supplier<String> sup = de::getForNew; // 实例方法引用
		// Supplier<String> sup = DemoMethodRefere::get; //静态方法引用
		System.out.println(sup.get());
		FunctionInDEmo fun = (str, dou) -> {
			return Integer.valueOf(str) + dou.intValue(); // 自定义函数式接口
		};
		System.out.println(fun.toInt("1111", 66.99));
	}

	public static void main(String[] args) {
		test();
	}
}
