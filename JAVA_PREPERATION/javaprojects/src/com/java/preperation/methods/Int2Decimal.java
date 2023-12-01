package com.java.preperation.methods;

public class Int2Decimal {
	public int Int2Dec(int a) {
//		return Integer.toBinaryString(a);
		int rev=1;int result=0;int rem;
		while(a>0) {
			rem=a%2;
			a=a/2;
			result+=rem*rev;
			rev*=10;
//			System.out.print(rem+" "+a+" "+result+" "+rev);
//			System.out.println();
		}
		return result;
	}

}
