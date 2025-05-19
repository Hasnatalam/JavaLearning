package com.hasnat.String;

public class AddTwoString {
	public static void main(String[] args) {
		String str1="JAVA";
		String str2="PYTHON";
		int len = str1.length()+str2.length();
		char []str3= new char[len];
		int j=0;
		for(int i=0;i<len;i++) {
				if(i%2==0&&j<str1.length()) {str3[i]=str1.charAt(j);j++;}
				else str3[i]=str2.charAt(i-j);
			}
		for(char c : str3) {
		System.out.print(c);
		}
	}
}
