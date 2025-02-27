package com.hasnat.inheritance;

//import java.util.Scanner;

public class ShapeTester {
    public static void main(String[] args) {
        // Test case 1
        Cylinder cylinder1 = new Cylinder(5.0, 5.0);
        System.out.println("Volume =:" + cylinder1.getVolume());
        System.out.println("Area =:" + cylinder1.getArea());

        // Test case 2
        Cylinder cylinder2 = new Cylinder(6.0, 12.0);
        System.out.println("Volume =:" + cylinder2.getVolume());
        System.out.println("Area =:" + cylinder2.getArea());
    }
}
