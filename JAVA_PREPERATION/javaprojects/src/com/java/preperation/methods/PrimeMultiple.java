package com.java.preperation.methods;

public class PrimeMultiple {
	public void primemulti(int n) {
		while(n%2==0) {
			System.out.print("2"+" ");
			n=n/2;
		}
		for(int i=3;i<=n/2;i++) {
			while(n%i==0) {
				System.out.print(i+" ");
				n=n/i;
			}
		}
		if(n>2) {
			System.out.print(n);
		}
		
	}
	

}
