package com.java8.streamsExample.arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        //Find the non- repeated number from an array with out using any pre defined methods ?
        // int[] input = {1, 1, 2, 2, 4, 4};
        int input[] = {9, 4, 9, 6, 7, 4};
        int result = findNonRepeatArray(input, input.length);
        System.out.println(result);

        LinkedList ll = new LinkedList();
        ll.get(1);
    }

    private static int findNonRepeatArray(int[] input, int n) {

        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < n; j++) {
                if (i != j && input[i] == input[j]) {
                    break;
                }
            }
            if (j == n) {
                return input[i];
            }
        }
        return 0;
    }
}
