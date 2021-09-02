package com.java8.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo /*implements Supplier<String>*/{
	
	/*@Override
	public String get() {
		return "Hello Java";
	}*/

	public static void main(String[] args) {
		//Supplier<String> supplier = () -> "Hello Java";	
		
		//System.out.println(supplier.get());
		
		//List<String> list = Arrays.asList("A","B");
		List<String> list = Arrays.asList();
		//System.out.println(list.stream().findAny().orElseGet(supplier));
		System.out.println(list.stream().findAny().orElseGet(() -> "Hello Java"));
	}

}
