package com.scaleupindia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo {
	public static void main(String[] args) {
		System.out.println("---STREAM FROM LIST---");
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(30);
		list.add(10);
		Stream<Integer> stream1 = list.stream();
		stream1.forEach(System.out::println);

		System.out.println("---STREAM FROM SET---");
		Set<Integer> set = new HashSet<>();
		set.add(20);
		set.add(30);
		set.add(10);
		Stream<Integer> stream2 = set.stream();
		stream2.forEach(System.out::println);

		System.out.println("---STREAM FROM MAP---");
		Map<Integer, String> map = new HashMap<>();
		map.put(20, "twenty");
		map.put(30, "thirty");
		map.put(10, "ten");
		Stream<Map.Entry<Integer, String>> stream3 = map.entrySet().stream();
		stream3.forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
	}
}