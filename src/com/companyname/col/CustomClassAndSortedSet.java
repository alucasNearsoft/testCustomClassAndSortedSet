package com.companyname.col;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * The ClassCastException instance is thrown because the sorted
set implementation, an instance of TreeSet, is unable to call the Employee element’s compareTo()
method, because Employee does not implement Comparable.
 *
 */
class CustomClassAndSortedSet
{
	public static void main(String[] args)
	{
		SortedSet<Employee> sse = new TreeSet<>();
		sse.add(new Employee("Sally Doe"));
		sse.add(new Employee("Bob Doe")); // ClassCastException thrown here
		sse.add(new Employee("John Doe"));
		System.out.println(sse);
	}
}

class Employee
{
	private String name;
	Employee(String name)
	{
		this.name = name;
	}
	@Override
	public String toString()
	{
		return name;
	}
}
