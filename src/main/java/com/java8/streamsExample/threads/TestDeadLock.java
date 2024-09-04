package com.java8.streamsExample.threads;


public class TestDeadLock {
    public static void main(String[] args) {
            // creating one object
            Shared s1 = new Shared();
            Shared s2 = new Shared();
            // creating first thread and starting it
            Thread1 t1 = new Thread1(s1, s2);
            t1.setName("Thread1");
            t1.start();
            // creating second thread and starting it
            Thread2 t2 = new Thread2(s1, s2);
            t2.setName("Thread2");
            t2.start();
            Util.sleep(2000);
        }
    }
