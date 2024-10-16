package org.example.recursion;

public class Fibonacci {
    public static int fibonacciSeries(int fibonacci){
        if(fibonacci <= 0){
            return fibonacci;
        }
        return fibonacciSeries(fibonacci - 1) + fibonacciSeries(fibonacci - 2);
    }
}
