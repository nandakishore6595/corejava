// If you want to sort a map, then we can choose the TreeMap its automatically sorted basedon its key. If key may be primitivie or String.
// But if you want to sort a map using HashMap only. then the we can go for Collections.sort(list) method. But this expects argument as a List.
// How  we can convert the Map to List ?  get the Entry set from a map and add to the list..
// This below program is the user-defined object sorting based on the traditional way.
// In this program key as a Object & value is primitive

package com.java8.sort.map.stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortMapDemo1 {

	public static void main(String[] args) {

		Map<Employee, Integer> employeeMap = new HashMap<>();
		employeeMap.put(new Employee(1, "nanda", "IT", 50000), 1000);
		employeeMap.put(new Employee(4, "kishore", "SA", 30000), 2000);
		employeeMap.put(new Employee(2, "rajesh", "BA", 40000), 4000);
		employeeMap.put(new Employee(3, "dilip", "TA", 55000), 3000);
		
		// Sorting based on salary ascending order
		employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(System.out::println);
		employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept))).forEach(System.out::println);
		
		// Sorting based on salary DESCENDING order
		employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed())).forEach(System.out::println);
		employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept).reversed())).forEach(System.out::println);


		

	}
}