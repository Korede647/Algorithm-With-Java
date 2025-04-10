package org.example;

public class ConvertPlaceValue {
    public static void main(String[] args) {
        // Example numbers to test conversion
        int[] testNumbers = {0, 13, 85, 523, 12345, 100001, 1234567};

        for (int num : testNumbers) {
            System.out.println(num + " in words is: " + numberToWords(num));
        }
    }

    private static final String[] BELOW_TWENTY = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };
    private static final String[] TENS = {
            "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };
    private static final String[] THOUSANDS = {
            "", "Thousand", "Million", "Billion", "Trillion"
    };

    public static String numberToWords(int num){
        if(num == 0){
            return "Zero";
        }

        String words = "";
        int index = 0;

        while (num>0){
            if(num % 1000 != 0){
                words = converter(num % 1000) + THOUSANDS[index] + " " + words;
            }
            num /= 1000;
            index++;
        }
        return words.trim();
    };

    private static String converter(int number){
        if(number == 0){
            return "";
        } else if (number < 20) {
            return BELOW_TWENTY[number] + " ";
        } else if (number < 100) {
            return TENS[number / 10] + " " + converter(number % 10);
        }
        return BELOW_TWENTY[number / 100] + " Hundred " + converter(number % 100);
    }
}
