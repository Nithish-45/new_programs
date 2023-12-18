package com.java.preperation.executers;

import com.java.preperation.methods.PerfectSquare;

public class PerfectSquareExecuters {
	public static void main(String[] args) {
		PerfectSquare ref=new PerfectSquare();
		System.out.println((ref.perfect(1) ?  "yes it's aperfect square":"no not a perfect square"));
//		System.out.println(ref.perfect(25) );
		System.out.println(ref.square(2) );

	}
}
