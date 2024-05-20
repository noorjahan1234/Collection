package com.StudentArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class StudentApp {

	public static void main(String[] args) {
		//creating object of student class
		Student st1=new Student(2,"Ajay",98.41f);
		Student st2=new Student(1,"Amit",95.7f);
		Student st3=new Student(3,"Anju",89.67f);
		//creating Array List
		ArrayList<Student> al=new ArrayList<Student>();
		//Storing the Student object in the ArrayList
		al.add(st1);
		al.add(st2);
		al.add(st3);
		// printing ArrayList to display Student object details before storing
		System.out.println(al.toString());
		//sorting of the object present in the arrayList
		//sort() internaly calls the compared present in the student class
		Collections.sort(al);
		//printing arraylist to display student object details after sorting 
		System.out.println(al);
	}

}
