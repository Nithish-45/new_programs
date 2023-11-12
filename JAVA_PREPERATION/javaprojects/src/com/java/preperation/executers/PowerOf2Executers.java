package com.java.preperation.executers;

import com.java.preperation.methods.PowerOf2;
import java.util.Scanner;

public class PowerOf2Executers {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		PowerOf2 ref=new PowerOf2();
		System.out.println("Enter the Number :");
		int n=s.nextInt();
		if(ref.Powof2(n)==false) {
			System.out.println("Given Number is not completely divisible by 2 i.e it's not a power of 2");
		}
		else {
			System.out.println("Given number is completely divisible by 2 i.e it's a power of 2");
		}
		s.close();
		
	}
}
