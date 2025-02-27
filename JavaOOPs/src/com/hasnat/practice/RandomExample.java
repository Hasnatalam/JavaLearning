package com.hasnat.practice;

import java.util.Random;  // Correct import statement

public class RandomExample {  // Renamed class to avoid conflict
    public static void main(String[] args) {
        Random r1 = new Random();  // Use java.util.Random
        int ran = r1.nextInt(4);
        System.out.println(ran);
//        String s= "abc";
//        s=null;
//        System.out.println(s);
    }
}
