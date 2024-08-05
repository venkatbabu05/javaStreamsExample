package com.java8.streamsExample.concepts;

import java.util.concurrent.Callable;

public class SingletonTest {
    public static void main(String[] args) {
        String eager1 = SingletonEagerEx.getInstance().test("hello venkat");
        String eager2 = SingletonEagerEx.getInstance().test("hello venkat1");
        String eager3 = SingletonEagerEx.getInstance().test("hello venkat2");
        System.out.println(eager1);
        System.out.println(eager2);
        System.out.println(eager3);
        String lazy1 = SingletonLazyEx.getInstance().test("Hi Hello!");
        String lazy2 = SingletonLazyEx.getInstance().test("Hi Hello1!");
        String lazy3 = SingletonLazyEx.getInstance().test("Hi Hello2!");
        System.out.println(lazy1);
        System.out.println(lazy2);
        System.out.println(lazy3);

    }
}
