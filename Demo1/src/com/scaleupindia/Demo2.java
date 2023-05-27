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
		//Create a stream from given array and print the elements
		Integer[] array = { 20, 30, 10 };
		Stream<Integer> stream = Stream.of(array);
		stream.forEach(System.out::println);

		System.out.println("---STREAM FROM RAW DATA---");
		//Create a stream from given data and print the elements
		Stream<Integer> stream1 = Stream.of(20, 30, 10);
		stream1.forEach(System.out::println);

		System.out.println("---STREAM FROM GENERATE---");
		//Create a stream from random generated data and print the elements
		Stream<Integer> stream2 = Stream.generate(() -> new Random().nextInt()).limit(3);
		stream2.forEach(System.out::println);

		System.out.println("---STREAM FROM ITERATE---");
		//Create a stream starting from 1 and print the elements
		Stream<Integer> stream3 = Stream.iterate(1, i -> i <= 3 ,i -> i + 1);
		stream3.forEach(System.out::println);

		System.out.println("---EMPTY STREAM---");
		//Create an empty stream and print the elements
		Stream<Integer> stream4 = Stream.empty();
		stream4.forEach(System.out::println);
	}
}