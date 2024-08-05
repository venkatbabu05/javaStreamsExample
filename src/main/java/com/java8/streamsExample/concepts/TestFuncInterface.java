package com.java8.streamsExample.concepts;

public class TestFuncInterface {
    public static void main(String[] args) {
        FuncInterface result = (a,b)->a+b;
        int res = result.add(5,10);
        System.out.println(res);
    }
}
