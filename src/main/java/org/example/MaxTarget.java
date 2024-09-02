package org.example;

import java.util.Arrays;
import java.util.List;

public class MaxTarget {
    public static int findMaxTargetProduct(int[] arrList, int target) {
        int product = 0;
        for (int i = 0; i < arrList.length; i++) {
            for (int j = i + 1; j < arrList.length; j++) {
                if (arrList[i] > target && arrList[j] > target) {
                    product = arrList[i] * arrList[j];
                }
            }
        }
        return product;
    }

    public static int findMaxTargetProduct(List<Integer> arrList, int target) {
        int product = 0;
        for (int i = 0; i < arrList.size(); i++) {
            for (int j = i + 1; j < arrList.size(); j++) {
                if (arrList.get(i) > target && arrList.get(j) > target) {
                    product = arrList.get(i) * arrList.get(j);
                }
            }
        }
        return product;
    }


}