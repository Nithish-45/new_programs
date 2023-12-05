package com.java.preperation.executers;

import com.java.preperation.methods.CountWordsInAString;

public class CountWordsInAStringExecuters {
	public static void main(String[] args) {
		CountWordsInAString ref=new CountWordsInAString();
		String inputString = "Hello World. This is a sample sentence. Java Programming. Count the words.";

	  System.out.println(ref.countWordsInString(inputString));

	}

}
