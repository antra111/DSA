package com.antra;

import java.util.Scanner;

public class BS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		System.out.println(search(a, target, 0, n));
	}

	private static int search(int[] a, int target, int s, int e) {
		if (s > e) {
			return -1;
		}
		int m = s + (e - s) / 2;
		if (a[m] == target) {
			return m;
		}
		if (a[m] > target) {
			return search(a, target, 0, m);
		}
		return search(a, target, m + 1, e);
	}

}
