// If you want to sort a map, then we can choose the TreeMap its automatically sorted basedon its key. If key may be primitivie or String.
// But if you want to sort a map using HashMap only. then the we can go for Collections.sort(list) method. But this expects argument as a List.
// How  we can convert the Map to List ?  get the Entry set from a map and add to the list..
// This below program is the user-defined object sorting based USING LAMBDA EXPRESSION

package com.java8.sort.map.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapDemoUsingLambda {

	public static void main(String[] args) {

		// Map<String, Integer> map = new TreeMap<>(); // sorted based on key
		Map<String, Integer> map = new HashMap<>();
		map.put("eight", 8);
		map.put("four", 4);
		map.put("six", 6);
		map.put("two", 2);

		List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
		
		// Using Lambda Expression
		Collections.sort(entries, ( o1, o2) -> o1.getKey().compareTo(o2.getKey())) ;

		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + "     " + entry.getValue());
		}
		
		
		// Using Stream API..
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);  // Sorting based on key
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);  // Sorting based on value

	}
}