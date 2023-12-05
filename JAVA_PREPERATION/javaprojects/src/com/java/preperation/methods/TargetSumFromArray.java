package com.java.preperation.methods;

import java.util.ArrayList;
import java.util.List;

public class TargetSumFromArray {
//	public int[] twoSum(int[] nums, int target) {
	public void twoSum(int[] nums, int target) {

		List<Integer> l=new ArrayList<>();
		int n=nums.length;
	    for(int i=0;i<n-1;i++){
	    	for(int j=i+1;j<n;j++){
	            if(nums[i]+nums[j]==target){
//	           	   return new int[] {i,j};
	            	l.add(nums[i]);
	            	l.add(nums[j]);
	            	break;
	            }	            
	        }
	    }
	    for(Integer i:l) {
	    	System.out.print(i+" ");
	    }
	    
//	return new int[]{};
	}
	

}
