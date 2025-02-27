package com.hasnat.constructor;

public class SalaryCalculationELC {

	public static void main(String[] args) {
		Employee hasnat = new Employee();
		
		hasnat.setEmployeeData("Hasnat","Alam",101,70000,12);
		
		System.out.println(hasnat.displayDetails());
	}

}
