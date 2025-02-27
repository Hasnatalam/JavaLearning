package com.hasnat.hashMap;

import java.util.*;
public class FirstNonRepeatingChar {
    public static void main(String[] args) {
    String str="siwss";
    
    Map<Character,Integer> map = new HashMap<>();
    
    for(Character ch : str.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)+1);
    }
    
    for(Character c:str.toCharArray()){
        if(map.containsKey(c)){
            if(map.get(c)==1)
            {System.out.println(c);
            return;}
        }
    }
    }
}