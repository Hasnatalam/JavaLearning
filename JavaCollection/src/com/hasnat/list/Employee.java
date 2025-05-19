package com.hasnat.list;

import java.util.Objects;

public class Employee {
	Integer id;
	String name;
	String add;
	
	
	public Employee(Integer id, String name, String add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}


	@Override
	public boolean equals(Object obj) {
		
		if(obj==null||getClass()!=obj.getClass())return false;
		
		if (this==obj)return true;
		
		Employee emp=(Employee) obj;
		return this.id.equals(emp.id)&& this.name.equals(emp.name)&&this.add.equals(emp.add);
	}
	@Override
	public int hashCode() {
		
		return Objects.hash(id,name,add);
	}
}
