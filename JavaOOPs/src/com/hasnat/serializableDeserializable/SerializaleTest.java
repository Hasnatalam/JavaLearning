package com.hasnat.serializableDeserializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializaleTest {
	public static void main(String[] args) throws IOException  {
		var fout = new FileOutputStream("C:\\InputOutput\\serializee.txt");
		var oos = new ObjectOutputStream(fout);
		
		try (fout; oos) {
			Employee e1 = new Employee(111, "Scott", 90000);
			oos.writeObject(e1);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Object data stored");
	}
}
