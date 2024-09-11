package com.java8.streamsExample.arrays;

import java.util.*;
import java.util.stream.Stream;

public class MergeTwoArray {
    public static void main(String[] args) {
        String str1[] = { "A", "E", "I" };          //source array
        String str2[] = { "O", "U" };               //destination array

        // merge array using streams
        Object[] array = Stream.of(str1, str2).flatMap(Stream::of).toArray();
        System.out.println(Arrays.toString(array));

        //merge array using collection
        List list = new ArrayList(Arrays.asList(str1));
        list.addAll(Arrays.asList(str2));
        Object[] str3 = list.toArray();

        //also using two for loops


    }
}
