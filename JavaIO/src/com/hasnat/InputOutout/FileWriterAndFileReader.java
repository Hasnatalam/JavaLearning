package com.hasnat.InputOutout;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndFileReader {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\Hasnat Alam\\OneDrive\\Desktop\\NOTES\\FileIO\\file4.text");
		try (fw){
			fw.write("India is Great");
			System.out.println("success");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		//FileReaderDemo.fileReader();
	}
}
class FileReaderDemo{
	public static void fileReader() throws FileNotFoundException {
		FileReader fr = new FileReader("C:\\Users\\Hasnat Alam\\OneDrive\\Desktop\\NOTES\\FileIO\\file4.text");
		int i;
		
			try (fr){
				while(true) {
				i= fr.read();
				if(i==-1)break;
				System.out.print((char)i);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		
	}
}