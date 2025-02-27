package com.hasnat.String;

import java.util.ArrayList;

public class PrintNoOfCount {
	public static void main(String[] args) {
		String []str = {"Hasnat Alam","Arbaj Alam", "Ashwani Chandel"};
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Alam");
		list.add("Chandel");
		for(String s: list) {
			int count=0;
			for(int i=0;i<str.length;i++) {
				if(str[i].contains(s))
				count++;
			}
			System.out.println(s +" occurs "+count +" time");
		}
		
	}
}
