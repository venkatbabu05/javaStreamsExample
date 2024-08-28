package com.java8.streamsExample.primitiveStreams;

import java.util.Arrays;
import java.util.List;

public class CharCountFromListOfString {
    public static void main(String[] args) {
        List<String> word = Arrays.asList("hello", "world","apple","orange");
        //solution 1
        long count1 = word.stream().map(e -> e.chars().filter(c -> c == 'l')).count();

        //solution 2
        long sum = word.stream().mapToLong(e -> e.chars().filter(c -> c == 'l').count()).sum();

        //solution3
        long count3 =word.stream().flatMapToInt(CharSequence::chars).filter(c->c=='l').count();

    }
}
