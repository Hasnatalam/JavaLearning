package com.hasnat.multithreadingTask;

public class Course {
	int courseId;
	String courseName;
	double courseFee;
	public Course(int courseId, String courseName, double courseFee) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseFee = courseFee;
	}
	protected int getCourseId() {
		return courseId;
	}
	protected String getCourseName() {
		return courseName;
	}
	protected double getCourseFee() {
		return courseFee;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseFee=" + courseFee + "]";
	}
	
}
