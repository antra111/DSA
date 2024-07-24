package com.antra;

public class OnetoN {

	public static void main(String[] args) {
		funBoth(5);
	}

	public static void fun(int n) { // 1 2 3 4 5
		if (n == 0)
			return;
		fun(n - 1);
		System.out.print(n + " ");
	}
	
	public static void funRev(int n) {// 5 4 3 2 1
		if (n == 0)
			return;
		System.out.print(n + " ");
		funRev(n - 1);
		
	}
	
	public static void funBoth(int n) {//5 4 3 2 1 1 2 3 4 5
		if (n == 0)
			return;
		System.out.print(n + " ");
		funBoth(n - 1);
		System.out.print(n + " ");
		
	}
	
	

}
