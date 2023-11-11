package com.java.preperation.executers;

import com.java.preperation.methods.PrimeOrNot;

public class PrimeOrNotExecuters {
	public static void main(String[] args) {
//		PrimeRange ref=new PrimeRange();
		//because the method in PrimeRange is static so we accessed it in a static way
		PrimeOrNot.CheckPrime(11);
}
}
