package com.hackerrank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoSet {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		a.add(2);
		a.add(4);
		b.add(16);
		b.add(32);
		b.add(96);
		TwoSet.getTotalX(a, b);	
	}
	
	
	public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
	int  maxNum = b.get(b.size()-1); //36
	
	System.out.println("Print max num "+maxNum);
	
	Set<Integer> result = new HashSet<Integer>();
	
    for ( int i = 1 ; i <= maxNum;i++){
    	boolean good =true;
    	System.out.println("....Processing for Integer "+i);
    	for(int j=0;  j < a.size();j++) {
    		System.out.println("value of array a "+a.get(j) + " good: "+good);
    		if(i % a.get(j) !=0) {
    			good= false;
    			break;
    		}
    		} //array a loop end
    	
    	for (int k=0;k< b.size() && good==true;k++) {
    		if(b.get(k)%i !=0) {
    			good= false;
    		}
    		System.out.println("value of array b "+b.get(k)+ " divided by "+ i + " good: "+good);
    	}
    	if(good) {
    		result.add(i);
    	}
    	}
	
    System.out.println(result);
	
    return result.size();
	}
}