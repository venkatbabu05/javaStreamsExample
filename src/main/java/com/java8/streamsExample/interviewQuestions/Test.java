package com.java8.streamsExample.interviewQuestions;


import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Test {

    static ExecutorService executorService = Executors.newFixedThreadPool(2);

    static Object obj = new Object();

    static IntPredicate even = a -> a % 2 == 0;
    static IntPredicate odd = a -> a % 2 != 0;

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture.runAsync(() -> {
            Test.printResult(even);
        });
        CompletableFuture.runAsync(() -> {
            Test.printResult(odd);
        });

    }

    private static void printResult(IntPredicate cond) {
        IntStream.rangeClosed(1, 10).filter(cond)
                .forEach(Test::execute);
    }

    private static void execute(int a) {

        synchronized (obj) {
            System.out.println(Thread.currentThread().getName() + " " + a);
            try {
                obj.notify();
                obj.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
