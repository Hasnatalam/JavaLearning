package com.hasnat.multithreadingTask;

public class Student {
	String nameOfStudent;
	EducationInstitute institute;
	public Student(String nameOfStudent, EducationInstitute institute) {
		super();
		this.nameOfStudent = nameOfStudent;
		this.institute = institute;
	}
	public void viewCoursesAndFees(){
		System.out.println("Available courses are");
		Course []courses=institute.getCourses();
		for(Course course:courses){System.out.println(course);}
	}
	public void viewOffers() {
		System.out.println("Available offers are");
		Offer []offers=institute.getOffers();
		for(Offer offer:offers){System.out.println(offer);}
	}
	public void enrollInCourse(int courseId) {
		institute.enrollStudentInCourse(courseId, nameOfStudent);
	}
	protected String getNameOfStudent() {
		return nameOfStudent;
	}
	protected void setNameOfStudent(String nameOfStudent) {
		this.nameOfStudent = nameOfStudent;
	}
	protected EducationInstitute getInstitute() {
		return institute;
	}
	protected void setInstitute(EducationInstitute institute) {
		this.institute = institute;
	}
	
}
