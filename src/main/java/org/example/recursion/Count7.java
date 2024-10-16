package org.example.recursion;

public class Count7 {
    public static double counting7 (double n){
        if(n < 7){
            return 0;
        }
        int count = 0;
        if(n % 10 == 7){
            count = 1;
        }
        return count + counting7(Math.floor(n/10));
    }
}
