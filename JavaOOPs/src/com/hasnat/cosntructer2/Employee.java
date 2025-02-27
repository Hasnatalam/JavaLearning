package com.hasnat.cosntructer2;

import java.util.Scanner;

public class Employee {
    private int employeeId;
    private String employeeName;
    private double employeeSalary;

    // Parameterized constructor
    public Employee(int employeeId, String employeeName, double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    // Static method to get Employee object from keyboard input
    public static Employee getEmployeeObject() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();
        sc.close();
        return new Employee(id, name, salary);
        
    }

    // Override toString method
    @Override
    public String toString() {
        return "Employee ID: " + employeeId + ", Name: " + employeeName + ", Salary: " + employeeSalary;
    }
 
}
