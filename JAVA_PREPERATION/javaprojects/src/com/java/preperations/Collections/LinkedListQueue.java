package com.java.preperations.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {


	    public static void main(String[] args) {
	        // Creating a LinkedList Queue
	        Queue<String> linkedListQueue = new LinkedList<>();

	        // Adding elements to the queue
	        linkedListQueue.add("Apple");
	        linkedListQueue.offer("Banana");
	        linkedListQueue.offer("Orange");

	        // Removing and retrieving elements
	        String removedElement = linkedListQueue.poll();
	        System.out.println("Removed Element: " + removedElement);

	        // Peek at the front of the queue
	        String peekedElement = linkedListQueue.peek();
	        System.out.println("Peeked Element: " + peekedElement);

	        // Iterating through the queue
	        System.out.println("\nIterating through elements using an enhanced for loop:");
	        for (String element : linkedListQueue) {
	            System.out.println(element);
	        }

	        // Checking if the queue is empty
	        if (linkedListQueue.isEmpty()) {
	            System.out.println("The queue is empty.");
	        } else {
	            System.out.println("The queue is not empty.");
	        }

	        // Getting the size of the queue
	        int size = linkedListQueue.size();
	        System.out.println("Size of the queue: " + size);
	    }
	}
