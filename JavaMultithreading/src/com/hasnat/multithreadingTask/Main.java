package com.hasnat.multithreadingTask;

public class Main {

    public static void main(String[] args) {

        Course courses[] = { new Course(1, "Mathemetics", 1000), new Course(2, "Science", 1200) , new Course(2, "English", 900)};
        Offer offers[] = new Offer[2];
        offers[0] = new Offer("Special discount: Get 20% off on all courses!");
        offers[1] = new Offer("Limited time offer: Enroll in any two courses and get one course free!");
        EducationInstitute e = new EducationInstitute(courses, offers);
     
        
      
        
        Student s1 = new Student("Kohli", e);
        Thread t1 = new Thread(() -> {
            s1.viewCoursesAndFees();
            s1.viewOffers();
            s1.enrollInCourse(1);
        });

        Student s2 = new Student("Dhoni", e);
        Thread t2 = new Thread(() -> {
            s2.viewCoursesAndFees();
            s2.viewOffers();
            s2.enrollInCourse(2);
        });

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        t2.start();
    }
}
