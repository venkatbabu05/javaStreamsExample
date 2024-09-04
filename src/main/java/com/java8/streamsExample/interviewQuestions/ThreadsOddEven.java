package com.java8.streamsExample.interviewQuestions;

public class ThreadsOddEven implements Runnable {

    Object obj;
    static int count = 1;

    public ThreadsOddEven(Object obj) {
        this.obj = obj;
    }

    @Override
    public void run() {


        while (count < 10) {
            synchronized (obj) {
            if (count % 2 == 0 && Thread.currentThread().getName().equals("even")) {

                    System.out.println(Thread.currentThread().getName() +" value " + count);
                    count++;
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            synchronized (obj) {
            if (count % 2 != 0 && Thread.currentThread().getName().equals("odd")) {

                    System.out.println(Thread.currentThread().getName() +" value " + count);
                    count++;
                    obj.notify();
                }
            }
        }

    }

    public static void main(String[] args) {

        Object obj = new Object();
        Runnable r1 = new ThreadsOddEven(obj);
        Runnable r2 = new ThreadsOddEven(obj);
        new Thread(r1, "even").start();
        new Thread(r2, "odd").start();
    }
}
