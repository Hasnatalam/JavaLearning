package com.hasnat.constructor3;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		Student s1 = new Student("Hasnat",91);
		StudentGrade grade1 = CalculateStudentGrade.calculateGrade(s1);
		System.out.println(grade1);
	}

}
