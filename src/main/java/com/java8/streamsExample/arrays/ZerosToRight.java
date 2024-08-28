package com.java8.streamsExample.arrays;

public class ZerosToRight {
    public static void main(String[] args) {

        int[] nums = {1, 2, 0, 0, 3, 4, 0, 0, 0, 4, 2};
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }
        while(count<n){
            nums[count++] = 0;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

}


