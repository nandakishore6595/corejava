package com.java8.lambda;

public class LambdaDemo {

	public static void main(String[] args) {

		LambdaInterface obj = (eno, ename) -> {
			System.out.println("Employee No:  "+eno);
			System.out.println("Employee Name:  "+ename);
			return ""+ename;
		};

		System.out.println(obj.add(100, "nanda"));
	}

}
