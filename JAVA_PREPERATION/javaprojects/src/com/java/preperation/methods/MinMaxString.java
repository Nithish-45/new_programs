package com.java.preperation.methods;

public class MinMaxString {
	void minmaxstr(String S) {
		String a[]=S.split(" ")	;
		String temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i].length() > a[j].length()) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("minimun length word is "+a[0]+" maximum length word is "+a[a.length-1]);
	}

}
