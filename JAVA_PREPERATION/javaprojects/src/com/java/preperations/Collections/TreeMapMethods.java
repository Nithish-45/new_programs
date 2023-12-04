package com.java.preperations.Collections;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

public class TreeMapMethods {
	

	public class TreeMapExample {
	    public static void main(String[] args) {
	        // Creating a TreeMap
	        TreeMap<String, Integer> ageMap = new TreeMap<>();

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

	        // Getting all keys (sorted)
	        Set<String> keys = ageMap.keySet();
	        System.out.println("All Keys: " + keys);

	        // Getting all values (sorted by keys)
	        System.out.println("All Ages: " + ageMap.values());

	        // Iterating through entries (sorted by keys)
	        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }
	    }
	

}
