package com.hasnat.predefinedInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(String[] args) {
		String str1= "Hasnat";
		String str2= "Alam";
		Consumer<String> c = (str)->System.out.println(str);
		c.accept(str1);
		BiConsumer<String,String> bc = (s1,s2)->System.out.println(s1+" "+s2);
		
		bc.accept(str1, str2);
	}
}
