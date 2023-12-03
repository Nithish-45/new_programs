package com.java.preperation.methods;

import java.util.Arrays;

public class RepeatedTwoNumber {

	
	public void twoRepeated(int arr[])
    {
        // Your code here
	 	int N=arr.length;
        int[] ans = new int[2];
        int digitCount[] = new int [N+1];
        int j=0;
        for(int i=0; i<N; i++) {
            digitCount[arr[i]]++;
            if(digitCount[arr[i]]==2) {
                ans[j]=arr[i];
                j++;
            }
        }
        Arrays.sort(ans);
        for(int i=0;i<ans.length;i++) {
        	System.out.println(ans[i]);
        }
        
    }
}
