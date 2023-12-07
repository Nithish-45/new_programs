package com.java.preperation.methods;

public class ReplaceString {	
	
	public void replace(String a,String b,String c) {
		int ar[]=new int[10];
		int j=0,k=0;
		String result="";
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==b.charAt(j)) {
				
				j++;
				if(j==b.length()) {
					
					
					ar[k]=i-j+1;
//					System.out.println(ar[k]);
					 j=0;
					 k++;
					}
				}
		}
		k=0;
		for(int i=0;i<a.length();i++) {
			
			if(i==ar[k]) {
				result+=c;
				k++;
				i=i+b.length()-1;
			}else {
				result+=a.charAt(i);
			}
		}
		System.out.println(result);
		
	}
}


