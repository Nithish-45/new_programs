package com.java.preperations.Collections;
import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

public class HashTableMapMethods {
	

	
	    public static void main(String[] args) {
	        // Creating a Hashtable
	        Hashtable<String, Integer> ageTable = new Hashtable<>();

	        // Adding key-value pairs
	        ageTable.put("John", 25);
	        ageTable.put("Alice", 30);
	        ageTable.put("Bob", 28);

	        // Retrieving a value
	        int johnAge = ageTable.get("John");
	        System.out.println("John's Age: " + johnAge);

	        // Checking if a key exists
	        boolean containsJohn = ageTable.containsKey("John");
	        System.out.println("Contains John? " + containsJohn);

	        // Getting all keys (using enumeration)
	        Enumeration<String> keys = ageTable.keys();
	        while (keys.hasMoreElements()) {
	            System.out.println("Key: " + keys.nextElement());
	        }

	        // Getting all values (using enumeration)
	        Enumeration<Integer> values = ageTable.elements();
	        while (values.hasMoreElements()) {
	            System.out.println("Value: " + values.nextElement());
	        }

	        // Iterating through entries (not directly supported; use keySet and get)
	        for (String key : ageTable.keySet()) {
	            System.out.println("Key: " + key + ", Value: " + ageTable.get(key));
	        }
	    }
	

	
}
