package com.java.preperation.methods;

public class PrimeOrNot {
	public static void CheckPrime(int a){
		if(a==1 || a==0) {
			System.out.println("not a prime number");
		}else {
			int count=0;

		for(int i=1;i<a/2;i++) {
			if(a%i==0){
//				System.out.println(i);
				count++;
			}					
		}
		if(count>=2) {
			System.out.println(a+" is not prime number");
		}
		else {
			System.out.println(a+ " is prime number");
		}
		}
		
	}

}
