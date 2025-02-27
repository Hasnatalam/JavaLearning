package com.hasnat.arrayList;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class RetriveEmployee {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		var fis= new FileInputStream("C:\\Users\\Hasnat Alam\\OneDrive\\Desktop\\NOTES\\FileIO\\EmployeeList.text");
		var ois= new ObjectInputStream(fis);
		try(fis;ois){
			ArrayList<Employee> e= null;
			while((e= (ArrayList<Employee>) ois.readObject())!=null) {
				System.out.println(e);
			}
		}
			catch(EOFException e) {
				System.out.println("Sucessfully all empolyee printed");
			}
		
	}
}
