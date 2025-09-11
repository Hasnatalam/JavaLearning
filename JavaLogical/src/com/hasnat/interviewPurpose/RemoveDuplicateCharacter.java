package com.hasnat.interviewPurpose;

public class RemoveDuplicateCharacter {
	public static void main(String[] args) {
		String str="java";
		String str1="";
		
		for(int i=0;i<str.length();i++) {
			if(str1.indexOf(str.charAt(i))==-1) {
				str1+=str.charAt(i);
			}
		}
		System.out.println(str1);
	}
}
