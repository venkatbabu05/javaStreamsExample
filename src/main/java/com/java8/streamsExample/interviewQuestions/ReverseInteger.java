package com.java8.streamsExample.interviewQuestions;

public class ReverseInteger {

    static int reversNumber(int n)
    {
      int reversed_n =0;
      while (n>0){
          reversed_n = reversed_n *10 + n%10;
          n = n/10;
      }
      return reversed_n;
    }

    public static void main(String[] args) {
        System.out.println(reversNumber(172));
    }
}
