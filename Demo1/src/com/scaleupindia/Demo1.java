package com.scaleupindia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo1 {
	public static void main(String[] args) {
		System.out.println("---STREAM FROM LIST---");
		//Create a stream from given list and print the elements
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(30);
		list.add(10);
		list.stream().forEach(System.out::println);

		System.out.println("---STREAM FROM SET---");
		//Create a stream from given set and print the elements
		Set<Integer> set = new HashSet<>();
		set.add(20);
		set.add(30);
		set.add(10);
		set.stream().forEach(System.out::println);

		System.out.println("---STREAM FROM MAP---");
		//Create a stream from given map and print the elements
		Map<Integer, String> map = new HashMap<>();
		map.put(20, "twenty");
		map.put(30, "thirty");
		map.put(10, "ten");
		map.entrySet().stream().forEach(System.out::println);
	}
}