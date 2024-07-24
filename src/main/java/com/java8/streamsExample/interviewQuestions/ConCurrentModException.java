package com.java8.streamsExample.interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConCurrentModException {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("5");

        for (String val : myList) {
            System.out.println(val);
            if (val == "5") {
                myList.remove(val);
            }
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
