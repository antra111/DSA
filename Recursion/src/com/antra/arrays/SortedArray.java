package com.antra.arrays;

public class SortedArray {

	public static void main(String[] args) {
		System.out.print(sorted(new int[]{1,2,8,4,5}));

	}
	
	public static boolean sorted(int a[]) {
		return helper(a,0);
	}

	private static boolean helper(int[] a, int i) {
		if(i== a.length-1) return true;
		return (a[i]<a[i+1]) && helper(a,i+1);
		
	}

}
