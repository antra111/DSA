package com.antra.basics;

public class ProdOfDigits {

	public static void main(String[] args) {
			System.out.println(prod(1342));
	}
	
	public static int prod(int n) {
		if(n%10 == n) return 1;
		return prod(n/10)*(n%10);
	}

}
