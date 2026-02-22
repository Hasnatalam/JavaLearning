package com.app.string;

public class Pelindrome {
	public static void main(String[] args) {
		String str = "abca";
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i)!= str.charAt(str.length()-i-1)){
				System.out.println("Not pelindrome ");
				return;
			}
		}
		System.out.println("pelindrome");
	}
}
