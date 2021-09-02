package com.java8.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	/*
	 * @Override public boolean test(Integer t) { // TODO Auto-generated method stub
	 * return false; }
	 */

	public static void main(String[] args) {
		/*Predicate<Integer> pre = (t) ->  t % 2 == 0;
		System.out.println(pre.test(101));*/
		
		List<Integer> list = Arrays.asList(1,2,4,5,6);
		list.stream().filter(t ->  t % 2 == 0).forEach(t -> System.out.println("Print Even ::"+t));
	}

}
