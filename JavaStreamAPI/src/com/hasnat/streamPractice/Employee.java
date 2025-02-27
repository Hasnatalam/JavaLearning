package com.hasnat.streamPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee {
    private String name;
    private String gender;
    private int age;
    private double salary;

    // Constructor
    public Employee(String name, String gender, int age, double salary) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "Female", 28, 55000));
        employees.add(new Employee("Bob", "Male", 35, 60000));
        employees.add(new Employee("Charlie", "Male", 32, 75000));
        employees.add(new Employee("Diana", "Female", 26, 52000));
        employees.add(new Employee("Emma", "Female", 41, 85000));
        employees.add(new Employee("Frank", "Male", 29, 48000));
        employees.add(new Employee("Grace", "Female", 38, 70000));
        return employees;
    }

    // Override equals() and hashCode() methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(name, employee.name) &&
                Objects.equals(gender, employee.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, age, salary);
    }

    // Override toString() method for easy printing
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
