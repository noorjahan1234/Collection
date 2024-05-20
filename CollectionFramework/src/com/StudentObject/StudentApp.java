package com.StudentObject;

import java.util.ArrayList;

import com.StudentArrayList.Student;

public class StudentApp {

	public static void main(String[] args) 
	{
		Student st1=new Student(2,"Ajay",98.41f);
		Student st2=new Student(1,"Amit",95.7f);
		Student st3=new Student(3,"Anju",89.67f);
		//creating Array List
		ArrayList<Student>al=new ArrayList<Student>();
		//Storing the Student object in the ArrayList
		al.add(st1);
		al.add(st2);
		al.add(st3);
		//printing ArrayList
		System.out.println(al);
	}

}
