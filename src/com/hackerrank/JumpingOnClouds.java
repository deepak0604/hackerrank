package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class JumpingOnClouds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> c = new ArrayList<>();
		c.add(0);
		c.add(0);
		c.add(1);
//		c.add(0);
		c.add(0);
//		c.add(1);
		c.add(0);
		System.out.println("Path count:"+jumpingOnClouds(c));

	}

	private static int jumpingOnClouds(List<Integer> c) {
		int path = 0;
		int n = c.lastIndexOf(0);
		int i = 0;
		System.out.println("n:"+n);
		while (i < n) {
			System.out.println(path);
			if (i+2 <=n && c.get(i + 2) == 0) {
				path = path + 1;
				i = i + 2;
			}
			else if (i+1<=n && c.get(i + 1) == 0) {
				path = path + 1;
				i = i + 1;
			} else {
				i++;
			}
		}
		return path;

	}
}
