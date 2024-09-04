package com.java8.streamsExample.arrays;

import java.util.HashSet;
import java.util.Set;

public class FindPair {
    public static void main(String[] args) {
        int a[] = {1, 2, 4, -7, 4, 5, 3};
        findPair(a, 5);
    }

    private static void findPair(int[] a, int target) {
        Set<Integer> seen = new HashSet<>();
        Set<String> pair = new HashSet<>();
        for (int num : a) {
            int complement = target - num;
            System.out.println("num " + num);
            System.out.println("complement " + complement);
            if (seen.contains(complement)) {
                int min = Math.min(num, complement);
                int max = Math.max(num, complement);
                System.out.println("min " + min);
                System.out.println("max " + max);
                pair.add(min + " " + max);
            }
            seen.add(num);
        }
        if (pair.isEmpty()) {
            System.out.println("not found");
        } else {
            for (String p : pair) {
                System.out.println(p);
            }
        }
    }
}
