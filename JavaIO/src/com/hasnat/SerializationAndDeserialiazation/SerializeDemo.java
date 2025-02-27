package com.hasnat.SerializationAndDeserialiazation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;



public class SerializeDemo {
	public static void main(String[] args) throws IOException {
		var fout = new FileOutputStream("C:\\Users\\Hasnat Alam\\OneDrive\\Desktop\\NOTES\\FileIO\\object.text");
		var oos = new ObjectOutputStream(fout);
		
		try(fout; oos)
		{		
		  Employee e1 = new Employee( "Scott","Hyd", 45890.90);
		  oos.writeObject(e1);
		  System.out.println("Object data stored .....");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}

