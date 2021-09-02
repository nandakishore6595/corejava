package com.test.written.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordCount {

	public static void main(String[] args) {
		// no of words
		String str = "my name is nanda kishore kishore";
		String delimeter = " ";
		String words[] = str.split(delimeter);
		System.out.println(words.length);
		
		//Word Count
		List<String> list = Arrays.asList(str.split(" "));
		Set<String> uniqueWords = new HashSet<String>(list);
		for (String word : uniqueWords) {
            System.out.println(word + ": " + Collections.frequency(list, word));
        }
		
		
		//Remove Charcters from string
		String ovels ="aeiou";
		String actString = "nandakishore";
		System.out.println(actString.replaceAll("[aeiou]", ""));
		
		// Current Age
		LocalDate today = LocalDate.now();                          //Today's date
		LocalDate birthday = LocalDate.of(1982, Month.AUGUST, 2);  //Birth date
		 
		Period p = Period.between(birthday, today);
		System.out.println(p.getDays());
		System.out.println(p.getMonths());
		System.out.println(p.getYears());
		
		
		
		try {
			Class c =Class.forName("VectorTest");
			c.isInterface();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
