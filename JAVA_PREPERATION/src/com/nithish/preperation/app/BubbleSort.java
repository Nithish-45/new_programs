package com.nithish.preperation.app;

public class BubbleSort {
	public void sort(int []arr) {
		int l=arr.length;
		int temp=0;
		for(int i=0;i<l;i++) {
			for(int j=1;j<(l-i);j++) {
				if(arr[j-1]>arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				
			}
			}
		}
		for(int i=0;i<l;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
