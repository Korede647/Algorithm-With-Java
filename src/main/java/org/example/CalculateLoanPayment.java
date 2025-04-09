package org.example;

// write a java program that calculate the monthly loan payments using this formular M= Pr(1+r)^n/(1+r)^n - 1
public class CalculateLoanPayment {
    public static void loanPaymentCal(double p, double r, double n){
       double N = n * 12;
       double R = r/(12 * 100);
        double loan;
        loan = Math.round((p * R * Math.pow((1 + R), N)) / (Math.pow((1 + R), N) - 1));
        double yearlyLoan = loan * 12;
        double total = yearlyLoan * n;

        System.out.println("Monthly Payment: " + loan);
        System.out.println("Yearly Loan Amount: " + yearlyLoan);
        System.out.println("Total Amount: " + total);
    }
}
