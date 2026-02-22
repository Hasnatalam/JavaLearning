package com.app.string;

public class CountVowels {
	public static void main(String[] args) {
		String str = "abaosd";
		String vowel = "aeiou";
		int count =0;
		for(int i=0;i<str.length();i++) {
			if(vowel.contains(str.substring(i,i+1))) {
				count++;
			}
		}
		System.out.println(count);
	}
}
