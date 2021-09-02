package com.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("nanda");
		list.add("kishore");
		list.add("rajesj");
		list.add("dilip");
		list.add("Abc");
		
		for (String s : list) 
			System.out.println(s);
		// Using Stream API
		
		//void Test(T t); -- forEach used Consumer as parameter, this interface contains the Test(T t) method
		list.stream().forEach(t -> System.out.println(t));
	}

}
