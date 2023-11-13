package com.java.preperation.methods;

public class PrimeRange {
	public void primerange(int a,int b) {
		System.out.println("The prime number within "+a+" and "+b+" are");
		for(int i=a;i<=b;i++) {
			if(i==0 || i==1) {
				continue;
			}
			int count=0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					count=1;
					break;
				}
			}
			if(count==0) {
				System.out.println(i);
			}
			
		}
	}

}
