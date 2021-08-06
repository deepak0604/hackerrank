package com.hackerrank;

import java.util.*;

public class Climibing {

	public static void main(String[] args) {
//
		int[] r = { 100, 90, 90, 90, 90, 90, 80, 75, 60 };
		int[] p = { 50, 65, 77, 90,102 };

//		int[] r = { 100, 100, 50, 40, 40, 20, 10 };
//		int[] p = { 5,25, 50, 120 };

		List<Integer> ranked = new ArrayList<>();
		List<Integer> player = new ArrayList<>();

		for (int r1 : r) {
			ranked.add(r1);
		}

		for (int p1 : p) {
			player.add(p1);
		}

		System.out.println(climbingLeaderboard(ranked, player));

	}


	private static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {

		List<Integer> result = new ArrayList<>();
		Set<Integer> s = new LinkedHashSet<Integer>();
		s.addAll(ranked);
		ranked.clear();
		ranked.addAll(s);

		int j = ranked.size();
		for (Integer p : player) {
			System.out.println("Executing player ranke " + p);
			while (j > 0) {
				if (ranked.get(j - 1) > p) {
					System.out.println("index is: " + j);
					break;
				}
				j--;
			}
				result.add(j+1);
		}
		return result;
	}
}
