package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class TeamForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int skillsize=4;
		List <Integer> skills = new ArrayList<Integer>();
		skills.add(4);
		skills.add(8);
		skills.add(5);
		skills.add(6);
		int minp = 1;
		int ll = 5;
		int ul = 7;
		countTeams(skills,minp, ll, ul);

	}
	private static void countTeams(List<Integer> skills, int k, int l, int r) {
		
		ArrayList <Integer>fillteredList = new ArrayList<Integer>();
		for(Integer j : skills) {
			if(j >= l && j <=r) {
				fillteredList.add(j);
			}
		}
		
		
		System.out.println(getTeams(fillteredList.size(), k));
	}
	
	public static int getTeams(int n, int r) {
		int teams = 0;
		for(int i = r; i <=n; i++) {
		teams = teams + getCombination(n, i);
		}
		return teams;
		}
		
	public static int getCombination(int n, int r) {
		int combination = factorial(n)/(factorial(r) * factorial(n-r));
		return combination;
		}
		
		public static int factorial(int n) {
		int fact = 1;
		for(int i = 1; i <= n; i++) {
		fact = fact*i;
		}
		return fact;
		}

}
