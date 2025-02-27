package com.hasnat.hashMap;

import java.util.HashMap;

public class WordFrequency {
    public static void main(String[] args) {
        String input = "hasnat alam arbaj alam ibkar altamij";
        
        // Call method to get word frequency
        HashMap<String, Integer> frequencyMap = getWordFrequency(input);
        
        // Print the frequency of "alam" and "altamij"
        System.out.println("Frequency of 'alam': " + frequencyMap.getOrDefault("alam", 0));
        System.out.println("Frequency of 'altamij': " + frequencyMap.getOrDefault("altamij", 0));
    }
    
    // Method to get word frequency
    public static HashMap<String, Integer> getWordFrequency(String str) {
        HashMap<String, Integer> map = new HashMap<>();
        
        // Split the input string into words
        String[] words = str.split(" ");
        
        // Loop through each word
        for (String word : words) {
            // If word is already in map, increment its count
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        
        return map;
    }
}
