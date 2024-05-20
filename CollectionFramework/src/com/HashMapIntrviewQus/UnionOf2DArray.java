package com.HashMapIntrviewQus;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UnionOf2DArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int n=sc.nextInt();
		System.out.println("Enter the second number");
		int m=sc.nextInt();
		
		int arr1[]=new int[n];
		int arr2[]=new int[m];
		System.out.println("Storing the first value");
		for(int i=0; i<n; i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Storing the second value");
		for(int i=0; i<m; i++) {
			arr2[i]=sc.nextInt();
		}
		System.out.println(union(arr1,arr2));
	}

	public static int union(int[] arr1, int[] arr2) {
		Set<Integer> set=new HashSet<>();//(0n^2)
		for(int i=0; i<arr1.length; i++) {
			set.add(arr1[i]);
		}
		for(int i=0; i<arr2.length; i++) {
			set.add(arr2[i]);
		}
		for(int set1 : set) {
			System.out.print(set1+" ");
		}
		System.out.println();
		System.out.println("Size");
		return set.size();
	}

}
