// If you want to sort a map, then we can choose the TreeMap its automatically sorted basedon its key. If key may be primitivie or String.
// But if you want to sort a map using HashMap only. then the we can go for Collections.sort(list) method. But this expects argument as a List.
// How  we can convert the Map to List ?  get the Entry set from a map and add to the list..
// This below program is the user-defined object sorting based on the traditional way.
// In this program key as a String & value is primitive

package com.java8.sort.map.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapDemo {

	public static void main(String[] args) {

		// Map<String, Integer> map = new TreeMap<>(); // sorted based on key
		Map<String, Integer> map = new HashMap<>();
		map.put("eight", 8);
		map.put("four", 4);
		map.put("six", 6);
		map.put("two", 2);

		List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());

		Collections.sort(entries, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				//return o1.getKey().compareTo(o2.getKey());  // ascending based on the key
				return o1.getValue().compareTo(o2.getValue());  // ascending based on the value
			}

		});

		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + "     " + entry.getValue());
		}

	}
}