package com.java8.streamsExample.arrays;

public class FindMaxSubArray {
    public static void main(String[] args) {
        int[] input = {-4, 2, -5, 1, 2, 3, 6, -5, 1};
        System.out.println(findResult(input));
    }

    private static int findResult(int[] input) {
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < input.length; i++) {
            int temp = curSum + input[i];
            if (temp < input[i]) {
                curSum = input[i];
            } else {
                curSum = temp;
            }
            if (maxSum < curSum) {
                maxSum = curSum;
            }
        }
        return maxSum;
    }
}
