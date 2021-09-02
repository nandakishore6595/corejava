package com.java8.sort.list.stream;

import java.util.ArrayList;
import java.util.List;
//DAO layer
public class DataBase {

	public static List<Employee> getEmployees() {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(176, "Nanda", "IT", 6000));
		list.add(new Employee(388, "Kishore", "CIVIL", 9000));
		list.add(new Employee(470, "Rajesh", "DEFENCE", 5000));
		list.add(new Employee(624, "Dilip", "CORE", 4000));
		list.add(new Employee(176, "Prakash", "SOCIAL", 12000));
		return list;
	}

}