package com.ArrayUseFor;

import java.util.*;

public class Program {

	public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(10);
	al.add(20);
	al.add(40);
	al.add(2,45);	
	System.out.println(al);
	
	ArrayDeque ad=new ArrayDeque();
	ad.addAll(al);
	System.out.println(ad);
	ad.clear();
	System.out.println(ad);
	
	PriorityQueue pq=new PriorityQueue();
	pq.add(40);
	pq.add(30);
	pq.add(60);
	pq.add(20);
	System.out.println(pq);
	pq.remove(30);
	System.out.println(pq);
	pq.iterator();
	System.out.println(pq);
	
	TreeSet ts=new TreeSet();
	ts.add(50);
	ts.add(10);
	ts.add(20);
	ts.add(30);
	System.out.println(ts);
	ts.first();
	System.out.println(ts);
	}
}
