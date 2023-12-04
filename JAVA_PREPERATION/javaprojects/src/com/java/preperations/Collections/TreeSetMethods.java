package com.java.preperations.Collections;
import java.util.TreeSet;
import java.util.Set;
public class TreeSetMethods {
	

	
	    public static void main(String[] args) {
	        // Creating a TreeSet
	        Set<String> myTreeSet = new TreeSet<>();

	        // Adding elements
	        myTreeSet.add("Apple");
	        myTreeSet.add("Banana");
	        myTreeSet.add("Orange");
	        myTreeSet.add("Banana");  // Duplicate, won't be added

	        // Iterating through the TreeSet
	        System.out.println("Elements in the TreeSet:");
	        for (String fruit : myTreeSet) {
	            System.out.println(fruit);
	        }

	        System.out.println(myTreeSet.size());
	        // Removing an element
	        myTreeSet.remove("Banana");

	        // Checking if an element exists
	        if (myTreeSet.contains("Orange")) {
	            System.out.println("The TreeSet contains Orange.");
	        } else {
	            System.out.println("The TreeSet does not contain Orange.");
	        }
	    }
	}

