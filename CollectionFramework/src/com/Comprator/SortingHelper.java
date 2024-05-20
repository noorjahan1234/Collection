package com.Comprator;

import java.util.Comparator;


public class SortingHelper implements Comparator<Student1>
{
	@Override
	public int compare(Student1 o1, Student1 o2) {
		if(o1.rollNo1 < o2.rollNo1)
		{
			return -1;
		}
		else if(o1.rollNo1 > o2.rollNo1)
		{
			return 1;
		}
		else
		{
		return 0;
		}
	}

}
