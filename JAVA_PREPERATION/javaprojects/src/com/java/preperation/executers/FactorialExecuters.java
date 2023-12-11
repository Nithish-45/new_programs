package com.java.preperation.executers;

import com.java.preperation.methods.Factorial;

public class FactorialExecuters {
	public static void main(String[] args) {
		Factorial ref =new Factorial();
		ref.factorial(5);
		//using recursion
		System.out.println(ref.fact(5));
	}
}
