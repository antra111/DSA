package com.antra.basics;

import java.util.Arrays;

public class SumOfTriangleFromArrayWithoutLoop {
	public static void main(String args[]) {
		int arr[]= {1,2,3,4,5};
		sum(arr);
	}

	private static void sum(int[] arr) {
		if(arr.length < 1) return;
		int[] temp =new int[arr.length-1];
		int i=0;
		print(temp,arr,i);
		sum(temp);
		System.out.println(Arrays.toString(arr));
		
	}

	private static int[] print(int[] temp, int[] arr, int i) {
		if(i == arr.length-1) return temp;
		temp[i]=arr[i]+arr[i+1];
		return print(temp,arr,i+1);
	}

}
