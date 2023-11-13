package com.java.preperation.methods;

public class ArmstrongNumber {
	public void armstrong(int a) {
		int last;
		int temp=a;
		int sum=0;
		while(a>0) {
			last=a%10;
			sum=sum+(last*last*last);
			a=a/10;
			
		}
		System.out.println("Given number "+temp+" and the sum of the cubes of each digits equals to = "+ sum);
		if(sum==temp) {
			System.out.println("It's a armstrong number");
		}
		else {
			System.out.println("not a armstrong number");
		}
		
	}
}
