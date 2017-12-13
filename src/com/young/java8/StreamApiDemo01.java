package com.young.java8;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiDemo01 {
	// 通过数组创建stream
	static void gen1() {
		String[] arrStr = { "a", "b", "1", "2" };
		Stream<String> strStream = Stream.of(arrStr);
		strStream.forEach(System.out::println);
	}

	// 通过generate生成流，通过Supplier<T> 接受一个参数
	static void gen2() {
		Stream<Integer> intStream = Stream.generate(() -> 1);
		intStream.limit(10).forEach(System.out::println);
	}

	// 通过iterate生成流，通过Function<T,R> 输入一个参数，输出一个参数
	static void gen3() {
		Stream<Integer> stream = Stream.iterate(1, x -> x + 1);
		stream.limit(10).forEach(System.out::println);
	}

	static void gen5() throws Exception {
		String str = "abcd";
		IntStream stream = str.chars();
		// stream.forEach(x -> System.out.println(x));
		stream.forEach(System.out::println); // a到z的ASCII码值分别为97到到122

		Files.lines(Paths.get("G:/java相关学习资料/App.java")).forEach(System.out::println);
	}

	public static void main(String[] args) throws Exception {
		// gen1();
		// gen3();
		// gen5();
		getOushu();
		String str = "11,22,33,44,55";
		int sum  = Stream.of(str.split(",")).peek(System.out::println).mapToInt(Integer::valueOf).sum();
		System.out.println(sum);
		sortDemo();
	}
	//// 找出1-100里面的所有的质数，放到list中去 filter应用
	static void getOushu() {
		Stream<Integer> intStream = Stream.iterate(2, i -> i + 1);
		List<Integer> intList = intStream.limit(99).filter(x -> {
			for (int i = 2; i < x; i++) {
				if (x % i == 0)
					return false;
			}
			return true;
		}).collect(Collectors.toList());
		//intList.forEach(System.out::println);
	}
	//sort的应用，自定义sort实现Comparator<? super T> comparator
	static void sortDemo(){
		Arrays.asList("1","aaa","bbb","2","12").stream().sorted((o1,o2)->o2.length()-o1.length()).forEach(System.out::println);;	
	}
	
}
