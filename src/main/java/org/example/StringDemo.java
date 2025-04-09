package org.example;

public class StringDemo {
    public static void main(String[] args) {
        String name = "Korede"; // string pool
//        System.out.println(name.length());
//        System.out.println(name.charAt(1));
//        String s2 = new String("Inala"); // heap memory
//        System.out.println(s2);

        String str = "Aptech is a world class school";
//        str.concat("Port Harcourt");
//        System.out.println(str.charAt(str.length()-1));

//       int index = str.indexOf("h");
//        System.out.println(index);

//       String replace = str.replace("school", "university");
//        System.out.println(replace);
//
//        String[] strArr = str.split(" ");
//        boolean isFound = str.contains("class");
//        System.out.println(isFound);

//        String password = "A12345";
//        String conFam = new String("a12345");
//        String confirmPassword = "12345";
//        System.out.println((password == confirmPassword));
//        System.out.println(password.equals(conFam));
//        System.out.println(password.equalsIgnoreCase(conFam));

//        String nameOf = "Michael";
//        int age = 32;
//       String output = String.format("Name: %s \nAge: %d", nameOf, age);
//        System.out.println(output);
//        int pwd = Integer.parseInt("1234");
//        int oldAge = 80;
//        String ageOld = String.valueOf(80);
//        Double v = Double.valueOf(89);
//        System.out.println(v);

        String sChar = "This is Lovely";
        char[] charArray = sChar.toCharArray();
//        System.out.println(charArray[0]);
        char[] term = {'B', 'E', 'S', 'T'};
        String str6 = new String(term);
//       System.out.println(str6);
//        for(int i = 0; i<str6.length(); i++){
//            System.out.println(str6.charAt(i));
//        }
//        CountFrequencyOfChar countChar = new CountFrequencyOfChar();
//        System.out.println(countChar.findNoOfChar("Korede", 'e'));

        CountVowels vowelCount = new CountVowels();
        System.out.println(vowelCount.FindVowels("Antimon" +
                "opolographismhheeee"));
    }
}
