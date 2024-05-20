package com.Comprator;

import java.util.ArrayList;
import java.util.Collections;


public class Student1App {

	public static void main(String[] args) {
		//creating the object of student class
		Student1 st1=new Student1(2,"Ajay",98.41f);
		Student1 st2=new Student1(1,"Amit",95.7f);
		Student1 st3=new Student1(3,"Anju",89.67f);
		//creating Array List
		ArrayList<Student1>al=new ArrayList<Student1>();
		//Storing the Student object in the ArrayList
		al.add(st1);
		al.add(st2);
		al.add(st3);
		//printing ArrayList
		System.out.println(al);
		//crating the object of sorting Helper class
		//in which compare method is present
		SortingHelper sh=new SortingHelper();
		//sorting of the object present in the arrayList
		//sort(al,sh) will call the campara present in the
		//sortingHelper class
		Collections.sort(al,sh);
		System.out.println(al);
	}

}
