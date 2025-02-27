package com.hasnat.serializableDeserializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializableTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		var fin = new FileInputStream("C:\\InputOutput\\serializee.txt");
		var ois = new ObjectInputStream(fin);
		
		try(fin; ois){
			Employee e = (Employee) ois.readObject();
			System.out.println(e);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
