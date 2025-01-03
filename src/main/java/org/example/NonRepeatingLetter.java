package org.example;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingLetter {

    public static String FirstNonRepeatingCharacter(String str) {
            if (str == null || str.isEmpty()) {
                return "String is empty.";
            }

            // Step 1: Create a LinkedHashMap to store characters and their frequencies
            Map<Character, Integer> charCountMap = new LinkedHashMap<>();

            // Step 2: Populate the map with character frequencies
            for (char c : str.toCharArray()) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }

            // Step 3: Find the first character with a frequency of 1
            for (char c : str.toCharArray()) {
                if (charCountMap.get(c) == 1) {
                    return "First non-repeating character: " + c;
                }
            }

            // Step 4: If no non-repeating character found, return message
            return "No non-repeating character found.";
        }
    }

