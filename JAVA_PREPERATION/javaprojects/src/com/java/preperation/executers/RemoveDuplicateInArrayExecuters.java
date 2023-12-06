package com.java.preperation.executers;

import java.util.Arrays;

import com.java.preperation.methods.RemoveDupicateInArray;

//import com.java.preperation.methods.RemoveDupicateInArray.RemoveDuplicatesFromArray;

public class RemoveDuplicateInArrayExecuters {
	 public static void main(String[] args) {
	        int[] dupArray = {1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 5};

	        RemoveDupicateInArray n=new RemoveDupicateInArray();
	        n.removeDuplicatesWithoutSet(dupArray);
	        
	        System.out.println("Array with duplicates: " + Arrays.toString(dupArray));
	        
	    }


}
