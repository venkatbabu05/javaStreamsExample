package com.java8.streamsExample.interviewQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class FindTotalAmtEachCatagory {
    public static class Transaction {
        private Date date;
        private double amount;
        private String category;

        public Transaction(Date date, double amount, String category) {

            this.date = date;
            this.amount = amount;
            this.category = category;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }
    }

    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction(new Date(System.currentTimeMillis() - 5 * 24 * 60 * 60 * 1000L), 100.0, "Food"),
                new Transaction(new Date(System.currentTimeMillis() - 10 * 24 * 60 * 60 * 1000L), 200.0, "Food"),
                new Transaction(new Date(System.currentTimeMillis() - 40 * 24 * 60 * 60 * 1000L), 300.0, "Travel"),
                new Transaction(new Date(System.currentTimeMillis() - 20 * 24 * 60 * 60 * 1000L), 150.0, "Travel")
        );

        Map<String, List<Transaction>> collect = transactions.stream().collect(Collectors.groupingBy(Transaction::getCategory));
        collect.forEach((cata,transList)->{
            Double collect1 = transList.stream().filter(e -> e.getDate().after(new Date(System.currentTimeMillis() - 30L * 24 * 60 * 60 * 1000)))
                    .collect(Collectors.summingDouble(Transaction::getAmount));
            System.out.println(cata+" amount = "+collect1);
        });
        /*Map<String, Double> result = transactions.stream()
                // Filter transactions within the last 30 days
                .filter(t -> t.getDate().after(new Date(System.currentTimeMillis() - 30L * 24 * 60 * 60 * 1000)))
                // Group by category
                .collect(Collectors.groupingBy(
                        Transaction::getCategory,
                        Collectors.summingDouble(Transaction::getAmount)
                ));*/


    }
}

