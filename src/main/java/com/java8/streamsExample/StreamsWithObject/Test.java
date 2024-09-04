package com.java8.streamsExample.StreamsWithObject;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        int a[] = {1, 2, 4, -7, 4, 5, 3};
        Set<String> res = new HashSet<>();
        for (int i=0;i<a.length;i++){
            for (int j =i+1;j<a.length;j++){
                if(a[i]+a[j]==6){
                    String pair = a[i] +" "+a[j];
                    if(!res.contains(pair)) {
                        res.add(pair);
                    }
                }
            }
        }

        for (String v : res){
            System.out.println(v);
        }
    }
}
