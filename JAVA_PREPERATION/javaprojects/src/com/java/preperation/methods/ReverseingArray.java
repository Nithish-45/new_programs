package com.java.preperation.methods;

public class ReverseingArray {
	public void RevArray(int []a) {
		System.out.print("original array = ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("reversed array = ");
		 for(int i=a.length-1;i>=0;i--) {
		 		System.out.print(a[i]+" ");
		 }
	 }

}
