package org.example;

import java.util.Arrays;

public class MaximumProduct {
    public static int maxProduct (int[] arr){
        Arrays.sort(arr);
        int max1 = arr[arr.length-2] * arr[arr.length-1];
        int max2 = arr[0] * arr[1];

            if(max1 > max2){
                return max1;
            }
            return max2;
    }
}
