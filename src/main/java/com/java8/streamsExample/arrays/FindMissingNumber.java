package com.java8.streamsExample.arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5 };
        int n = 5;
        System.out.println(missingNumber(n, arr));
    }

    private static int missingNumber(int n, int[] arr) {
        int[] hash = new int[n + 1];

        // Store frequencies of elements
        for (int i = 0; i < n - 1; i++) {
            System.out.println(hash[arr[i]]);
            int i1 = hash[arr[i]]++;
            System.out.println(i1);
        }

        for (int i = 1; i <= n; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}
