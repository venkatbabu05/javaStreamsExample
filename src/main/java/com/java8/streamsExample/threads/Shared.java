package com.java8.streamsExample.threads;


public class Shared {
        // first synchronized method
        synchronized void test1(Shared s2)
        {
            System.out.println(Thread.currentThread().getName() + " enters test1 of " + this);
            Util.sleep(1000);
            // taking object lock of s2 enters
            // into test2 method
            s2.test2();
            System.out.println(Thread.currentThread().getName() + " exits test1 of " + this);
        }
        synchronized void test2()
        {
            System.out.println(Thread.currentThread().getName() + " enters test2 of " + this);
            Util.sleep(1000);
            // taking object lock of s1 enters
            // into test1 method
            System.out.println(Thread.currentThread().getName() + " exits test2 of " + this);
        }
    }

