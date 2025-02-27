package com.hasnat.SerializationAndDeserialiazation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializeWithMultipleObject {
	public static void main(String[] args) throws IOException {
		var fout = new FileOutputStream(
				"C:\\Users\\Hasnat Alam\\OneDrive\\Desktop\\NOTES\\FileIO\\MultipleObject.text");
		var oos = new ObjectOutputStream(fout);
		Scanner sc = new Scanner(System.in);

		try (fout; oos; sc) {
			System.out.println("Home many object you want to store");
			int n = sc.nextInt();
			for (int i = 1; i <= n; i++) {
				MultipleEmployee e = MultipleEmployee.getObject(sc);
				oos.writeObject(e);
				System.out.println("Object written.....");
			}

		}
	}
}
