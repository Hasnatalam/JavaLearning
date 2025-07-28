package com.hasnat.medium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VowelCount{
    public static void main(String [] args){
    	List<String> str = Arrays.asList("Welcome","to","Java");
    	List<String> vowels = Arrays.asList("a","e","i","o","u");
    	String singleString = str.stream().collect(Collectors.joining(" "));
    }
}