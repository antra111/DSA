package com.antra;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=Fibo(n);
		System.out.println(ans);

	}

	private static int Fibo(int n) {
		if(n<2) return n;
		return Fibo(n-1)+Fibo(n-2);
	}

}
