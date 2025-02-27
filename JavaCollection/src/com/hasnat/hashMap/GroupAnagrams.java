package com.hasnat.hashMap;

import java.util.*;

public class GroupAnagrams {
	public static void main(String[] args) {
        String words[]= {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String,List<String>> map = new HashMap<>();
        for(String word : words){
            String key = getSortedWord(word);
            map.putIfAbsent(key,new ArrayList<String>());
            map.get(key).add(word);
        }
        
        System.out.println(map.values());
        
    }
    
    public static String getSortedWord(String word){
        char ch[]= word.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}
