package org.example;

public class CountFrequencyOfChar {
    public static int findNoOfChar (String word, char letter){
       String str = word.toLowerCase();
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == letter){
                count++;
            }
        }
        return count;
    }
}
