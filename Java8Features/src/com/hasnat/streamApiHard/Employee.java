package com.hasnat.streamApiHard;

import java.util.Arrays;
import java.util.List;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private int age;
    private String department;
    private String city;
    
    
    

    // Constructor
    public Employee(int id, String name, double salary, int age, String department, String city) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.department = department;
        this.city = city;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }
    public String getCity() { return city; }
    
    
    public static List<Employee> getEmployees(){
     List<Employee> employees = Arrays.asList(
	            new Employee(101, "Hasnat", 55000, 26, "IT", "Kolkata"),
	            new Employee(102, "Ayaan", 72000, 30, "HR", "Delhi"),
	            new Employee(103, "Zara", 60000, 28, "Finance", "Mumbai"),
	            new Employee(104, "Riya", 72000, 32, "IT", "Bangalore"),
	            new Employee(105, "Imran", 50000, 24, "Sales", "Pune"),
	            new Employee(106, "Kabir", 85000, 45, "Marketing", "Hyderabad"),
	            new Employee(107, "Keya", 68000, 29, "Finance", "Chennai"),
	            new Employee(108, "Arjun", 91000, 40, "IT", "Noida"),
	            new Employee(109, "Sara", 47000, 23, "Support", "Kolkata"),
	            new Employee(110, "Tara", 78000, 31, "HR", "Delhi")
	        );
     
     return employees;
    }
    
    

    // toString for display
    @Override
    public String toString() {
        return "Employee [id=" + id + 
               ", name=" + name + 
               ", salary=" + salary + 
               ", age=" + age + 
               ", department=" + department + 
               ", city=" + city + "]";
    }
    
}
