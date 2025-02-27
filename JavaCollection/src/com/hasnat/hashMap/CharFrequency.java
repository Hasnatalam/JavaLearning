package com.hasnat.hashMap;

import java.util.*;
public class CharFrequency {
	public static void main(String[] args) {
       String str= "hello";
       Map<Character,Integer> map = new HashMap<>();
       for(int i=0;i<str.length();i++){
           int count=1;
           if(!map.containsKey(str.charAt(i))){
                for(int j= i+1;j<str.length();j++){
                    if(str.charAt(i)==str.charAt(j)){
                    count++;
                    }
                }
               map.put(str.charAt(i),count);
           }
       
       }
       map.forEach((k,v)->System.out.println(k+" "+v +"times"));
    }
}