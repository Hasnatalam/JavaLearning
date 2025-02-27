package com.hasnat.inputOutput;

import java.io.FileOutputStream;

public class Student {
	public static void main(String[] args)throws Exception {
		var fout = new FileOutputStream("C:\\InputOutput\\student.txt");
		
		try (fout){
			String student = "Hasnat";
			byte [] name = student.getBytes();
			
			fout.write(name);
		}
		catch(Exception e) {
			e.printStackTrace();
			
			
		}
	}
}
