package com.java.preperation.methods;

public class CountCharacters {
		public int countChar(String S) {
			int count =0;
			for(int i=0;i<S.length();i++) {
				if(S.charAt(i)>=65 && S.charAt(i)<=90 || S.charAt(i)>=97 && S.charAt(i)<=122) {	
					count++;}
				}
			
			return count;
		}
		
		public int countWords(String s) {
			int count = 0;
			for(int i=0;i<s.length()-1;i++) {
				if(s.charAt(i)==' ') {
					count++;
				}
			}
			return count+1;
		}
		
		
		//count punctuation
		public int countpunctuations(String S) {
			int a=S.length();
			int count=0;
			for(int i=0;i<a;i++) {
				if(S.charAt(i)>=33 & S.charAt(i)<=48  || S.charAt(i)>=57 && S.charAt(i)<=64) {
					count++;
				}
			}
			return count;
			
		}

}
