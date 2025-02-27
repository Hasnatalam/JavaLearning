package com.hasnat.SerializationAndDeserialiazation;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class B {
	public static void main(String[] args) throws IOException {
		var fis = new FileInputStream("C:\\Users\\Hasnat Alam\\OneDrive\\Desktop\\NOTES\\FileIO\\MultipleObject1.text");
		var ois = new ObjectInputStream(fis);
		try(fis;ois){
			MultipleEmployee e = null;
			while((e=(MultipleEmployee) ois.readObject())!=null) {
				System.out.println(e);
			}
		} catch (ClassNotFoundException e1) {

			e1.printStackTrace();
		}
		catch(EOFException e) {
			System.out.println("All employee printed");
		}
	}
}
