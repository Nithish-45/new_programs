package com.java.preperation.methods;

public class DivideEqualString {
	public void dividepart(String S,int N) {
		int a=S.length();
//		int prt=4;
		if(a%N==0) {
			for(int i=0;i<a;i++) {
			
				if(i%N==0) {
					System.out.println();
//					System.out.print(S.charAt(i));
				}
				System.out.print(S.charAt(i));
				}
			}
	
		
		else {
			System.out.println("The given String cannot be equally divided..!!");
		
			}
		}
	

}
