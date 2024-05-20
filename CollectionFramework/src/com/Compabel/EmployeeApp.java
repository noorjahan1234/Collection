package com.Compabel;

import java.util.ArrayList;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee ep1=new Employee("noor",12,40000);
		Employee ep2=new Employee("danish",14,45000);
		Employee ep3=new Employee("talib",16,50000);
		ArrayList al=new ArrayList();
		al.add(ep1);
		al.add(ep2);
		al.add(ep3);
		System.out.println(al);

		System.out.println(al.addAll(al));
		System.out.println(al.clone());
	}	
}
