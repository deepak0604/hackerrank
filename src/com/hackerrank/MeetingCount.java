package com.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class MeetingCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrival [] = {1,2,1,3};
		int depart[] = {3,2,1,3};
		int n =4;
		Map <Integer, ArrayList<Integer>> md = new HashMap<Integer, ArrayList<Integer>> ();
		Map<Integer,ArrayList<Integer>> m = new HashMap<Integer,ArrayList<Integer>>();
		for(int i=1; i<= n;i++) {
			md.put(i, new ArrayList<Integer>());
		}
		
		for(int i=0;i<arrival.length; i++) {
			ArrayList<Integer> l = new ArrayList<Integer>();
			for(int j=1,k=arrival[i];j <= depart[i]-arrival[i]+1;j++,k++) {
					md.get(j).add(new Integer(k));
					l.add(new Integer(k));
				}
				m.put(i,l);
		}
		System.out.println(m);
		}	
}