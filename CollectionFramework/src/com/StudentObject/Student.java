package com.StudentObject;

public class Student 
{
	int rollNo1;
	String name1;
	float prsentage1;
	public Student(int rollNo1, String name1, float prsentage1)
	{
		this.rollNo1=rollNo1;
		this.name1=name1;
		this.prsentage1=prsentage1;
	}
	@Override
	public String toString() {
		return "Student [rollNo1=" + rollNo1 + ", name1=" + name1 + ", prsentage1=" + prsentage1 + "]";
	}
}
