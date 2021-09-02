// Custome Sorting logic of userdefined objects.
// Instead of writing separate class whose implements Comparator<Employee> inteface, we use the lambda  expression as below
// Here Comparator is the functional interface means, we can go for LambdaExpression implementations.

package com.java8.sort.list.stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortUserDefinedObjectListDemo1 {

	public static void main(String[] args) {

		List<Employee> employees = DataBase.getEmployees();

		// The separate class method is included within the sort() only, for reducing the code using anonymous implementation
		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// return (int)(o1.getSalary() - o2.getSalary()); // ascending order based on salary
				return (int) (o2.getSalary() - o1.getSalary()); // descending order based on salary, if we want descending just swap the object reference.
			}

		});
		System.out.println(employees);
		
		
		// Using Lambda Implementations
		Collections.sort(employees, (o1, o2) -> (int)(o1.getSalary() - o2.getSalary())); // ascending
		System.out.println(employees);
		
		
		// Using Stream API
		employees.stream().sorted((o1, o2) -> (int)(o1.getSalary() - o2.getSalary())).forEach(System.out::println);  // ascending
		
		// Usin Method reference of functional Inteface
		employees.stream().sorted(Comparator.comparing(emp -> emp.getSalary())).forEach(System.out::println);   // based on salary ascending sort
		employees.stream().sorted(Comparator.comparing(emp -> emp.getName())).forEach(System.out::println);   // based on salary ascending sort
		

	}

}
