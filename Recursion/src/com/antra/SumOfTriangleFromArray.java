package com.antra;

import java.util.Arrays;

public class SumOfTriangleFromArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		sum(arr);
	}

	private static void sum(int[] arr) {
		if(arr.length < 1) return;
		int[] temp =new int[arr.length-1];
		for(int i=0;i<arr.length-1;i++) {
			temp[i]=arr[i]+arr[i+1];
		}
		sum(temp);
		System.out.println(Arrays.toString(arr));
	}

}
//Follow up => Without using for loop
