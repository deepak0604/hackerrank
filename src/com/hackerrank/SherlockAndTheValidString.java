package com.hackerrank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SherlockAndTheValidString {

	// https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "aabbcd";
//		String s = "aabbccddeefghi";
//		String s = "abcdefghhgfedecba";
		String s = "aaaaabc";
//		String s = "abc";
		System.out.println(validString(s));
	}

	public static String validString(String s) {
		Map<Character, Integer> charMap = new HashMap<>();
		String ans = "NO";

		for (Character c : s.toCharArray()) {
			if (!charMap.containsKey(c)) {
				charMap.put(c, 1);
			} else {
				Integer i = charMap.get(c);
				charMap.put(c, i + 1);
			}
		}

		Map<Integer, String> m = new HashMap<>();
		
		for (Character k : charMap.keySet()) {
			int i = charMap.get(k);
			if(!m.containsKey(i)) {
				m.put(i,k.toString());
			} else {
				String str = m.get(i);
				str = str.concat(k.toString());
				m.put(i,str);
			}
			
			System.out.println("key:"+ i + " value " + m.get(i));
		}
		System.out.println(m);
		if(m.size() ==1)
			ans="YES";
		else if(m.size()==2) {
			int v0 = (int)m.keySet().toArray()[0];
			int v1 = (int)m.keySet().toArray()[1];
			if(m.get(v0).length() == 1 && (Math.abs(v0-1) == 0  || Math.abs(v0-1) == v1)) {
				ans="YES";
			}
			if(m.get(v1).length() == 1 && (Math.abs(v1-1) == 0  || Math.abs(v1-1) == v0)) {
				ans="YES";
			}
				

		}
		return ans;
	}
}