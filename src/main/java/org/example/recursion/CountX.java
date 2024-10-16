package org.example.recursion;

public class CountX {
    public static int countString (String str){
        if(!str.contains("x")){
            return 0;
        }
        int count = 0;
        if(str.substring(0,1).equals("x")){
            count = 1;
        }
        return count + countString(str.substring(1));
    }
}
