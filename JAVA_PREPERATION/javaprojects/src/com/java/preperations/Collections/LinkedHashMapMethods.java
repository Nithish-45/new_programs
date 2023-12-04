package com.java.preperations.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapMethods {


	
	    public static void main(String[] args) {
	        // Creating a LinkedHashMap
	        LinkedHashMap<String, Integer> ageMap = new LinkedHashMap<>();

	        // Adding key-value pairs
	        ageMap.put("John", 25);
	        ageMap.put("Alice", 30);
	        ageMap.put("Bob", 28);

	        // Retrieving a value
	        int johnAge = ageMap.get("John");
	        System.out.println("John's Age: " + johnAge);

	        // Checking if a key exists
	        boolean containsJohn = ageMap.containsKey("John");
	        System.out.println("Contains John? " + containsJohn);

	        // Getting all keys (in insertion order)
	        Set<String> keys = ageMap.keySet();
	        System.out.println("All Keys: " + keys);

	        // Getting all values (in insertion order)
	        System.out.println("All Ages: " + ageMap.values());

	        // Iterating through entries (in insertion order)
	        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }
	    }
	

}
