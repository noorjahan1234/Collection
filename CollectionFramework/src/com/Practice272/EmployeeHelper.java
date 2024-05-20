package com.Practice272;

import java.util.Comparator;

public class EmployeeHelper implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.id<o2.id) {
			return -1;
		}
		else if(o1.id>o2.id)
		{
			return 1;
		}
		else {
		return 0;
		}
	}

	@Override
	public String toString() {
		return "EmployeeHelper [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
