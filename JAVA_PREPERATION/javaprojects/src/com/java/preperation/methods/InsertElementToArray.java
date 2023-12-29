package com.java.preperation.methods;

public class InsertElementToArray {
	public void insertelearr(int e,int p) {
		int a[]= {1,2,3,4,5,6,7};
		int b[]= new int[a.length+1];
		for(int i=0;i<b.length;i++) {
			if(i==p) {
				b[i]=e;
			}
			else if(i>p) {
				b[i]=a[i-1];
			}
			else {
				b[i]=a[i];
			}
			
		}
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}

}
