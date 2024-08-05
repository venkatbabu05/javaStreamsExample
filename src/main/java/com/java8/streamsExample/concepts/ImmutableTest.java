package com.java8.streamsExample.concepts;

import java.util.ArrayList;
import java.util.List;

public class ImmutableTest {
    public static void main(String[] args) {
        List<String> num = new ArrayList<>();
        num.add("12345");
        num.add("6789");
        num.set(1,"45435234");
        ImmutableEmpClass obj = new ImmutableEmpClass(1, "venkat", "CSE", num);
        System.out.println(obj);
        num.add("5431");
        System.out.println(obj);
        num.add("98765");
        System.out.println(obj.getMobNum());

    }
}
