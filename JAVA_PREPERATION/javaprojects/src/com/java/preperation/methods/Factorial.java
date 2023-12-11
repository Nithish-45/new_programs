package com.java.preperation.methods;

public class Factorial {
	public void factorial(int n) {
		int a=n;
		int fact=1;
		while(n!=0) {
			
			fact*=n;
			n--;
		}
		System.out.println("Factorial of "+a+" = "+fact);
	}
	
	//factorial using recursion
	public int fact(int n) {
		int result=1;
		if(n>0) {
			result= n*fact(n-1);
			
			n--;
		}
		return result;
	}

}
