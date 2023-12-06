package com.java.preperation.methods;

public class SecondLargestElementInArray {
	public void largestElement(int[] arr,int l) {
//		int arr[]= new int[]{1,2,3,5,4,6,8,7,9};
		int n=arr.length;
	
		for(int i=0;i<n;i++) {
			for(int j=1;j<n;j++) {
				int temp=0;
				if(arr[j-1]>arr[j]) {
					temp =arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");	
		}
		System.out.println();
		System.out.println("The "+l+"th largest element in array is "+arr[n-l]);
	}
}
