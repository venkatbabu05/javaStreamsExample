package com.java8.streamsExample.primitiveStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapToObjEx {
    public static void main(String[] args) {
        IntStream input = IntStream.of(5,4,3,2,1);
        List<String> collect = input.mapToObj(Integer::toString).collect(Collectors.toList());
    }
}
