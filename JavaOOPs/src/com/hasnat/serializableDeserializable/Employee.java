package com.hasnat.serializableDeserializable;

import java.io.Serializable;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int EmployeeId;
	private String EmployeeName;
	private double EmployeeSalary;
	public Employee(int employeeId, String employeeName, double employeeSalary) {
		super();
		EmployeeId = employeeId;
		EmployeeName = employeeName;
		EmployeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", EmployeeSalary="
				+ EmployeeSalary + "]";
	}
	
}
