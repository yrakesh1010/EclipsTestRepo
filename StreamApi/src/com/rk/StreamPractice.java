package com.rk;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {

	public static void main(String[] args) {

		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);

		for (Integer i : list) {
			if (i % 2 == 0) {
				System.out.println("Even num: " + i);
			}
		}
		System.out.println("=======================");
		Stream<Integer> stream = list.stream();
		List<Integer> collect = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(collect);
	}
}
