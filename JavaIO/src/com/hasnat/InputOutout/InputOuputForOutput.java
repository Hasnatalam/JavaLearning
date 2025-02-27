package com.hasnat.InputOutout;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputOuputForOutput {
	public static void main(String[] args)throws FileNotFoundException {
		FileInputStream fin = new FileInputStream("C:\\Users\\Hasnat Alam\\OneDrive\\Desktop\\NOTES\\FileIO\\file1.text");
		try(fin){
			int i;
			while(true) {
				i=fin.read();
				if(i==-1)break;
				System.out.print((char)i);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
