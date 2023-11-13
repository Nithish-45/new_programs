package com.java.preperation.executers;

import java.util.Scanner;

import com.java.preperation.methods.PrimeRange;

public class PrimeRangeExecuters {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		PrimeRange ref=new PrimeRange();
		System.out.println(" Enter the numbers to get the prime number within the range ");
		int a=s.nextInt();
		int b=s.nextInt();
		ref.primerange(a ,b);
		s.close();
	}

}
