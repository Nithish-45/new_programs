package com.java.preperation.methods;

public class DeleteDuplicateElement {
	
	    public void removeDuplicates(int[] nums) {
	        int j = 1;
	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] != nums[i - 1]) {
	                nums[j] = nums[i];
	                j++;
	                System.out.println(nums[i]);
	            }
	        }
	          
	}

}
