package com.hackerrank;

import java.util.ArrayList;

public class RepeatedString {
	public static void main(String[] args) {

		String s = "aaaa";
		int n = 10;
		repeatedString(s, n);

	}

	private static int repeatedString(String s, long n) {
		
		int cCnt=0;
		int len = s.length();
		ArrayList<Integer> pos = new ArrayList<>();
		for(int i =0;i<len;i++) {
			if(s.charAt(i)=='a') {
				pos.add(i);
			}
		}
		
		int rem = (int) (n%len);
		
		String str = s.substring(0, rem);
		
		System.out.println("Position "+ pos + " Sub str:" + str);
		
		for(int i=0;i<str.length();i++) {
			if (str.charAt(i) == 'a') {
				cCnt++;
			}
		}
		System.out.println(rem);
		
		System.out.println(n/len * pos.size() + cCnt);
		return cCnt;
	}
}
