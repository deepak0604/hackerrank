package com.hackerrank;

import java.io.CharConversionException;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Password.validatePassword("hello"));

	}

	private static boolean validatePassword(String pass) {
		boolean good = true;
		boolean lower = false;
		boolean upper  = false;
		boolean digit = false;

		// Length of min 6 and max 20
		if (pass.length() < 6 || pass.length() > 20)
		{			good = false;
		
		}
		else {
			// Check for lower and upper case
			char [] c = pass.toCharArray();
			
			for (int i = 0; i < c.length; i++) {
				
				
				if(c[i] == c[i+1])
					good = false;
				if (Character.isLowerCase(c[i])){
					lower= true;
				}
				if (Character.isUpperCase(c[i])) {
					upper = true;
				}
				if (Character.isDigit(c[i])) {
					digit = true;
				}
			}
		}
		
		return good&& upper&& lower&& digit;

	}

}
