package com.java8.streamsExample.arrays;

public class LongestPalindrome {
    static int resultStart;
    static int resultLength;

    public static void main(String[] args) {
        String input = "abcbedrardea";
        for (int i = 0; i < input.length(); i++) {
            checkPalindrome(input, i, i);
        }
        System.out.println(input.substring(resultStart,resultStart+resultLength));
    }

    private static void checkPalindrome(String input, int begin, int end) {
        while (begin >= 0 && end < input.length() && input.charAt(begin) == input.charAt(end)) {
            begin--;
            end++;
        }
        if (resultLength < end-begin-1) {
            resultStart = begin + 1;
            resultLength = end -begin-1;
        }
    }
}
