package com.HashsetProject;

import java.util.*;

public class Program1 {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(23);
		hs.add(12);
		hs.add(61);
		System.out.println(hs);
		
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(45);
		lhs.add(34);
		lhs.addAll(hs);
		System.out.println(lhs);

	}

}
