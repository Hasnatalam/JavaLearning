package com.hasnat;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class StringOccurence {

	public static void main(String[] args) {

		String str = "hyderabad";

		Map<String, Long> collect = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(c -> c, Collectors.counting())).entrySet().stream()
				.filter(d -> d.getValue() > 0).collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));

		for (Map.Entry<String, Long> e : collect.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}

	}

}
