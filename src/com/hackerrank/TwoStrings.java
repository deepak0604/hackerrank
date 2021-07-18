package com.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TwoStrings {
	public static void main(String[] arg) {
		String s1 = "ho";
		String s2 = "world";
//		System.out.println(twoStrings(s1, s2));
//		System.out.println(boyerMoore(s1, s2));
		System.out.println(twoStringsUsingSet(s1, s2));
	}

	// Brute force method
	public static String twoStrings(String s1, String s2) {

		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		boolean found = false;

		for (int i = 0; i < c2.length && !found; i++) {

			for (int j = 0; j < c1.length && !found; j++) {
				if (c2[i] == c1[j])
					found = true;
			}
		}

		if (found)
			return "YES";
		else
			return "NO";
	}

	// Brute force method
	public static String twoStringsUsingSet(String s1, String s2) {

		char[] text = s1.toCharArray();
		char[] pattern = s2.toCharArray();

		if (s1.length() < s2.length()) {
			text = s2.toCharArray();
			pattern = s1.toCharArray();
		}
		int n = text.length;
		int m = pattern.length;
		Set<Character> s = new HashSet<Character>();

		for (int i = 0; i < n; i++)
			s.add(text[i]);

		for (int j = 0; j < m; j++)
			if (s.contains(pattern[j]))
				return "YES";

		return "NO";

	}

	// KMP method
	public static String kmp(String s1, String s2) {
		int j = 0;
		int len = 0;
		List<Integer> lps = new ArrayList<Integer>(); // longest prefix suffix value
		lps.add(0);
		int i = 1;
		char[] c2 = s2.toCharArray();
		while (i < s2.length()) {
			if (c2[i] == c2[len]) {
				len++;
				lps.add(len);
				i++;
			} else {
				if (len != 0) {
					len = lps.get(len - 1);
				} else {
					lps.add(0);
					i++;
				}
			}
		}
		i = j = 0;
		char[] c1 = s1.toCharArray();
		boolean found = false;
		System.out.println(lps);
		while (i < s1.length() && !found) {
//			System.out.println(c1[i] + " " + c2[j]);
			if (c1[i] == c2[j]) {
				found = true;
				System.out.println("Pattern Match");
				i++;
				j++;
			}

			if (j == s2.length()) {
				found = true;
				System.out.println("Pattern Match");
				j = lps.get(j - 1);
			} else if (i < s1.length() && c1[i] != c2[j]) {
				if (j != 0)
					j = lps.get(j - 1);
				else // (j==0) {
					i++;
			}
		}

		if (found)
			return "YES";
		else
			return "NO";
	}

	// BOyerMoore method
	public static String boyerMoore(String s1, String s2) {

		char[] text = s1.toCharArray();
		char[] pattern = s2.toCharArray();

		if (s1.length() < s2.length()) {
			text = s2.toCharArray();
			pattern = s1.toCharArray();
		}

		int n = text.length;
		int m = pattern.length;
		if (m == 0)
			return "NO";
		Map<Character, Integer> last = new HashMap<>();
		for (int i = 0; i < n; i++) {
			last.put(text[i], -1);
		}

		for (int k = 0; k < m; k++)
			last.put(pattern[k], k);
		int i = m - 1;
		int k = m - 1;

		while (i < n) {
//			System.out.println(text[i]+ " " +pattern[k]);
			if (text[i] == pattern[k]) {
//				return "YES";

				if (k == 0)
					return "YES";
				i--;
				k--;

			} else {
				i += m - Math.min(k, 1 + last.get(text[i]));
				k = m - 1;
			}
		}
		return "NO";
	}
}
