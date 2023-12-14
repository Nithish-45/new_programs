package com.java.preperation.methods;

public class NthPrimeNumber {
	public int isprime(int a) {
		if(a==1) {
			return 0;
		}
		for(int i=2;i<a/2;i++) {
			if(a%i==0) {
				return 0;
			}
		}
		return 1;
	}
	
	public int nthprime(int n) {
	int i=2;
	while(n>=0) {
		if(isprime(i)==1) {
			n--;
		}
		i++;
	}
	i-=1;
	
	return i;	
	}

}
