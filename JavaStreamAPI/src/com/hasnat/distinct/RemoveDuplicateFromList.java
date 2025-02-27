package com.hasnat.distinct;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateFromList {
	public static void main(String[] args) {
		Long []arr = {1L,2L,4L,6L,7L,1l};
		
		List<Long> list = removeDuplicate(arr);
		list.forEach(System.out::print);
	}
	public static List<Long> removeDuplicate(Long array[]){
		
				
		List<Long> list = List.of(array);
		List<Long> collect = list.stream().distinct().sorted().collect(Collectors.toList());
		return collect;
	}
}
