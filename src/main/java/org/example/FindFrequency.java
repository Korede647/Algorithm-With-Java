package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindFrequency {

//    public Map<Character, Integer> Frequency (String str){
//        Map<Character, Integer> letters = new HashMap<>();
//        str = str.toUpperCase();
//        int count = 0;
//        for (char character : str.toCharArray()) {
//            if (str.equals(character)) {
//                letters.put(character, letters.getOrDefault(character, 0) + 1);
//                count++;
//            }
//        }
//        for (Map.Entry<Character, Integer> word : letters.entrySet()){
//            System.out.print(word.getKey() + ": " + word.getValue());
//        }
//        return letters;
//    }

    public Map<String, Integer> Frequency (List<String> words){
        Map<String, Integer> letters = new HashMap<>();
        for(String word: words){
            if (letters.containsKey(word)){
                letters.put(word, letters.get(word) + 1);
            }else{
                letters.put(word, 1);
            }
        }
        return letters;
    }
}
