package com.java8.streamsExample.concepts;

public class SingletonEagerEx {

    private final static SingletonEagerEx singletonObj = new SingletonEagerEx();

    private SingletonEagerEx() {
    }

    public static SingletonEagerEx getInstance(){
        return singletonObj;
    }

    public String test(String msg){
        return msg;
    }
}
