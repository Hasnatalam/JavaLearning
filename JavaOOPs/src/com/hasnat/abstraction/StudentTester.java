package com.hasnat.abstraction;

public class StudentTester {

	public static void main(String[] args) {
		Student s=null;
		s = new ScienceStudent("Hasnat","MCA",85,92,88);
		System.out.println(s.getPercentage());
		s = new HistoryStudent("Hasnat","MA",85,92);
		System.out.println(s.getPercentage());
		System.out.println(Student.getTotalNoStudents());
	}

}
