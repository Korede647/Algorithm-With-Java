package org.example.recursion;

public class Power {
    public static double powerN(int n, int base){
        if(n <= 1) {
            return base;
        }
            return Math.pow(powerN(base, 1), n);
        }
}
