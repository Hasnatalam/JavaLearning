package com.hasnat.interviewPurpose;

public class Sort {
    public static void main(String[] args) {
        int arr[] = {8, 7, 6, 5, 4, 3, 2, 1};

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Check if current element is greater than next
            if (arr[i] > arr[i + 1]) {
                int temp;
                // Shift larger element towards right
                for (int j = i; j < n - 1; j++) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                // Reset i to -1 so loop starts from 0 again after i++
                i = -1; // This ensures that we recheck the array after a shift
            }
        }

        // Correct way to print array using enhanced for loop
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
