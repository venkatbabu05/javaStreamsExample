package com.java8.streamsExample.interviewQuestions;

public class ThreadsOddEven2 implements Runnable{

    static Object obj;

    public static void main(String[] args) {
        Runnable r1 = new ThreadsOddEven2();
        Runnable r2 = new ThreadsOddEven2();
        Thread t1 = new Thread(r1, "even-thread ");
        Thread t2 = new Thread(r2, "odd-thread ");
        t1.start();
        t2.start();

    }

    @Override
    public void run() {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    synchronized (obj) {
                        System.out.println(Thread.currentThread().getName() + i);
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }

                }
                if (i % 2 != 0) {
                    synchronized (obj) {
                        System.out.println(Thread.currentThread().getName() + i);
                        obj.notify();
                    }

                }

            }

    }
}
