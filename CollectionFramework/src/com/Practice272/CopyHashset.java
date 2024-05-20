package com.Practice272;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class CopyHashset {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		hs.add("Sadik");
		hs.add("hamza");
		hs.add("rohit");
		hs.add("riva");
		System.out.println("Before Hashset");
		System.out.println(hs);
		HashSet<String> copyhs=new HashSet<>();
		copyhs.addAll(hs);
		System.out.println("After hashset");
		System.out.println(copyhs);
		ArrayList<String> al=new ArrayList<>();
		ListIterator<String> i=(ListIterator<String>) al.iterator();
		al.addAll(copyhs);
		Collections.sort(al);
		System.out.println(al);
		HashSet<String> appendedSet=new HashSet<>();
		appendedSet.add("Noor");
		System.out.println(appendedSet);
	}

}
