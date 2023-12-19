package com.java.preperation.executers;

import com.java.preperation.methods.CountCharacters;

public class CountCharactersExecuters {
	public static void main(String[] args) {
		CountCharacters ref=new CountCharacters();
		String s="I'm Nithish from Davangere..! and I Recently got placed in Volkswagen company";
		System.out.print("Total number of characters in a string are : ");
		System.out.println(ref.countChar(s));
		System.out.print("Total number of punctuations in a string are : ");
		System.out.println(ref.countpunctuations(s));
		System.out.print("Total number of words in a string are : ");
		System.out.println(ref.countWords(s));

		
	}

}
