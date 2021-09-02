package com.java8.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo{

	/*@Override
	public void accept(Integer t) {
		System.out.println(t);
		
	}*/
	
	public static void main(String[] args) {
		Consumer<Integer> con = (t) -> System.out.println(t);
		con.accept(100);
		
		List<Integer> list = Arrays.asList(1,2,4,5,6);
		list.stream().forEach(con);
	} 
}
