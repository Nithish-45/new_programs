package com.java.preperations.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashsetMethods {

	    public static void main(String[] args) {
	        // Creating a HashSet
	        Set<String> myHashSet = new HashSet<>();

	        // Adding elements
	        myHashSet.add("Apple");
	        myHashSet.add("Banana");
	        myHashSet.add("Orange");
	        myHashSet.add("Banana");  // Duplicate, won't be added

	        // Iterating through the HashSet
	        System.out.println("Elements in the HashSet:");
	        for (String fruit : myHashSet) {
	            System.out.println(fruit);
	        }

	        // Removing an element
	        myHashSet.remove("Banana");
	        
	        //size
	        System.out.println(myHashSet.size());

	        // Checking if an element exists
	        if (myHashSet.contains("Orange")) {
	            System.out.println("The HashSet contains Orange.");
	        } else {
	            System.out.println("The HashSet does not contain Orange.");
	        }
	    }

}
