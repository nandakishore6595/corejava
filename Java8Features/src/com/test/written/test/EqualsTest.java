package com.test.written.test;

public class EqualsTest {

	public static void main(String[] args) {
		String str = "abcdef";
		String str2 = new String(str);
		System.out.println(str==str2);
		System.out.println(str.equals(str2));
	}

}
