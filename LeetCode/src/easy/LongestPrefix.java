package easy;

import java.util.Arrays;

class Solution {
	public String longestCommonPrefix(String[] strs) {
		Arrays.sort(strs);
		String str = strs[0];
		int i;
		for (i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			for (int j = 1; j < strs.length; j++) {
				if (ch != strs[j].charAt(i))
					return str.substring(0, i);

			}
		}
		return str.substring(0, i);
	}
}

public class LongestPrefix {
	public static void main(String[] args) {
		// Create an instance of Solution class
		Solution solution = new Solution();

		// Test case: Array of strings to find longest common prefix
		String[] strs = { "abcde", "abed", "abcde" };

		// Get the longest common prefix
		String result = solution.longestCommonPrefix(strs);

		// Print the result
		System.out.println("Longest Common Prefix: " + result);
	}
}
