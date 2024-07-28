package com.antra.patterns;

import java.util.Arrays;

public class Triangle {

	public static void main(String[] args) {
		//triangle(4,0);
		//triangle2(4,0);
		int arr[]= {4,3,2,1};
		BubbleSort(arr,arr.length-1,0);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void triangle(int r,int c) {
		if(r==0) {
			return;
		}
		
		if(c < r) {
			System.out.print("*");
			triangle(r,c+1);
		}else {
			System.out.println();
			triangle(r-1,0);
		}
	}
	
	public static void triangle2(int r,int c) {
		if(r==0) {
			return;
		}
		
		if(c < r) {
			triangle2(r,c+1);
			System.out.print("*");
		}else {
			triangle2(r-1,0);
			System.out.println();
		}
	}
	
	public static void BubbleSort(int arr[],int r,int c) {
		if(r==0) {
			return;
		}
		
		if(c < r) {
			if(arr[c] > arr[c+1]) {
				//swap
				int temp=arr[c];
				arr[c]=arr[c+1];
				arr[c+1]=temp;
			}
			BubbleSort(arr,r,c+1);
		}else {
			
			BubbleSort(arr,r-1,0);
		}
	}

}
