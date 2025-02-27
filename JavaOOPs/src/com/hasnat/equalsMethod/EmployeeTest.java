package com.hasnat.equalsMethod;
public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1 = new Employee(111,"Scott");
		Employee e2 = new Employee(111,"Scott");
		Employee e3 = new Employee(333,"Martin");
		
		System.out.println(e1.equals(e2));
		System.out.println(e3.equals(e2));
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
	}
}

class Employee{
	int eId;
	String eName;
	
	
	public Employee(int eId, String eName) {
		super();
		this.eId = eId;
		this.eName = eName;
	}


	@Override
	public boolean equals(Object obj) {
		
		//Fetching the 1st Object data
				int eid1 = this.eId;
				String ename1 = this.eName;

				//Fetching the 2nd Object data
				Employee e2 = (Employee) obj;
				int eid2 = e2.eId;
				String ename2 = e2.eName;
				
				if(eid1==eid2 && ename1.equalsIgnoreCase(ename2))
				{
					return true;
				}
				else
				{
					return false;
				}
	}
	
}

