package com.Practice272;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee ep1=new Employee(111,"sohit",5600);
		Employee ep2=new Employee(121,"rohit",5603);
		Employee ep3=new Employee(131,"mohit",5200);
		
		ArrayList<Employee> ali=new ArrayList<>();
		ali.add(ep1);
		ali.add(ep2);
		ali.add(ep3);
		System.out.println(ali.toString());
		
		EmployeeHelper eh=new EmployeeHelper();
		Collections.sort(ali,eh);
		System.out.println(ali);
	}

}
