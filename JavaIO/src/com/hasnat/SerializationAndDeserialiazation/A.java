package com.hasnat.SerializationAndDeserialiazation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class A {
	public static void main(String[] args) throws IOException   {
		
		var fos = new FileOutputStream("C:\\Users\\Hasnat Alam\\OneDrive\\Desktop\\NOTES\\FileIO\\MultipleObject1.text");
		var oos = new ObjectOutputStream(fos);
		Scanner sc = new Scanner (System.in);
		
		try(fos;oos;sc){
			System.out.println("Enter no of employee ");
			int n = sc.nextInt();
			for(int i=1;i<=n;i++) {
				oos.writeObject(MultipleEmployee.getObject(sc));
				
			}
			System.out.println(n+" Employee added sucessfully..");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
