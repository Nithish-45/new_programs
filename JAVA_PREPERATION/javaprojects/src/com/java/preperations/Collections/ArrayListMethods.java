package com.java.preperations.Collections;
import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

	    public static void main(String[] args) {
	        // Creating an ArrayList
	        List<String> myArrayList = new ArrayList<>();

	        // Adding elements
	        myArrayList.add("Apple");
	        myArrayList.add("Banana");
	        myArrayList.add("Orange");
	        myArrayList.add("Orange");


	        // Accessing elements
	        String firstElement = myArrayList.get(0);
	        System.out.println("First Element: " + firstElement);

	        // Iterating through the ArrayList
	        System.out.println("Elements in the list:");
	        for (String fruit : myArrayList) {
	            System.out.println(fruit);
	        }

	        // Removing an element
	        myArrayList.remove("Banana");

	        // Updating the ArrayList
	        myArrayList.set(0, "Orange");

	        // Checking if an element exists
	        if (myArrayList.contains("Orange")) {
	            System.out.println("The list contains Orange.");
	        } else {
	            System.out.println("The list does not contain Orange.");
	        }

	        // Getting the size of the ArrayList
	        int size = myArrayList.size();
	        System.out.println("Size of the list: " + size);

	        // Checking if the ArrayList is empty
	        boolean isEmpty = myArrayList.isEmpty();
	        System.out.println("Is the list empty? " + isEmpty);
	        
	        for(String fruit:myArrayList) {
	        	System.out.println(fruit);
	        }
	    }
	}



