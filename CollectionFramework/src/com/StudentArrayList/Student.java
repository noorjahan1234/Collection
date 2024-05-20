package com.StudentArrayList;

public class Student implements Comparable<Student> {
	int rollNo;
	String name;
	float prsentage;
	public Student(int rollNo, String name, float prsentage)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.prsentage=prsentage;
	}
	public int compareTo(Student o)
	{
	if(this.rollNo>o.rollNo)
	{
		return 1;
	}
	if(this.rollNo<o.rollNo)
	{
		return -1;
	}
	else
	 {
		return 0;
	}
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", prsentage=" + prsentage + "]";
	}
}
