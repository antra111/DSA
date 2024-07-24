package com.antra;

public class ReverseANumber {
	public static int sum=0;
	public static void reverse1(int n) {
		if(n==0) return;
		int rem=n%10;
		sum=sum*10+rem;
		reverse1(n/10);
	}

	public static void main(String[] args) {
		//reverse1(12345);
		//System.out.println(sum);
		
		System.out.print(reverse2(12345));
	}
	//sometimes you might need some additional variables in the
	//argument, in that case, make another function
	public static int reverse2(int n) {
		int digits=(int) (Math.log10(n))+1;
		return helper(n,digits);
	}

	private static int helper(int n, int digits) {
		if(n%10 == n) return n; //if length of no is 1 return itself
		int rem=n%10;
		return (rem*(int) Math.pow(10,digits-1))+helper(n/10,digits-1);
		
	}
	
	
}
