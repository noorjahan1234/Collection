package com.Practice272;

import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		TreeMap<String, Integer> tm=new TreeMap<>();
		tm.put("Bihar", 7893300);
		tm.put("Hydrabad", 9893300);
		tm.put("Jharkhand", 4993300);
		tm.put("Bangaluru", 8793300);
		System.out.println(tm);
		//searching the key persent or not in the map
		if(tm.containsKey("Bihar"))
		{
			System.out.println("key is exist");
		}
		else
		{
			System.out.println("Key not exist");
		}
		if(tm.containsValue(5678902))
		{
			System.out.println("value is exist");
		}
		else {
			System.out.println("value are not exist");
		}
	}
}
