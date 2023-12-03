package com.java.preperations.Collections;
//import java.util.List;
import java.util.*;

public class LinkedListMethods {
	//explain Linkedlist & its methods with examples and  code snippets
	

	    public static void main(String[] args) {
	        // Creating a LinkedList
	        LinkedList<String> myLinkedList = new LinkedList<>();

	        // Adding elements
	        myLinkedList.add("Apple");
	        myLinkedList.add("Banana");
	        myLinkedList.add("Orange");

	        // Accessing elements
	        String firstElement = myLinkedList.get(0);
	        System.out.println("First Element: " + firstElement);

	        // Iterating through the LinkedList
	        System.out.println("Elements in the list:");
	        for (String fruit : myLinkedList) {
	            System.out.println(fruit);
	        }

	        // Removing an element
	        myLinkedList.remove("Banana");

	        // Updating the LinkedList
	        myLinkedList.set(0, "Grapes");

	        // Checking if an element exists
	        if (myLinkedList.contains("Orange")) {
	            System.out.println("The list contains Orange.");
	        } else {
	            System.out.println("The list does not contain Orange.");
	        }

	        // Getting the size of the LinkedList
	        int size = myLinkedList.size();
	        System.out.println("Size of the list: " + size);

	        // Checking if the LinkedList is empty
	        boolean isEmpty = myLinkedList.isEmpty();
	        System.out.println("Is the list empty? " + isEmpty);
	    }

	

}
