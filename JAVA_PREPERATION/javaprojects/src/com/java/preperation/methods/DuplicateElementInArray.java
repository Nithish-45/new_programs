package com.java.preperation.methods;

public class DuplicateElementInArray {
	public void duplicate(int[] a) {
		int []b=new int [a.length];
		int z=0;
		for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count+=1;
					if(count>=1 ){
					System.out.println(a[i]);
					b[z]=a[i];
					z++;
					}
					
					
				}
			}
		}
		for (int i=0;i<b.length;i++) {
			if(b[i]!=0) {		
				System.out.print(b[i]+" ");
			}
		}
	}
}
