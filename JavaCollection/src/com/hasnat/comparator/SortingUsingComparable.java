//package com.hasnat.comparator;
//import java.util.*;
//
//class Product1 implements Comparable<Product1>{
//    int id;
//    String name;
//    Product1(int id, String name){
//        this.id=id;
//        this.name= name;
//    }
//        public int compareTo(Product1 p){
//            return p.name.compareTo(this.name);
//            
//        }
//        public String toString(){
//            return id+" "+name;
//        }
//    
//}
//
//
//public class SortingUsingComparable{
//    public static void main (String arge[]){
//       
//        ArrayList<Product1> list= new ArrayList<>();
//        
//        list.add( new Product1(1,"aaaa"));
//        list.add( new Product1(2,"bbbb"));
//        list.add( new Product1(3,"cccc"));
//        list.add( new Product1(4,"dddd"));
//        
//        Collections.sort(list);
//        System.out.println(list);
//    }
//    
//}