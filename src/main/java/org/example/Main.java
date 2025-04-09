package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import static org.example.CalculateLoanPayment.loanPaymentCal;
import static org.example.MaxTarget.findMaxTargetProduct;
import static org.example.TargetSum.findTargetSum;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Integer> nums = new LinkedList<>();

        nums.add(12);
        nums.add(2);
        nums.add(11);
        nums.add(10);

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//

//        TargetLogic targetSum = new TargetLogic();
//        targetSum.findTargetSum(nums, 23);

        int[] array = {23, 4, 5, 8, 15, 90};
        FindHighestSubstring highestSubstring = new FindHighestSubstring();
        highestSubstring.highestSubstring("abcadcabcdab");
//        CalculateLoanPayment calculus = new CalculateLoanPayment();
//        System.out.println("Input your Principal(Loan Amount): ");
//       int principal = input.nextInt();
//        System.out.println("Input the interest rate: ");
//        int interest = input.nextInt();
//        System.out.println("Input the duration of payment: ");
//        int duration = input.nextInt();
//        loanPaymentCal(principal, interest, duration);
//         TargetIndex.findSumIndex(array, 15);
//        System.out.println("Indices: " + Arrays.toString(TargetIndex.findSumIndex(array, 9)));
//        System.out.println("Indices: " + Arrays.toString(findTargetSum(array, 59)));
//        System.out.println("Indices" + findTargetSum(nums, 12));
//        System.out.println("Max Product: " + findMaxProduct(array));

//        ArrayList<String> firstList = new ArrayList<>();
//        firstList.add("James");
//        firstList.add("Sam");
//        firstList.add("Korede");
//        firstList.add("Xander");
//        firstList.add("Prize");
//
//        ArrayList<String> secondList = new ArrayList<>();
//        secondList.add("James");
//        secondList.add("Sam");
//        secondList.add("Xander");
//        secondList.add("Prize");
//        secondList.add("Fabian");
//
////        System.out.println("Intersection: " + findIntersection(firstList, secondList));
//
//        System.out.println("Product of numbers greater than Target: " + findMaxTargetProduct(nums, 10));

    }



}
// Find Intersection btwn two lists List1 = [1,2,3,4,5] List2 = [3,6,8,10,4] Intersection = [3,4]