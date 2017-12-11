package com.young.java8;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class DemoLambda {

	static void test() {
		// 输出一个参数
		Supplier<String> sup = () -> "youngwa";
		System.out.println(sup.get());

		// 消费一个输入参数
		Consumer<String> consumer = str -> {
			System.out.println(str);
		};
		consumer.accept("youngwa");

		// 消费两个输入参数
		BiConsumer<Integer, String> bicon = (in, str) -> {
			System.out.println(in.toString() + str);
		};
		bicon.accept(21, "young");

		// 一个输入参数，一个输出参数
		Function<Integer, Integer> fun = a -> {
			int sum = 0;
			for (int i = 1; i <= a; i++) {
				sum += i;
			}
			return sum;
		};
		System.out.println(fun.apply(10));

		// 接受两个参数，一个输入参数，可以实现生成一些转型生成code，
		BiFunction<Integer, Long, String> parse = (id, code) -> {
			return id.toString() + "和" + code.toString();
		};
		String co = parse.apply(10, 200L);
		System.out.println(co);
	}

	public static void main(String[] args) {
		test();
	}
}
