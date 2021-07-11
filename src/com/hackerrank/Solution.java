package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	static ArrayList<String> result = new ArrayList<>();
	
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        boolean canWin=false;
        boolean processFurther=true;
        int n= game.length;
        if(leap<=0){
        	processFurther=false;
            canWin=false;
        }
        if(leap >=n ){
        	processFurther=false;
            canWin=true;
        }
        //Apply logic because array has 0, 1
        int i= 0;
        
        while(i < n && processFurther){
            if((i+leap) > n-1 || i > n-1){
                canWin=true;
                break;
            }
            
            if(game[i+1] == 0){
                i=i+1;
                game[i]=1;
            }
            else if( i > 1 && game[i-1] == 0) {
                        i--;
                        game[i]=1;
            } 
            else if(game[i+leap]==0){
                    i=i+leap;
            		game[i]=1;
            }
            else {
             canWin=false;
              break;
            }
        }
        result.add(canWin?"YES":"NO");
        return canWin;
    }

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }
//    	int leap = 7;
//    	int [] game = {0,0,1,1,1,0,0,0,1,1,1,1,0,1,1,1,0,0,1,0,1}; 
    	//	int leap=3;
    		//int [] game={0,0,1,1,1,0}; //working
//    	int leap = 83;
//    	int [] game = {0,1,1,0,0,1,0,0,0,1,1,0,1,0,0,1,0,1}; 
            System.out.println( "Game Number: "+q + " game input "+ Arrays.toString(game) + "length leap: " + game.length+ " " + leap);
            System.out.println(((canWin(leap, game)) ? "YES" : "NO") );
        }
        scan.close();
        System.out.println("result length:"+ result.size()+ " " +result.toString());
    }
}
