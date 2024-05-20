package com.Practice272;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentsApp {

	public static void main(String[] args) {
		Students st1=new Students(1,"soni",21);
		Students st2=new Students(6,"Mohit",27);
		Students st3=new Students(3,"khusi",23);
		Students st4=new Students(4,"nurysa",25);
		ArrayList<Students> al=new ArrayList<>();
		al.add(st1);
		al.add(st2);
		al.add(st3);
		al.add(st4);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Iterator it=al.iterator();
		System.out.println(it);
	}

}
