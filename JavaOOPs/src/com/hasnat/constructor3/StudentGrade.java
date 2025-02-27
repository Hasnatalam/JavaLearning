package com.hasnat.constructor3;

public class StudentGrade {
	private Student student;
	private char studenttGrade;
	public StudentGrade(Student student, char studenttGrade) {
		super();
		this.student = student;
		this.studenttGrade = studenttGrade;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public char getStudenttGrade() {
		return studenttGrade;
	}
	public void setStudenttGrade(char studenttGrade) {
		this.studenttGrade = studenttGrade;
	}
	@Override
	public String toString() {
		return "StudentGrade [student=" + student + ", studenttGrade=" + studenttGrade + "]";
	}
	
}
