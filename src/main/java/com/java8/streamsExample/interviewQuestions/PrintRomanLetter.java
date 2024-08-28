package com.java8.streamsExample.interviewQuestions;

public class PrintRomanLetter {

    public static void main(String[] args) {
        int number = 1994; // Example number
        if (number < 1 || number > 3999) {
            System.out.println("Number out of range (1-3999)");
        } else {
            System.out.println("Roman numeral: " + intToRoman(number));
        }
    }

    public static String intToRoman(int num) {
        // Define arrays of Roman numeral symbols and their corresponding values
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        // Convert number to Roman numeral
        String roman = "";
        roman += thousands[num / 1000];
        roman += hundreds[(num % 1000) / 100];
        roman += tens[(num % 100) / 10];
        roman += ones[num % 10];

        return roman;
    }
}
