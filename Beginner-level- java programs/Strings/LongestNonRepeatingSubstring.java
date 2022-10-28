package com.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestNonRepeatingSubstring {

	/**
	 * Given a string, find the length of the longest substring which has no
	 * repeating characters.
	 */

	// SUbstring and Contains Check
	public static int findLongestNRString(String str) {
		int max = 0;
		String substr = "";
		for (char ch : str.toCharArray()) {
			if (substr.contains(ch + "")) {
				substr = substr.substring(substr.indexOf(ch) + 1);
			}
			substr += ch;
			max = Math.max(max, substr.length());
			// System.out.println(substr + " " + ch + " ");
		}
		return max;
	}

	// Sliding Window - Distinct k Characters Approach
	public static int findLongestNRStringV2(String str) {
		int start = 0;
		int max = 0;
		Map<Character, Integer> map = new HashMap<>();
		for (int end = 0; end < str.length(); end++) {
			char rc = str.charAt(end);
			map.put(rc, map.getOrDefault(rc, 0) + 1);

			while (map.size() < (end - start + 1)) {
				char lc = str.charAt(start);
				map.put(lc, map.get(lc) - 1);
				start++;
				if (map.get(lc) == 0)
					map.remove(lc);
			}
			max = Math.max(max, end - start + 1);
			// System.out.println("map size " + map.size());
			// System.out.println(str.substring(start, end + 1));

		}
		return max;
	}

	// Sliding Window HashMap <Char,Position>
	public static int findLongestNRStringV3(String str) {
		int start = 0;
		int max = 0;
		Map<Character, Integer> map = new HashMap<>(); // Char,Position
		for (int end = 0; end < str.length(); end++) {
			char rc = str.charAt(end);

			if (map.containsKey(rc)) {
				start = Math.max(start, map.get(rc) + 1);
			}
			map.put(rc, end);
			max = Math.max(max, end - start + 1);
			System.out.println(str.substring(start, end + 1) + " start " + start + " end " + end);
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println("--------------LongestNonRepeatingSubstring------------------");
		String arr[] = { "abba" }; // { "aabccbb", "abbbb", "abccde", "abcabcbb" }; //
		for (String str : arr) {
			int res = findLongestNRStringV3(str);
			System.out.println("--" + str + " : " + res);
		}
	}
}
