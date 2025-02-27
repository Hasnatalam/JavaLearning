package com.hasnat.cosntructer2;

public class EmployeeELC {

	
	    public static void main(String[] args) {
	        Employee[] employees = new Employee[5];

	        // Accept 5 Employee objects from the keyboard
	        for (int i = 0; i < employees.length; i++) {
	            System.out.println("Enter details for Employee " + (i+1) + ":");
	            employees[i] = Employee.getEmployeeObject();
	        }

	        // Print their data using toString method with a for-each loop
	        System.out.println("\nEmployee Details:");
	        for (Employee e : employees) {
	            System.out.println(e);
	        }
	    }
	}


