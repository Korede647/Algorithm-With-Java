package org.example;

import java.util.Arrays;

public class MaxNum {
    public static int findMaxProduct(int[] arr) {
        Arrays.sort(arr);
       int num = arr.length;
        return arr[num-1] * arr[num-2];
    }
}
