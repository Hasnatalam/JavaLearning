package com.hasnat.interviewPurpose;

public class VowelConstant {
	public static void main(String[] args) {
		String str = "java";
		String vowel="aeiou";
		int vowels=0;
		int constants=0;
		for(int i=0;i<str.length();i++) {
			if(vowel.indexOf(str.charAt(i))==-1)constants++;
			else vowels++;
		}
		System.out.println("Vowels = "+vowels);
		System.out.println("Constants = "+constants);
	}
}
