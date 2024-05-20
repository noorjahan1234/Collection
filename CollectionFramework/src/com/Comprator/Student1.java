package com.Comprator;

import java.util.Comparator;

public class Student1 
{
	int rollNo1;
	String name1;
	float prsentage1;
	public Student1(int rollNo1, String name1, float prsentage1)
	{
		this.rollNo1=rollNo1;
		this.name1=name1;
		this.prsentage1=prsentage1;
	}

	@Override
	public String toString() {
		return "Student1 [rollNo1=" + rollNo1 + ", name1=" + name1 + ", prsentage1=" + prsentage1 + "]";
	}
}
