// Custome Sorting logic of userdefined objects.

package com.java8.sort.list.stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortUserDefinedObjectListDemo {

	public static void main(String[] args) {
		
		List<Employee> employees = DataBase.getEmployees();
		
		//Traditonal way
		Collections.sort(employees, new MyComparator());
		System.out.println(employees);
		
	}

}

class MyComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		//return (int)(o1.getSalary() - o2.getSalary());  // ascending order based on salary
		return (int)(o2.getSalary() - o1.getSalary());  // descending order based on salary
	}
	
}
