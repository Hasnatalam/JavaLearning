package com.hasnat.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringNo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 4, 7, 8, 1, 9, 12);

        List<Integer> evenNumbers = list.stream()
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toList());
//        	.forEach(System::println);
        
       
        evenNumbers.forEach(System.out::print);
    }
}
