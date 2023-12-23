package com.java.preperation.methods;

public class Equalibrium {
	public void equlisum(int[]a) {
		int b=a.length;
		int sum1=0;
		int sum2=0;
		if(b%2==0) {
			for(int i=0;i<b/2;i++) {
				sum1+=a[i];
			}
			for(int i=b/2;i<b;i++) {
				sum2+=a[i];
			}
			if(sum1==sum2) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
		else {
			for(int i=0;i<b/2;i++) {
				sum1+=a[i];
			}
			for(int i=b/2+1;i<b;i++) {
				sum2+=a[i];
			}
			if(sum1==sum2) {
				System.out.println("yes 2");
			}
			else {
				System.out.println("no");
			}
			
		}
		

	}
	}
