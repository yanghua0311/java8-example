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
		Supplier<String> sup = de::getForNew; // ʵ����������
		// Supplier<String> sup = DemoMethodRefere::get; //��̬��������
		System.out.println(sup.get());
		FunctionInDEmo fun = (str, dou) -> {
			return Integer.valueOf(str) + dou.intValue(); // �Զ��庯��ʽ�ӿ�
		};
		System.out.println(fun.toInt("1111", 66.99));
	}

	public static void main(String[] args) {
		test();
	}
}
