package com.java.preperations.Collections;
import java.util.ArrayDeque;
import java.util.Deque;
public class DequeueMethods {
	

	
	    public static void main(String[] args) {
	        // Creating a Deque using ArrayDeque
	        Deque<String> deque = new ArrayDeque<>();

	        // Adding elements to the front and end of the deque
	        deque.offerFirst("Apple");
	        deque.offerFirst("Banana");
	        
	        deque.offerLast("Grapes");
	        deque.offerLast("Orange");

	        // Removing and retrieving elements from the front and end
	        String removedElementFront = deque.removeFirst();
	        System.out.println("Removed Element from Front: " + removedElementFront);

	        String removedElementEnd = deque.pollLast();
	        System.out.println("Removed Element from End: " + removedElementEnd);

	        // Peeking at elements from the front and end
	        String peekedElementFront = deque.getFirst();
	        System.out.println("Peeked Element from Front: " + peekedElementFront);

	        String peekedElementEnd = deque.getLast();
	        System.out.println("Peeked Element from End: " + peekedElementEnd);

	        // Checking if the deque is empty
	        if (deque.isEmpty()) {
	            System.out.println("The deque is empty.");
	        } else {
	            System.out.println("The deque is not empty.");
	        }

	        // Getting the size of the deque
	        int size = deque.size();
	        System.out.println("Size of the deque: " + size);
	    }
	}
