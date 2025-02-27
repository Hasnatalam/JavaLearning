package com.hasnat.arrayList;

import java.util.*;

public class CityArrayList {

    public static void main(String[] args) throws InterruptedException {
        // Creating an ArrayList named 'city'
        ArrayList<String> city = new ArrayList<>();
        
        // Adding elements to the 'city' ArrayList
        city.add("Hyderabaad");
        city.add("Bangalore");
        city.add("Kolkata");
        city.add("Pune");
        city.add("Hyderabaad");
        city.add("Mumbai");
        // Using forEach method reference to print elements
        System.err.println("(1)Using forEach method reference");
        city.forEach(System.out::println);
        // Setting "Chennai" at the 4th index (replacing "Hyderabaad")
        city.set(4, "Chennai");
        
        Thread.sleep(1000);
        // Printing elements after setting "Chennai" in the 4th index
        System.err.println("(2)After setting chennai in fourth index");
        for(String c : city) {
            System.out.println(c);
        }
        
        // Creating another ArrayList named 'city2'
        ArrayList<String> city2 = new ArrayList<>();
        // Adding elements to the 'city2' ArrayList
        city2.add("Delhi");
        city2.add("Indore");
        city2.add("Patna");
        city2.add("Ranchi");
        
        Thread.sleep(1000);
        // Using ListIterator to iterate through 'city2' elements
        ListIterator<String> e1 = city2.listIterator();
        System.err.println("(3)Element of city2 Using listiterator");
        while(e1.hasNext()) {
            System.out.println(e1.next());
        }
        // Printing elements in reverse order using ListIterator
        while(e1.hasPrevious()) {
            System.out.println(e1.previous());
        }
        // Using Iterator to iterate through 'city2' elements
        Iterator<String> e = city2.iterator();
        // Reversing the order of elements in 'city2'
        Collections.reverse(city2);
        
        Thread.sleep(1000);
        // Printing elements of 'city2' using Iterator
        System.err.println("(4)Element of city2 using iterator");
        while(e.hasNext()) {
            System.out.println(e.next());
        }
        
        // Creating another ArrayList 'city3' and adding all elements from 'city'
        ArrayList<String> city3 = new ArrayList<>(city);
        // Adding all elements from 'city2' to 'city3'
        city3.addAll(city2);
        
        Thread.sleep(1000);
        // Printing elements of 'city3' using a for loop
        System.err.println("(5)Element of city3 using for loop");
        for(int i = 0; i < city3.size(); i++) {
            System.out.println(city3.get(i));
        }
        Thread.sleep(1000);
        // Printing 'city' using toString() method
        System.err.println("(6)Using to toString method");
        System.out.println(city);
        Thread.sleep(1000);
        // Using Spliterator to iterate through 'city' elements
        System.err.println("(7)Using to spliterator ");
        Spliterator<String> spli = city.spliterator();
        spli.forEachRemaining(c -> System.out.println(c));
        Thread.sleep(1000);
        // Using forEach method to print elements
        System.err.println("(8)Using for each method");
        city.forEach(c -> System.out.println(c));
        // Checking if 'city3' is empty
        System.out.println(city3.isEmpty());
        // Ensuring capacity of 'city3'
        city3.ensureCapacity(0);
        // Printing the size of 'city3'
        System.out.println(city3.size());
        // Clearing all elements from 'city3'
        city3.clear();
        // Printing 'city3' after clearing elements
        System.out.println(city3);
        // Removing all elements from 'city'
        city.removeAll(city);
        // Printing 'city' after removing elements
        System.out.println(city);
        // Converting 'city' ArrayList to array
        String []arr = city.toArray(new String[0]);
        // Printing the elements of the array
        for(String s : arr) {
            System.out.println("last " + s);
        }
    }
}
