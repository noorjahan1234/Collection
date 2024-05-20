package com.HashMapIntrviewQus;

import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {

	public static void majorityElement(int[] nums) {
		HashMap<Integer, Integer> map=new HashMap<>();
		int num=nums.length;
		System.out.println("Print MajorityElement");
		for(int i=0; i<num; i++) {
			// key map exist then print frequency+1
			if(map.containsKey(nums[i]))
			{
				map.put(nums[i], map.get(nums[i])+1);
			}
			//key map not exist then print value 1
			else {
				map.put((nums[i]), 1);
			}
			
			for(int key : map.keySet()) {
				if(map.get(key)>num/3) {
					System.out.println(key);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the Number");
//		int n=sc.nextInt();
//		int[] nums=new int[n];
//		for(int i=0; i<n; i++) {
//			nums[i]=sc.nextInt();
//		}
		//int nums[]= {4,1,5,4,2,6,4,8,4};
		int nums[]= {1,2};
		majorityElement(nums);
	}
}
