package com.antra.basics;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println(palindrome(1221));
	}
	
	public static boolean palindrome(int n) {
		return n==reverse2(n);
	}
	public static int reverse2(int n) {
		int digits=(int) (Math.log10(n))+1;
		return helper(n,digits);
	}

	private static int helper(int n, int digits) {
		if(n%10 == n) return n; 
		int rem=n%10;
		return (rem*(int) Math.pow(10,digits-1))+helper(n/10,digits-1);
		
	}
	
	
}
