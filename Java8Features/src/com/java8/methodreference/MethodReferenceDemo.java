// Functional programming means  passing function to another function.
// Method Reference in Java 8 means passing method to method
// Java  is call by values
// Java is CALL BY METHOD
package com.java8.methodreference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		
		List<String> namesList = Arrays.asList("Nanda","Kishore", "rajes");
		
		namesList.forEach(System.out::println);  
		// println is method
		// Here out is the static method. For static method we can write the Method reference as above.
		// For instance  methods we need to create the object explicitly and use its reference method for calling
		// Ex:   Out obj = new Obj();
		// namesList.forEach(obj::println); 
		//https://www.youtube.com/watch?v=svQKKg3aFzo&list=PLsyeobzWxl7qbvNnJKjYbkTLn2w3eRy1Q&index=10

	}

}
