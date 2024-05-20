package com.ArrayList;

import java.util.*;

public class Program {

	public static void main(String[] args) 
	{
		ArrayList<Float> al=new ArrayList<Float>();
		al.add(34.12f);
		al.add(30.00f);
		al.add(83.00f);
		al.add(80.0f);
		al.add(65.12f);
		al.add(76.34f);
		System.out.println(al);
		
		LinkedList<Boolean>ll=new LinkedList<Boolean>();
		ll.add(true);
		ll.add(false);
		ll.add(true);
		ll.add(false);
		ll.add(true);
		System.out.println(ll);
		
		ArrayDeque<Character> ad=new ArrayDeque<Character>();
		ad.add('N');
		ad.add('O');
		ad.add('O');
		ad.add('R');
		ad.add('N');
		System.out.println(ad);
	}

}
