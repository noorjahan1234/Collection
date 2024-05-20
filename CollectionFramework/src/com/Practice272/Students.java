package com.Practice272;

public class Students implements Comparable<Students>
{
	int rollNo;
	String name;
	int age;
	public Students(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Students o) {
		if(this.rollNo<o.rollNo)
		{
			return -1;
		}
		if(this.rollNo>o.rollNo) {
			return 1;
		}
		else {
		return 0;
		}
	}
	@Override
	public String toString() {
		return "Students [rollNo=" + rollNo + ", name=" + name + ", age=" + age + "]";
	}
}
