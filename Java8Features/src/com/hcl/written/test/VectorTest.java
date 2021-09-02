package com.hcl.written.test;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<String>();
		
		vector.add(1, new String("atew"));
		vector.add(2, new String("atee"));
		vector.add(3, new String("ater"));
		
		boolean bool = vector.removeAll(vector);
		System.out.println(bool); // false
	}

}
