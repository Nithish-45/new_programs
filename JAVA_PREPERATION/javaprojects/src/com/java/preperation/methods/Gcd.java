package com.java.preperation.methods;

public class Gcd {
	public static void gcd() {
		int n1=20,n2=100;  
		while(n1!=n2)   
		{  
		if(n1>n2)  
		n1=n1-n2;  
		else  
		n2=n2-n1;  
		}  
		System.out.printf("GCD of " +n1+ " and "+n2+" is: " +n2); 
	}

	
}
