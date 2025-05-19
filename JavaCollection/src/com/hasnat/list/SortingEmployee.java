package com.hasnat.list;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortingEmployee {
	

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Alex", "Hyderabad");
		Employee emp2 = new Employee(2, "scott", "Mumbai");
		Employee emp3 = new Employee(1, "Alex", "Hyderabad");
		Employee emp4 = new Employee(3, "Martin", "Kolkata");
		//emp2=emp;
		//System.out.println(emp1.equals(emp2));
		
		Set<Employee> set = new HashSet<Employee>();
		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);
		
//		System.out.println(set.size());
//		System.out.println(emp1.hashCode());
//		System.out.println(emp2.hashCode());
//		System.out.println(emp3.hashCode());
//		System.out.println(emp4.hashCode());
		set.forEach(o->System.out.println(o.id+" "+o.name));
		List<Employee> list = Arrays.asList(emp1,emp2,emp3,emp4);
		list.sort((e1,e2)->e1.id.compareTo(e2.id));
		System.err.println("===================================");
		list.forEach(o->System.out.println(o.id+" "+o.name));
		
		Set<Employee> treeSet= new TreeSet<Employee>();
		treeSet.add(emp1);
		treeSet.add(emp2);
		treeSet.add(emp3);
		treeSet.add(emp4);
		System.err.println("===================================");
		treeSet.forEach(o->System.out.println(o.id+" "+o.name));
		
		
	}

}
