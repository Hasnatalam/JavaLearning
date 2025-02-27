package com.hasnat.abstraction;

public class HistoryStudent extends Student {
	private int historyMarks;
	private int civicsMarks;
	
	public HistoryStudent( String studentname,String studentClass, int historyMarks, int civicsMarks) {
		super(studentname,studentClass);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}
	@Override
	public int getPercentage() {
		int percentage = (historyMarks+civicsMarks)/2;
		
		return percentage;
	}
}
