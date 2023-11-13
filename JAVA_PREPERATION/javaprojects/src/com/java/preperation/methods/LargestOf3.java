package com.java.preperation.methods;

public class LargestOf3 {
	public void largestof3(int a,int b,int c) {
		if(a>b && a>c) {
			System.out.println(a+" is greater");
		}
		else if(b>c && b>a ) {
			System.out.println(b+" is greater");
		}
		else {
			System.out.println(c+" is greater");
		}
		
	}

}
