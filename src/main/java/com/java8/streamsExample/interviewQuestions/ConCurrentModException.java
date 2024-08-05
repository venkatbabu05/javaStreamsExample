package com.java8.streamsExample.interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConCurrentModException {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>(Arrays.asList("1","2","3","4","5","6"));
        /*myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("5");*/

        for (String val : myList) {
            if (val == "5") {
                myList.remove("5");
            }
            System.out.println(val);
        /*Iterator<String> itr = myList.iterator();
        while(itr.hasNext()){
            String val = itr.next();
            System.out.println(val);
            if(val =="4"){
               // itr.remove();
                myList.remove(val);
            }
        }*/

        }
    }
}
