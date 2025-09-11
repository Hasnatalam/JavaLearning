package com.hasnat.interviewPurpose;

public class NonRepeatChar {
	public static void main(String[] args) {
		String str = "java";
		for(int i=0;i<str.length();i++) {
			boolean flag=true;
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j))flag=false;
			}
			if(flag) {
				System.out.println(str.charAt(i));
				return;
			}
		}
	}
}
