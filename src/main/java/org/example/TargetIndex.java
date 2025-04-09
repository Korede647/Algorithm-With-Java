package org.example;

public class TargetIndex {
    public static int[] findSumIndex (int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[] {};
    }
}
