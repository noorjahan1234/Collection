package com.Practice272;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class MapView {

	public static void main(String[] args) {
		TreeMap tm=new TreeMap();
		tm.put(1, 10);
		tm.put(2, 20);
		tm.put(3, 30);
		tm.put(4, 40);
		System.out.println(tm);
		Set set=tm.keySet();
		for(Object x:set)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		Collection val=tm.values();
		for(Object x:val)
		{
			System.out.print(x+" ");
		}
		Set entery=tm.entrySet();
		for(Object x:entery)
		{
			System.out.print(x+" ");
		}
	}

}
