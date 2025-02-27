package com.hasnat.hashMap;

import java.util.*;

public class PairWithGivenSum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int targetSum = 9;

        System.out.println("Pair with given sum exists: " + hasPairWithSum(numbers, targetSum));
    }

    public static boolean hasPairWithSum(int[] numbers, int targetSum) {
        // Create a HashMap to store the numbers we've already visited
        Map<Integer, Boolean> seenNumbers = new HashMap<>();

        // Loop through the array
        for (int num : numbers) {
            int complement = targetSum - num; // Calculate the complement

            // If the complement exists in the map, we've found a pair
            if (seenNumbers.containsKey(complement)) {
                return true; // Pair found
            }

            // Store the current number in the map
            seenNumbers.put(num, true);
        }

        return false; // No pair found
    }
}

