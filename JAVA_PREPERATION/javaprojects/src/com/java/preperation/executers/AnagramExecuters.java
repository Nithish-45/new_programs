package com.java.preperation.executers;

import com.java.preperation.methods.Anagram;

public class AnagramExecuters {
	public static void main(String[] args) {
		Anagram ref=new Anagram();
		String a1="race";
		String a2="care";
		System.out.println(ref.AnagramChecking(a1,a2));
	}

}
