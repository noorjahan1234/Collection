package com.Practice272;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList ld=new LinkedList();
		ld.add(12);
		ld.add(45);
		ld.add(12);
		ld.add(34);
		System.out.println(ld);
		ld.set(2, 32);
		ld.remove(0);
		System.out.println(ld);
	}

}
