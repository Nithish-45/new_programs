package com.nithish.preperation.boot;

import com.nithish.preperation.app.InitialSeperation;

public class InitialSeperationMain extends Object {
	public static void main(String[] args) {
		InitialSeperation ref=new InitialSeperation("nithish",22);
		
//		ref.intial();
//		ref.equals(ref);
		
		System.out.println(ref);
		
		System.out.println(ref.getClass());

		System.out.println(ref.hashCode());
		
	}

}
