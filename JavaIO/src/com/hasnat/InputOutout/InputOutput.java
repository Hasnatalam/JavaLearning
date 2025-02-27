package com.hasnat.InputOutout;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutput {
	public static void main(String[] args) throws FileNotFoundException {
		String str = "Hasnat alam";
		byte []b = str.getBytes();
		FileOutputStream fout = new FileOutputStream("C:\\Users\\Hasnat Alam\\OneDrive\\Desktop\\NOTES\\FileIO\\file1.text");
		try(fout){
			fout.write(b);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

