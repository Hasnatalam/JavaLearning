package com.hasnat.streamLogical;

import java.util.*;
import java.util.stream.*;

public class ConvertToUpperCase {
	public static void main(String[] args) {
		List<String> str= new ArrayList<>();
		str.add("element1");
		str.add("element2");
		str.add("element3");
		str.add("element4");
		str.add("word");
		str.add("santence");
		str.add("abc");
		List<String> collect = str.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		long count = str.stream().map(s->s.toUpperCase()).count();
		System.out.println(collect.size());
		
		System.out.println(count);
		collect.forEach(System.out::println);
		
		List<String> e = str.stream().filter(s->s.charAt(0)=='e').collect(Collectors.toList());
		System.out.println(e);
		
	}
}
