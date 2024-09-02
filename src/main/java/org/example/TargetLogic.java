package org.example;

import java.util.ArrayList;
import java.util.List;

public class TargetLogic {

    public static List<Integer> findTargetSum(List<Integer> number, int target){
        List<Integer> num = new ArrayList<>();

        for(int i = 0; i< number.size(); i++){
            for(int j = i+1; j< number.size(); j++) {
                if (number.get(i) + number.get(j) == target) {
                     num.add(number.get(i));
                     num.add(number.get(j));
                }
            }
        }
        return num;
    }

    public static int[] findTargetSum(int[] arr, int target){
        for (int i = 0; i<arr.length; i++){
            for (int j = i+1; j<arr.length; j++){
                if (arr[i] + arr[j]== target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {};
    }

}
