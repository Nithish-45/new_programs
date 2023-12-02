package com.java.preperation.methods;

//without using a extra function
public class CheckStringPalindrome {
	
	public String sspalindrome(String s) {
		String result;
		int n=s.length();
		String b="";
		for(int i=n-1;i>=0;i--) {
			b+=s.charAt(i);
			
		}
		if(b.equals(s)) {
			result="palindrome";
		}
		else {
			result="not a palindrome";
		}
		
	return result;		
	}

}
