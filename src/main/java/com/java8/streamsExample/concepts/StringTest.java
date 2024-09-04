package com.java8.streamsExample.concepts;

public class StringTest {

    public static void concat(String s){
        s="babu";
        System.out.println("inside method :"+s);
    }

    public static void concat(StringBuilder s){
        s.append("babu");
    }

    public static void main(String[] args) {

        String s = "venkat";
        System.out.println("original String :"+s);
        s="babu";
        //concat(s);
        System.out.println("altered String :"+s);
        StringBuilder sb = new StringBuilder();
        sb.append("venkat");
        System.out.println("original sb :"+sb);
        concat(sb);
        System.out.println("altered sb :"+sb);
        System.out.println(sb);

    }
}
