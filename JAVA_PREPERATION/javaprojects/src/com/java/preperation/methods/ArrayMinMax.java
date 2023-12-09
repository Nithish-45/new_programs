package com.java.preperation.methods;

public class ArrayMinMax {
	public void minmax(int []a) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				int temp;
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(" minimum element= "+a[0]+" & the max element is = "+a[a.length-1]);
		}

}
