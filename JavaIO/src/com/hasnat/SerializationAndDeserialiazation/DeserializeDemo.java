package com.hasnat.SerializationAndDeserialiazation;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo{
	public static void main (String []args) throws IOException {
		var fin = new FileInputStream("C:\\Users\\Hasnat Alam\\OneDrive\\Desktop\\NOTES\\FileIO\\object.text");
		var oin = new ObjectInputStream(fin);
		try(fin;oin){
			var emp = oin.readObject();
			System.out.println(emp);
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
