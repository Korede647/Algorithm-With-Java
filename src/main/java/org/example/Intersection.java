package org.example;

import java.util.ArrayList;
import java.util.List;

public class Intersection {
    public static ArrayList<String> findIntersection (ArrayList<String> firstArr, ArrayList<String> secondArr){
        ArrayList<String> newArr = new ArrayList<>();
        for (int i = 0; i < firstArr.size(); i++){
            if (firstArr.contains(secondArr.get(i))){
                newArr.add(firstArr.get(i));
            }
        }
      return newArr;
    }
}
