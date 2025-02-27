package com.hasnat.arrayList;

import java.io.*;
import java.util.*;

public class ArrayListForEmployee {
	public static void main(String[] args) throws IOException {
		List <Employee> a= new ArrayList<>();
		a.add(new Employee(111,"Scott","Devloper",750000));
		a.add(new Employee(222,"Alex","Manager",750000));
		a.add(new Employee(333,"Ashwani","Desighner",750000));
		a.add(new Employee(444,"Lalit","Devloper",750000));
		var fos = new FileOutputStream("C:\\Users\\Hasnat Alam\\OneDrive\\Desktop\\NOTES\\FileIO\\EmployeeList.text");
		var oos = new ObjectOutputStream(fos);
		oos.writeObject(a);
		oos.close();
	}
}
