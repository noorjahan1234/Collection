package com.TreeSet;

import java.util.TreeSet;

public class GenriceProgram {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(60);
		ts.add(20);
		ts.add(50.4f); //error
		ts.add("java"); 	//Compilation error
		ts.add(true);
		System.out.println(ts);
		
		TreeSet ts1=new TreeSet();
		ts1.add(60.f);
		ts1.add(20);
		ts1.add("java");  //error
		ts1.add(10);
		ts1.add("python");		//exception classCastException
		System.out.println(ts);
	}

}
