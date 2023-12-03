package com.java.preperations.Collections;
import java.util.Vector;
import java.util.List;

public class VectorMethods {
	

	
	    public static void main(String[] args) {
	        // Creating a Vector
	        List<String> myVector = new Vector<>();

	        // Adding elements
	        myVector.add("Apple");
	        myVector.add("Banana");
	        myVector.add("Orange");

	        // Accessing elements
	        String firstElement = myVector.get(0);
	        System.out.println("First Element: " + firstElement);

	        // Iterating through the Vector
	        System.out.println("Elements in the vector:");
	        for (String fruit : myVector) {
	            System.out.println(fruit);
	        }

	        // Removing an element
	        myVector.remove("Banana");

	        // Updating the Vector
	        myVector.set(0, "Grapes");

	        // Checking if an element exists
	        if (myVector.contains("Orange")) {
	            System.out.println("The vector contains Orange.");
	        } else {
	            System.out.println("The vector does not contain Orange.");
	        }

	        // Getting the size of the Vector
	        int size = myVector.size();
	        System.out.println("Size of the vector: " + size);

	        // Checking if the Vector is empty
	        boolean isEmpty = myVector.isEmpty();
	        System.out.println("Is the vector empty? " + isEmpty);
	    }
	}



