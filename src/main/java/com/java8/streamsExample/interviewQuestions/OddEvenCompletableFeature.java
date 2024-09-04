package com.java8.streamsExample.interviewQuestions;

import java.util.concurrent.*;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class OddEvenCompletableFeature {

    static ExecutorService executorService = Executors.newFixedThreadPool(2);

    static Object obj = new Object();
    static IntPredicate evenCond = (a) -> a % 2 == 0;
    static IntPredicate oddCond = (a) -> a % 2 != 0;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CompletableFuture.runAsync(() -> {
            OddEvenCompletableFeature.printResult(evenCond);
        },executorService);
        CompletableFuture.runAsync(() -> {
            OddEvenCompletableFeature.printResult(oddCond);
        },executorService);
        //Thread.sleep(1000);
    }

    public static void printResult(IntPredicate cond) {
        IntStream.rangeClosed(1, 10).filter(cond)
                .forEach(OddEvenCompletableFeature::execute);

    }

    public static void execute(int i) {
        synchronized (obj) {
            try {
                System.out.println("Thread Name " + Thread.currentThread().getName() + " " + i);
                obj.notify();
                obj.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
