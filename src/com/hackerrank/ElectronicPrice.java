package com.hackerrank;

public class ElectronicPrice {

	public static void main(String[] args) {
		int [] keyboards = {3,1};//{40,45,60};
		int [] drives = {5,2,8};//{5,13,18};
		int b=10; //60;
		System.out.println("max "+ getMoneySpent(keyboards, drives, b));
	}
	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
         int max=-1;
        if(keyboards.length >= drives.length) {
            for(int i=0;i<keyboards.length;i++) {
                for(int j=0;j<drives.length;j++) {
                    if (max < keyboards[i]+drives[j] && keyboards[i]+drives[j] <=b)
                        max=keyboards[i]+drives[j];
                }
            }
        } else {
            for(int i=0;i<drives.length;i++) {
                for(int j=0;j<keyboards.length;j++) {
                    if (max < drives[i]+keyboards[j] && drives[i]+keyboards[j] <=b)
                        max=drives[i]+keyboards[j];
                }
            }
        }
        return max;

    }
}
