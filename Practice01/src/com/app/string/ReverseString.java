package com.app.string;

public class ReverseString {
	public static void main(String[] args) {
		String str = "abcde";
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<str.length();i++) { 
			 sb.append(str.substring(str.length()-1-i,str.length()-i)); 
		}
		System.out.println(sb);
	}
}
