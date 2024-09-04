package com.java8.streamsExample.concepts;

import java.io.Serializable;

public class SingletonPreventionFromBreak implements Cloneable, Serializable {

    //three ways to break singleton pattern
    //1.Clone
    //2.Reflection
    //3.serializable

    private static SingletonPreventionFromBreak instance;

    private SingletonPreventionFromBreak() {
        //prevent from reflection
        if(instance!=null){
            throw new IllegalStateException("Object can't be create using reflection");
        }
    }

    //implement cloneable  and override clone method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    //override readResolve to prevent break from serializable
    protected Object readResolve(){
        return instance;
    }

    private static SingletonPreventionFromBreak getInstance() {
        if (instance == null) {
            synchronized (SingletonPreventionFromBreak.class) {
                if (instance == null) {
                    instance = new SingletonPreventionFromBreak();
                }
            }
        }
        return instance;
    }
}
