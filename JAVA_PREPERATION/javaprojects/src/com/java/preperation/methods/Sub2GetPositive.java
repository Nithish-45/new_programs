package com.java.preperation.methods;

public class Sub2GetPositive {
	public void subpos(int a,int b) {
		if(a==b) {
			System.out.println(a+" and "+b +" are equal and result will be 0 i.e (a-b)= "+(a-b));
		}
		else if((a-b)>0) {
			System.out.println( a+" - "+b+" is positive and result will be = "+(a-b));
		}
		else {
			System.out.println( b+" - "+a+" is positive and the result will be = "+(b-a));

		}
		
	}

}
