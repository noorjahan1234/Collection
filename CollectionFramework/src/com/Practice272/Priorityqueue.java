package com.Practice272;

import java.util.PriorityQueue;

public class Priorityqueue {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
//		pq.add(42);
//		pq.add(12);
//		pq.add(45);
//		pq.add(90);
//		pq.add(34);
		pq.add(13);
		pq.add(15);
		System.out.println(pq);
		//the comparator used to order this queue, or null if this queue is sorted according to the natural ordering of its elements
		System.err.println(pq.comparator());
		
		System.out.println(pq.contains(13));//false
		System.out.println(pq.contains(45));//true
		//the head of this queue
		System.out.println(pq.element());//13
		//true if this object is the same as the objargument; false otherwise
		System.out.println("equals: "+pq.equals(pq));
		}
}
