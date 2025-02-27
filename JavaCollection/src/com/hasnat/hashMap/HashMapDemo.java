package com.hasnat.hashMap;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> studentMap = new HashMap<>();

        studentMap.put(101, "John");
        studentMap.put(102, "Emma");
        studentMap.put(103, "Liam");

        System.out.println("Student with Roll No 101: " + studentMap.get(101)); // Output: John
        studentMap.put(101, "abc");
        System.out.println(studentMap.containsValue("abc"));
        
        System.out.println("All students:");
        for (HashMap.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        System.out.println("Does Roll No 102 exist? " + studentMap.containsKey(102)); // Output: true
        System.out.println("Does the name 'Sophia' exist? " + studentMap.containsValue("Sophia")); // Output: false

        studentMap.remove(103);
        System.out.println("After removal, Roll No 103 exists? " + studentMap.containsKey(103)); // Output: false

        System.out.println("Total students: " + studentMap.size()); // Output: 2
    }
}
