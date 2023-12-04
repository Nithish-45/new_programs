package com.java.preperations.Collections;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQueueMethods {
		public static void main(String[] args) {
	        // Creating an ArrayBlockingQueue with a capacity of 3
	        BlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(3);

	        // Adding elements to the queue
	        try {
	            arrayBlockingQueue.put("Apple");
	            arrayBlockingQueue.put("Banana");
	            arrayBlockingQueue.put("Orange");
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Removing and retrieving elements
	        try {
	            String removedElement = arrayBlockingQueue.take();
	            System.out.println("Removed Element: " + removedElement);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Checking if the queue is empty
	        if (arrayBlockingQueue.isEmpty()) {
	            System.out.println("The queue is empty.");
	        } else {
	            System.out.println("The queue is not empty.");
	        }

	        // Getting the size of the queue
	        int size = arrayBlockingQueue.size();
	        System.out.println("Size of the queue: " + size);
	    }
	


}
