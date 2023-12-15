package com.java.preperation.methods;

public class DisplayAlternatePrimeNumber {
	public void displayaltprime(int n) {
		int flag=0;

		for(int i=2;i<=n-1;i++) {
			int count=0;
			for(int j=2;j<=i;j++) {
				if(i%j==0) {
//					System.out.println(i);
					count++;
				}
			}
			if(count==1) {
				flag++;
				if (flag%2==1) {
				System.out.println(i);
				}
				}
				continue;
		}		
		}

}
