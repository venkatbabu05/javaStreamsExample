package com.java8.streamsExample.arrays;

public class FindMissingNumber_1 {
    public static int missingNumber(int n, int[] arr)
    {
        int sum = 0;

        // Calculate the sum of array elements
        for (int i = 0; i < n - 1; i++) {
            sum += arr[i];
        }

        // Calculate the expected sum
        int expectedSum = (n * (n + 1)) / 2;

        // Return the missing number
        return expectedSum - sum;
    }

    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 5 };
        int n = 5;
        System.out.println(missingNumber(n, arr));
    }
}
