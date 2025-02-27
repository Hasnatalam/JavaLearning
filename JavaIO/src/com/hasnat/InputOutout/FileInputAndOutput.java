package com.hasnat.InputOutout;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputAndOutput {
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws FileNotFoundException {
		String str = "Sohana Parveen";
		byte []b = str.getBytes();
		FileOutputStream fout = new FileOutputStream("C:\\Users\\Hasnat Alam\\OneDrive\\Desktop\\NOTES\\FileIO\\file3.text");
		try(fout){
			fout.write(b);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Output");
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Input.input();
	}
}
class Input{
		public static void input(){
			try (FileInputStream fin = new FileInputStream("C:\\Users\\Hasnat Alam\\OneDrive\\Desktop\\NOTES\\FileIO\\file3.text")) {
				int i;
				while(true) {
					try {
						i=fin.read();
						if(i==-1)break;
						System.out.print((char)i);
					} catch (IOException e) {
						e.printStackTrace();
					}
					
				}
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
}