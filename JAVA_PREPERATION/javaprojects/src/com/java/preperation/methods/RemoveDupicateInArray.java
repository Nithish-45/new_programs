package com.java.preperation.methods;
import java.util.Arrays;
public class RemoveDupicateInArray {
	

//	public class RemoveDuplicatesFromArray {
	   
	    public int[] removeDuplicatesWithoutSet(int[] array) {
	        int n = array.length;
	        if (n == 0 || n == 1) {
	            return array;
	        }

	        int[] uniqueArray = new int[n];
	        int j = 0;

	        for (int i = 0; i < n - 1; i++) {
	            if (array[i] != array[i + 1]) {
	                uniqueArray[j++] = array[i];
	            }
	        }

	        uniqueArray[j++] = array[n - 1];

	        return Arrays.copyOf(uniqueArray, j);
//	    }
	}	


}
