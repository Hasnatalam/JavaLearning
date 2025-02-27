package com.hasnat.abstraction;

public class ScienceStudent extends Student{
	private int physicsMarks;
	private int chemistryMarks;
	private int mathMarks;
	
	
	
	public ScienceStudent( String studentname,String studentClass, int physicsMarks, int chemistryMarks, int mathMarks) {
		super(studentname,studentClass);
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathMarks = mathMarks;
	}



	@Override
	public int getPercentage() {
		int percentage = (physicsMarks+chemistryMarks+mathMarks)/3;
		return percentage;
	}

}
