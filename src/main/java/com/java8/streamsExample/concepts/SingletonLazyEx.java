package com.java8.streamsExample.concepts;

public class SingletonLazyEx {

    static SingletonLazyEx obj = null;

    private SingletonLazyEx() {
    }

    public static SingletonLazyEx getInstance() {
        if (obj == null) {
            synchronized (SingletonLazyEx.class) {
                if (obj == null) {
                    obj = new SingletonLazyEx();
                }
            }
        }
        return obj;
    }

    public String test(String msg) {
        return msg;
    }
}
