package com.hasnat.hashMap;

import java.util.*;

public class Isomorphic {
	public static void main(String[] args) {
        String str1 = "egg";
        String str2 = "add";

        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" isomorphic? " + isIsomorphic(str1, str2));
    }

    public static boolean isIsomorphic(String str1, String str2) {
        if (str1.length() != str2.length()) return false; // Different lengths → Not isomorphic

        Map<Character, Character> map = new HashMap<>();
        Set<Character> mappedValues = new HashSet<>();

        for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            // If ch1 is already mapped, it must match the existing mapping
            if (map.containsKey(ch1)) {
                if (map.get(ch1) != ch2) return false; // Mismatch found
            } else {
                // If ch2 is already mapped to another character, return false
                if (mappedValues.contains(ch2)) return false;

                // Create a new mapping
                map.put(ch1, ch2);
                mappedValues.add(ch2);
            }
        }
        System.out.println(mappedValues);
        return true;
    }
}
