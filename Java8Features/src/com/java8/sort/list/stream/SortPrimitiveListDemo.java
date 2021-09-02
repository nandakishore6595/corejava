package com.java8.sort.list.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortPrimitiveListDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(8);
		list.add(10);
		list.add(5);
		list.add(3);
		list.add(1);
		
		// Traditional Way Sorting
		Collections.sort(list);     //ascending
		Collections.reverse(list);     //descending
		System.out.println(list);
		
		//Using Stream API
		list.stream().sorted().forEach(s -> System.out.println(s));   // ascending
		list.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));   // ascending
		
	}

}
