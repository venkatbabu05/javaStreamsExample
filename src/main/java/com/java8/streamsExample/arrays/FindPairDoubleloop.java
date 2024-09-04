package com.java8.streamsExample.arrays;


import java.util.HashSet;
import java.util.Set;

public class FindPairDoubleloop {
    public static void main(String[] args) {
        int a[] = {1, 2, 4, -7, 4, 5, 3};
        findPairs(a, 6);
    }

    private static void findPairs(int[] a, int t) {
        Set<String> pairs = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == t) {
                    String pair = a[i] + " " + a[j];
                    if(!pairs.contains(pair)){
                        System.out.println(pair);
                        pairs.add(pair);
                    }

                }
            }
        }
    }
}
