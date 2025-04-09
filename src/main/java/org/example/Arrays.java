package org.example;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[4];
        numbers[0] = 34;
        numbers[1] = 56;
        numbers[2] = 78;
        numbers[3] = 94;

//        for(int num: numbers){
//            System.out.println(num);
//        }
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
