package com.HashMapIntrviewQus;

import java.util.HashMap;

public class Tikate {

	public static String getStart(HashMap<String, String> tikets) {
		//i take reverse map
		HashMap<String, String> remap=new HashMap<>();
		
		//reverse key and value map
		for(String key : tikets.keySet()) {
			remap.put(tikets.get(key), key);
		}
		for(String key : tikets.keySet()) {
			//reverse map dosen't exist
			if(!remap.containsKey(key)) {
				return key;
			}
		}
		return null;
	}
	public static void main(String[] args) {
		HashMap<String, String> tikets = new HashMap<>();
		tikets.put("chennai", "Benglore");
		tikets.put("Mumbai", "Delhi");
		tikets.put("Goa", "chennai");
		tikets.put("Delhi", "Goa");
		String start=getStart(tikets);
		while(tikets.containsKey(start)) {
			System.out.print(start+"-->");
			start=tikets.get(start);
		}
		System.out.println(start);
	}

}
