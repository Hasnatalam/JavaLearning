package com.hasnat.functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MyConsumer {
	public static void main(String[] args) {
		Consumer<String> consumer = str-> System.out.println(str);
		
		consumer.accept("Hello World");
		
		BiConsumer<String,String> biConsumer =(str1,str2)->System.out.println(str1+" "+str2);
		biConsumer.accept("Learning", "Java");
	}
}
