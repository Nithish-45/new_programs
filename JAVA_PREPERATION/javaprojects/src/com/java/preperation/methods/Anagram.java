package com.java.preperation.methods;

import java.util.Arrays;

public class Anagram {
	public boolean AnagramCheck(String s1,String s2) {
		int l1=s1.length();
		int l2=s2.length();
		if(l1==l2) {
			char a1[]=s1.toCharArray();
			char a2[]=s2.toCharArray();
			Arrays.sort(a1);
			Arrays.sort(a2);
			for(int i=0;i<l1;i++) {
				if(a1[i]==a2[i]) {
					return true;
				}
			}
			
//			if(a1.equals(a2))
//			{
//				System.out.println("Anagram"); 
//			}
//			
//		}
//		else {
//		System.out.println("Not a Anagram");}
	}
		return false;}


	public String AnagramChecking(String a1, String a2) {
		// TODO Auto-generated method stub
		if(!AnagramCheck(a1,a2)) {
			return "Given Strings are Not Anagram";
			
		}
		
		return "Given Strings are Anagram";
	}}
