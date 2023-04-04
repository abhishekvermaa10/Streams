package com.scaleupindia;

import java.util.Random;
import java.util.stream.Stream;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo2 {
	public static void main(String[] args) {
		System.out.println("---STREAM FROM ARRAY---");
		Integer[] array = { 20, 30, 10 };
		Stream<Integer> stream = Stream.of(array);
		stream.forEach(System.out::println);

		System.out.println("---STREAM FROM RAW DATA---");
		Stream<Integer> stream1 = Stream.of(20, 30, 10);
		stream1.forEach(System.out::println);

		System.out.println("---STREAM FROM GENERATE---");
		Stream<Integer> stream2 = Stream.generate(() -> new Random().nextInt()).limit(3);
		stream2.forEach(System.out::println);

		System.out.println("---STREAM FROM ITERATE---");
		Stream<Integer> stream3 = Stream.iterate(1, i -> i + 1).limit(3);
		stream3.forEach(System.out::println);

		System.out.println("---EMPTY STREAM---");
		Stream<Integer> stream4 = Stream.empty();
		stream4.forEach(System.out::println);
	}
}