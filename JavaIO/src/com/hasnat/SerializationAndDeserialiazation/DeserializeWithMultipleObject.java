package com.hasnat.SerializationAndDeserialiazation;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeWithMultipleObject {
	public static void main(String[] args) throws IOException ,Exception {
		var fin = new FileInputStream("C:\\Users\\Hasnat Alam\\OneDrive\\Desktop\\NOTES\\FileIO\\MultipleObject.text");
		var ois = new ObjectInputStream(fin);
		try(fin;ois){
			MultipleEmployee e=null;
		
				while((e = (MultipleEmployee) ois.readObject())!=null) {
					System.out.println(e);
				}
			
			
		}catch(EOFException e){
			System.err.print("\n All object printed");
			
		}
		
	}
}
