package com.java.preperations.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueMethods {
	

			public static void main(String[] args) {
	        // Creating a PriorityQueue with natural ordering
	        Queue<Integer> priorityQueueNatural = new PriorityQueue<>();

	        // Creating a PriorityQueue with a custom comparator
	        Queue<Integer> priorityQueueCustom = new PriorityQueue<>((a, b) -> b - a);

	        // Adding elements to the PriorityQueues
	        priorityQueueNatural.offer(5);
	        priorityQueueNatural.offer(2);
	        priorityQueueNatural.offer(8);
	        priorityQueueNatural.offer(3);
	        


	        priorityQueueCustom.offer(5);
	        priorityQueueCustom.offer(2);
	        priorityQueueCustom.offer(8);
	        priorityQueueCustom.offer(3);


	        // Removing and retrieving elements
	        Integer removedElementNatural = priorityQueueNatural.poll();
	        System.out.println("Removed Element (Natural Ordering): " + removedElementNatural);

	        Integer removedElementCustom = priorityQueueCustom.poll();
	        System.out.println("Removed Element (Custom Comparator): " + removedElementCustom);

	        // Peek at the front of the PriorityQueues
	        Integer peekedElementNatural = priorityQueueNatural.peek();
	        System.out.println("Peeked Element (Natural Ordering): " + peekedElementNatural);

	        Integer peekedElementCustom = priorityQueueCustom.peek();
	        System.out.println("Peeked Element (Custom Comparator): " + peekedElementCustom);

	        // Iterating through elements
	        System.out.println("\nIterating through elements (Natural Ordering):");
	        for (Integer element : priorityQueueNatural) {
	            System.out.println(element);
	        }

	        System.out.println("\nIterating through elements (Custom Comparator):");
	        for (Integer element : priorityQueueCustom) {
	            System.out.println(element);
	        }

	        // Checking if the PriorityQueues are empty
	        if (priorityQueueNatural.isEmpty()) {
	            System.out.println("The PriorityQueue (Natural Ordering) is empty.");
	        } else {
	            System.out.println("The PriorityQueue (Natural Ordering) is not empty.");
	        }

	        if (priorityQueueCustom.isEmpty()) {
	            System.out.println("The PriorityQueue (Custom Comparator) is empty.");
	        } else {
	            System.out.println("The PriorityQueue (Custom Comparator) is not empty.");
	        }

	        // Getting the size of the PriorityQueues
	        int sizeNatural = priorityQueueNatural.size();
	        System.out.println("Size of the PriorityQueue (Natural Ordering): " + sizeNatural);

	        int sizeCustom = priorityQueueCustom.size();
	        System.out.println("Size of the PriorityQueue (Custom Comparator): " + sizeCustom);
	    }
	}
