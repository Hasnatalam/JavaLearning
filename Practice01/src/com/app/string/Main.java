package com.app.string;

public class Main {
	public static void main(String[] args) {
		lengthWithoutLength("abcde");
		System.out.println( );
		
		onlyAlphabates("a@bc%d#123Z");
		System.out.println( );
		
		reverseWordInSentance("Java is   programming language   ");
		
		System.out.println();
		replaceChar("abcde", 'b', 'p');
		
		System.out.println();
		charReplace("abcfajfaa");
		
		System.out.println();
		anagram("abcd", "cbaa");
	}
	
	
	
	
	
	
	
	public static void lengthWithoutLength(String str) {
		int count=0;
		for(char c : str.toCharArray()) {
			count ++;
			
		}
		System.out.print(count);
		
	}
	
	public static void onlyAlphabates(String str) {
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z'||str.charAt(i)>='a'&&str.charAt(i)<='z') {
				System.out.print(str.charAt(i)+" ");
			}
		}
	}
	
	public static void reverseWordInSentance(String str) {
		String [] split = str.trim().split("\\s+");
		for(int i=split.length;i>0;i--) {
			System.out.print(split[i-1]+" ");
		}
	}
	
	
	public static void replaceChar(String str, char ch,char rc) {
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				sb.append(rc);
			}
			else sb.append(str.charAt(i));
		}
		System.out.println(sb);
	}
	
	public static void charReplace(String str) {
		int [] occurence = new int [256];
		for(char c : str.toCharArray()) {
			occurence[c]++;
		}
		for(int i =0; i<256;i++) {
			if(occurence[i]>0) {
				System.out.println((char)i+" "+occurence[i]);
			}
		}
	}
	
	public static void anagram(String str1, String str2) {
		
		if (str1.length()==str2.length()) {
			
			int occ [] = new int [256];
			
			for(char c1: str1.toCharArray()) {
				occ[c1]++;
			}

			for(char c2: str2.toCharArray()) {
				occ[c2]--;		
			}
			
			for(int i=0;i<occ.length;i++) {
			if(occ[i]>0){
				System.out.println("Not Anagram");
				return ;
			}
			}
			System.out.println("Anagram");
		}
			
		else System.out.println("Not Anagram");
		
	}
}
