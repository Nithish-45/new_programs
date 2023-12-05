package com.java.preperation.methods;

public class CountWordsInAString {
	public int countWordsInString(String str) {
        // Using split to separate words based on spaces and punctuation
        String[] words = str.split("\\s+|\\p{Punct}");
        int count = 0;

        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }

        return count;
    }

}
