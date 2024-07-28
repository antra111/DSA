package com.antra.arrays;

import java.util.ArrayList;

public class LinearSearch {
	public static void main(String args[]) {
		System.out.println(search(new int[] {3,2,1,18,9},18,0));
		System.out.println(searchIndex(new int[] {3,2,1,18,9},18,0));
		System.out.println(searchIndexLast(new int[] {3,2,1,18,9},18,4));
		searchAllIndexs(new int[] {3,2,18,18,9},18,0);
		System.out.println(al);
		//System.out.println(searchAllIndexs(new int[] {3,2,18,18,9},18,0,new ArrayList<>()));
		ArrayList<Integer> list=new ArrayList<>();
		ArrayList<Integer> ans=searchAllIndexs(new int[] {3,2,18,18,9},18,0,list);
		System.out.println(list);
		System.out.println(ans);
		//both list and ans are same, original list is being modified.
		//searchAllIndexs(new int[] {3,2,18,18,9},18,0,list); is actually equal to list
		//hence, ans=list
		
		System.out.println(searchAllIndexs2(new int[] {3,2,18,18,9},18,0));
		
	}
	
	public static boolean search(int a[],int target,int index) {
		if(index == a.length) return false;
		return (a[index]==target)|| search(a,target,index+1);
	}
	
	public static int searchIndex(int a[],int target,int index) {
		if(index == a.length) return -1;
		if(a[index]==target) return index;
		return searchIndex(a,target,index+1);
	}
	
	public static int searchIndexLast(int a[],int target,int index) {
		if(index == -1) return -1;
		if(a[index]==target) return index;
		return searchIndexLast(a,target,index-1);
	}
	//static list
	static ArrayList<Integer> al=new ArrayList<>();
	public static void searchAllIndexs(int a[],int target,int index) {
		if(index == a.length) return;
		if(a[index]==target) al.add(index);
		searchAllIndexs(a,target,index+1);
	}
	
	public static ArrayList<Integer> searchAllIndexs(int a[],int target,int index,ArrayList<Integer> al) {
		if(index == a.length) return al;
		if(a[index]==target) al.add(index);
		return searchAllIndexs(a,target,index+1,al);
	}
	
	public static ArrayList<Integer> searchAllIndexs2(int a[],int target,int index) {
		ArrayList<Integer> list=new ArrayList<>();
		if(index == a.length) {
			return list;
		}
		//this list contains answer of only that function call
		if(a[index]==target) {
			list.add(index);
		}
		
		ArrayList<Integer> ansFromBelowFunctionCalls=searchAllIndexs2(a,target,index+1);
		list.addAll(ansFromBelowFunctionCalls);
		return list; //this is the point where we are returning the function
	}
	
}
