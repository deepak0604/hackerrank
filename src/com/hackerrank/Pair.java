package com.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr  = {10, 20, 20, 10, 10, 30, 50, 10, 20};//{1,2,1,2,1,1,2,4,5,4,4,5};//{1 ,1 ,3 ,1 ,2 ,1, 3, 3, 3 ,3};//{1,2,1,2,1,3,2}; //{10, 20, 20, 10, 10, 30, 50, 10, 20};
		List<Integer> l = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			l.add(arr[i]);
		}
		//Answer
		Collections.sort(l);
		int cnt = 1; //counting number of digit appearing in the list
		int tot =0 ; //Final Result
		int prev=-1; //store previous number to compare with current
		for(Integer i : l) {
			if(i == prev) {
				cnt++;
			}
			else {
				tot = (cnt/2)+tot;
				System.out.println("number "+prev + " digit cnts:"+cnt + "Total pair counts:"+(cnt/2));
				cnt=1;
			}
			prev= i;
		}
		tot = (cnt/2)+tot;
		System.out.println("number "+prev + "digit cnts:"+cnt+ "Total pair counts:"+(cnt/2));
		System.out.println(tot);
	}
}