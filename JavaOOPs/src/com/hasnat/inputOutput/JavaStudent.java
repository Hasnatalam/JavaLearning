package com.hasnat.inputOutput;

import java.io.FileInputStream;

public class JavaStudent {
	public static void main(String[] args) throws Exception{
	

	var fin = new FileInputStream("C:\\InputOutput\\student.txt");
	
	try (fin){
		int i;
		while(true) {
			i= fin.read();
			if(i==-1)break;
			System.out.print((char)i);
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
}
