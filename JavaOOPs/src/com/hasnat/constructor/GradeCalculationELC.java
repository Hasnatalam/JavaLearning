package com.hasnat.constructor;

public class GradeCalculationELC {
	public static void main(String[] args) {
		
		GradeCalculation g = new GradeCalculation();
		
		g.setStudentData(101,"Hasnat",95);
		
		System.out.println(g.displayDetails());
		
	}
}
