
package com.java.preperations.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashsetMethods {
	
	    public static void main(String[] args) {
	        // Creating a LinkedHashSet
	        Set<String> myLinkedHashSet = new LinkedHashSet<>();
	        
	        Set<Integer> mine=new LinkedHashSet<>();

	        // Adding elements
	        myLinkedHashSet.add("Apple");
	        myLinkedHashSet.add("Banana");
	        myLinkedHashSet.add("Orange");
	        myLinkedHashSet.add("Banana");  // Duplicate, won't be added
	        
	        mine.add(1);
	        mine.add(4);

	        mine.add(2);
	        mine.add(3);
	        mine.add(1);
//	        System.out.println(mine.size());
	         
	        mine.remove(2);
//	        System.out.println(mine.size());
	        
	        for(int num:mine) {
	        	System.out.println(num);
	        }



	        

	        // Iterating through the LinkedHashSet
	        System.out.println("Elements in the LinkedHashSet:");
	        for (String fruit : myLinkedHashSet) {
	            System.out.println(fruit);
	        }
	        
	        System.out.println(myLinkedHashSet.size());
	        
	        // Removing an element
	        myLinkedHashSet.remove("Banana");
	        
	        System.out.println(myLinkedHashSet.size());


	        // Checking if an element exists
	        if (myLinkedHashSet.contains("Orange")) {
	            System.out.println("The LinkedHashSet contains Orange.");
	        } else {
	            System.out.println("The LinkedHashSet does not contain Orange.");
	        }
	    }
	}



