package com.java.preperation.methods;

public class PerfectSquare {
	public boolean perfect(int n) {
		if(n==0 || n==1) {
			return true;
		}
		for(int i=1;i<=n/2;i++) {
			if(n%i==0 && n/i==i) {
				return true;
				
			}
		}
		return false;
	}
	
	public String square(int n) {
		if(n==0 || n==1) {
			return "yes it's perfect square";
		}
		for(int i=1;i<=n/2;i++) {
			if(n%i==0 && n/i==i) {
				return "yes it's perfect square";
			}
			
			}
		return "not a perfect square";
	}
}
