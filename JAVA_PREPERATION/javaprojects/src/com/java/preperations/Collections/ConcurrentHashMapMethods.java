package com.java.preperations.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class ConcurrentHashMapMethods {
	

	
	    public static void main(String[] args) {
	        // Creating a ConcurrentHashMap
	        ConcurrentHashMap<String, Integer> ageMap = new ConcurrentHashMap<>();

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

	        // Getting all keys
	        Set<String> keys = ageMap.keySet();
	        System.out.println("All Keys: " + keys);

	        // Getting all values
	        Collection<Integer> ages = ageMap.values();
	        System.out.println("All Ages: " + ages);

	        // Iterating through entries
	        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }
	    }
	

}
