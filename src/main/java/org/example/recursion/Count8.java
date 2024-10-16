package org.example.recursion;

public class Count8 {
    public static double counting8 (double n){
        if(n < 8){
            return 0;
        }
        int count = 0;
        if(n % 10 == 8){
            count = 1;
        }
        if (n % 10 == 8 && Math.floor(n/10) % 10 == 8){
            count = 2;
        }
        return count + counting8(Math.floor(n/10));
    }
}
