package com.Practice272;

import java.util.ArrayDeque;

public class Arraydeque {

	public static void main(String[] args) {
		ArrayDeque ad=new ArrayDeque();
		ad.add(34);
		ad.add(23);
		ad.add(45);
		System.out.println(ad);
		ad.addFirst(78);
		ad.addLast(23);
		System.out.println(ad);
//		ad.size();
//		System.out.println(ad);
		ad.clear();
		System.out.println(ad);
	}

}
