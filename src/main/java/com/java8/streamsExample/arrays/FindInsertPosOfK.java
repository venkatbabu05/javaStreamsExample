package com.java8.streamsExample.arrays;

public class FindInsertPosOfK {
    public static void main(String[] args) {
        // Input: arr[] = {1, 3, 5, 6}, K = 5
        //Output: 2
        int[] in = {1, 3, 5, 6};
        int k = 2;
        System.out.println(findKthPosition(in, k));

    }

    private static int findKthPosition(int[] in, int k) {
        for (int i = 0; i < in.length; i++) {
            if (in[i] == k) {
                return i;
            } else if (in[i] > k) {
                return i;
            }
        }
        return k;
    }
}
