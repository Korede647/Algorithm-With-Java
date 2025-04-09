package org.example;

public class CountVowels {
    public static int FindVowels (String vowel){
        String vowels = vowel.toLowerCase();
        int vcount = 0;
        String Vowels = "aeiou";
        for(int i = 0; i<vowels.length(); i++){
            char c = vowels.charAt(i);
            if(Vowels.indexOf(c) != -1){
                vcount++;
            }
        }
        return vcount;
    }
}
