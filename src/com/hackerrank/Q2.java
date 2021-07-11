package com.hackerrank;

public class Q2 {
	public static void organize(int[] data, int i, int j) {
		if (i < j) {
			if ((data[j] % 2) == 0) {
				int temp = data[j];
				data[j] = data[i];
				data[i] = temp;
				organize(data, i + 1, j);
			} else {
				organize(data, i, j - 1);
			}
		}
	}

	public static void organize(int[] data) {
		organize(data, 0, data.length - 1);
	}

	public static void main(String[] args) {
//		int[] a = { 5, 28, 16, 3, 12, 6, 47, 93, 36 };
//		organize(a);
//		for (int e : a)
//			System.out.print(e + " ");
		
//		char a[]= {'u', 'v', 'w', 'w', 'v', 'u'};
		char a[]= {'u', 'v', 'w', 'u', 'v', 'u'};
//		System.out.println(pal1(a, 0, a.length-1));
//		System.out.println(pal2(a, 0, a.length-1));
//		System.out.println(pal3(a, 0, a.length-1));
//		System.out.println(pal4(a, 0, a.length-1));
		
		int a1 []= {1,2,3};//,5,6,7,8,9,10};
		int b1 [] = {2,3,10};
		
//		System.out.println(method1(a1,b1));
//		System.out.println(method1(a1,a1.length));
		System.out.println(method1(a1,a1.length));
		
	}
	 
	public static int method2(int[ ] a, int x, int y) { // this method returns integer
		System.out.println("x:"+x+"y:"+y);
	        if (x >= y) {
	            return a[x];
	        }
	        else {
	            int z = (x + y) / 2;
	            System.out.println("z:"+z);
	            return(method2(a, x, z) + method2(a, z+1, y));
//	            	return a[x];
//	            else
//	            	return a[z];
	            	
	        }
	    }

	public static int method7(int m, int n) {
		System.out.println("m:"+m+" n:"+n);
		if ((m == 0) || (n == 0)) return 0;
		else if (n > 0) return m + method7(m, n - 1);
		else {
			if (m > 0) 	return m + method7(n-1, m);
			else return method7(-m, -n);
		}
	}

	public static int method6(int a, int b) { // this method returns integer
//		System.out.println("a:"+a+" b:"+b);
	      if (b == 0) {
	           return 1;
	       }
	      else {
	          int x = method6(a, b/3);
	          int y = 2 * x;
//	          System.out.println("x: "+x+" y:"+y);
	          if (b % 2 == 1)
	              y = y + a;
	          System.out.println(y); 
	          return y;
	       }
	}
	
	public static int method5(int a, int n) {
		if (n <1)
			return 1;
		else {
			int x= n;
			while (x>=1) {
				a = a+a;
				x=x-1;
			}
			return (a+method5(a,n-1));
		}
	}
	public static int method1(int[ ] a, int n) { // this method returns an integer
		System.out.println("n:"+n);
        if (n < 1)
            return a[n];
        else {
            int sum = 0;
            for (int i=0; i<n; i++) {
            	System.out.println("n:"+n);
                sum = sum + a[i];
            }
            return (sum - method1(a, n-1));
        }
   }
	public static boolean pal1(char[] a, int x, int y) {
		if (x >= y)
			return true;
		if (a[x] == a[y])
			return (pal1(a, x + 1, y - 1));
		else {
			return false;
		}
	}

	public static boolean pal2(char[] a, int x, int y) {
		boolean palindrome = true;
		if (x >= y)
			return true;
		else {
			if (a[x] == a[y])
				return (pal2(a, x + 1, y - 1));
			else {
				palindrome = false;
			}
		}
		return palindrome;
	}

	public static boolean pal3(char[] a, int x, int y) {
		if (x >= y)
			return true;
		if (a[x] == a[y])
			return (pal3(a, x + 1, y - 1));
		return false;
	}

	public static boolean pal4(char[] a, int x, int y) {
		boolean palindrome = true;
		if (x >= y)
			palindrome = true;
		else {
			if (a[x] == a[y])
				pal4(a, x + 1, y - 1);
			else {
				palindrome = false;
			}
			return palindrome;
		}
		return palindrome;
	}
	public static int method1(int[] a, int[] b) {
		int n = a.length;
		int count = 0;
		for (int i=0; i<n; i++) {
		  int total = 0;
		  for (int j=0; j<n; j++) 
		    for (int k=0; k<=j; k++) {
		      total += a[k];
//		  	  System.out.println(total+" "+a[k]);
		    }
		  System.out.println("b["+i+"]"+b[i]+" total:"+total);
		  if (b[i] == total) count++;
		}
		return count;
		}
	

}