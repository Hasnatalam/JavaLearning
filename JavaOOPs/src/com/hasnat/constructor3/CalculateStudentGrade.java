package com.hasnat.constructor3;

public class CalculateStudentGrade {
    public static StudentGrade calculateGrade(Student student) {
        int marks = student.getMarks();
        char grade;

        if (marks > 90) {
            grade = 'A';
        } 
        else if (marks >= 75) {
            grade = 'B';
        } 
        else if (marks >= 60) {
            grade = 'C';
        } 
        else {
            grade = 'D';
        }

        return new StudentGrade(student, grade);
    }
}
