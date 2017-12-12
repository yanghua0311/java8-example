package com.young.java8;

public class ProviderDemo {

	static void test() {
		VaadinProviderDemo<String, Integer> demo = str -> str.length();
		System.out.println(demo.apply("1111111"));
	}

	static Integer column(VaadinProviderDemo<String, Integer> vaadin) {
		return vaadin.apply("sssssss");
	}

	public static void main(String[] args) {
		test();
		System.out.println(column(String::length));
	}
}
