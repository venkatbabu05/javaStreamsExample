package com.java8.streamsExample.arrays;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find1stNonRepeat {
    public static void main(String[] args) {
        int [] input ={4, 5, 1, 2, 0, 4, 5, 2};
        int result = findResult(input);
        if(result!=-1){
            System.out.println("1st non repeating value = "+result);
        }
    }

    private static int findResult(int[] input) {
        Map<Integer,Integer> output = new HashMap<>();
        for(int i=0;i<input.length;i++){
            if(output.containsKey(input[i])){
                output.put(input[i],output.get(input[i])+1);
            }else{
                output.put(input[i],1);
            }
        }

        for(int value: input){
            if(output.get(value) ==1){
                return value;
            }
        }
        return -1;
    }
}
