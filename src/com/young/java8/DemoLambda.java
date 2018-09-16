package com.young.java8;

import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class DemoLambda {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	static void test() {
		
		// ���һ������
		Supplier<String> sup = () -> "youngwa";
		System.out.println(sup.get());

		// ����һ���������
		Consumer<String> consumer = str -> {
			System.out.println(str);
		};
		consumer.accept("youngwa");

		// ���������������
		BiConsumer<Integer, String> bicon = (in, str) -> {
			System.out.println(in.toString() + str);
		};
		bicon.accept(21, "young");

		// һ�����������һ���������
		Function<Integer, Integer> fun = a -> {
			int sum = 0;
			for (int i = 1; i <= a; i++) {
				sum += i;
			}
			return sum;
		};
		System.out.println(fun.apply(10));

		// ��������������һ���������������ʵ������һЩת������code��
		BiFunction<Integer, Long, String> parse = (id, code) -> {
			return id.toString() + "��" + code.toString();
		};
		String co = parse.apply(10, 200L);
		System.out.println(co);
	}

	public static void main(String[] args) {
		Map<Long, Long> countMap = new TreeMap<>();
		countMap.put(1l, 2l);
		countMap.put(2l, 9l);
		countMap.put(3l, 4l);
		countMap.put(4l, 6l);
		for (Map.Entry<Long, Long> value : countMap.entrySet()) {
			System.out.println(value);
		}
	
	}
}
