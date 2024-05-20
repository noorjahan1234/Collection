package com.Compabel;

public class Employee implements Comparable<Employee>
{
	String name;
	int id;
	float salary;
	public Employee(String name, int id , float salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	@Override
	public int compareTo(Employee e) {
		if(this.id >= e.id)
		{
			return 1;
		}
		if(this.id <= e.id)
		{
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
		
}
