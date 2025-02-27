package com.hasnat.hashMap;
import java.util.*;
public class FreequencyOfWord {
	public static void main(String[] args) {
        String santence= "the quick brown fox jumps over the lazy dog";
        String words[]=santence.split(" ");
        Map<String,Integer> map = new HashMap<>();
        
        for(String key : words){
            map.put(key,map.getOrDefault(key,0)+1);
        }
        map.forEach((k,v)->System.out.println(k+" occurs "+v+" time"));
        
    }
}
