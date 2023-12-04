package com.java.preperations.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class QueueMethods {
	

	
	    public static void main(String[] args) {
	        // Creating a Queue using LinkedList
	        Queue<String> myQueue = new LinkedList<>();

	        // Adding elements to the queue
	        myQueue.offer("Apple");
	        myQueue.offer("Banana");
	        myQueue.offer("Orange");
	        
	        // Iterating through elements using an iterator
	        System.out.println("\nIterating through elements using an iterator:");
	        var iterator = myQueue.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }

	        // Removing and retrieving elements
	        String removedElement = myQueue.poll();
	        System.out.println("Removed Element: " + removedElement);

	        // Peek at the head of the queue
	        String peekedElement = myQueue.peek();
	        System.out.println("Peeked Element: " + peekedElement);

	        // Checking if the queue is empty
	        if (myQueue.isEmpty()) {
	            System.out.println("The queue is empty.");
	        } else {
	            System.out.println("The queue is not empty.");
	        }

	        // Getting the size of the queue
	        int size = myQueue.size();
	        System.out.println("Size of the queue: " + size);
	        
	        
	       
	        
	        // Iterating through elements using an enhanced for loop
	        System.out.println("Iterating through elements using an enhanced for loop:");
	        for (String element : myQueue) {
	            System.out.println(element);
	        }
	   }
}
