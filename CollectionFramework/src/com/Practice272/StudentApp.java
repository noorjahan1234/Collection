package com.Practice272;

import java.util.ArrayList;

public class StudentApp {

	public static void main(String[] args) {
		Student st1=new Student(1, "noor" ,45000.0f);
		Student st2=new Student(2, "nurysa" ,55000.0f);
		Student st3=new Student(3, "nilu" ,35000.0f);
		ArrayList list=new ArrayList();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st2);
		System.out.println(list);
	}

}
