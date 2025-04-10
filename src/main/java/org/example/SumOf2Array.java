package org.example;

public class SumOf2Array {
    public static int[] sumOfArray(int[] arr, int target){
        for(int i = 0; i< arr.length; i++){
            for(int j = i + 1; j<arr.length; j++){
            if(arr[i] + arr[j] == target) {
               return new int[]{i, j};
            }
            }
        }
       return new int[] {};
    }

    public static int[] sum3Array(int[] arr, int target){
        for(int i = 0; i<arr.length; i++){
            for(int j = i + 1; j<arr.length; j++){
                for(int k = j + 1; k < arr.length; k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        return new int[]{i, j, k};
                    }
                }
            }
        }
        return new int[]{};
    }
}
