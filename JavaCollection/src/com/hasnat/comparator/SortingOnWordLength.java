package com.hasnat.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingOnWordLength {
	
	
	
	
	
	public static void main(String[] args) {
		ArrayList<String> city = new ArrayList<>();
		city.add("Kolkata");
		city.add("Hyderabaad");
		city.add("Bangalore");
		city.add("Pune");
		city.add("Mumbai");
		city.add("Delhi");
		city.add("Chennai");
		city.add("Jammu");
		
		Comparator<String> comp = new Comparator<>() {
			@Override
			public int compare(String str1, String str2) {
				
					if(str1.length()>str2.length())
						return 1;
					else 
						return -1;
			}
			
		};
		Collections.sort(city, comp);
		city.forEach(System.out::println);
		
		
		
	}
}
