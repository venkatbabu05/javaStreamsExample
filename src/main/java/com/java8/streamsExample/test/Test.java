package com.java8.streamsExample.test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {

        List<Product> pList1 = new ArrayList<>();
        List<Product> pList2 = new ArrayList<>();
        List<Product> pList3 = new ArrayList<>();
        Product p1 = new Product(1, "Apple", 50000);
        Product p2 = new Product(2, "OnePlus", 40000);
        Product p3 = new Product(3, "Samsung", 30000);
        Product p4 = new Product(4, "Oppo", 20000);
        Product p5 = new Product(5, "Moto", 25000);
        Product p6 = new Product(6, "Moto1", 30000);
        Product p7 = new Product(7, "Moto2", 10000);
        Product p8 = new Product(8, "Moto3", 5000);
        Product p9 = new Product(9, "Moto4", 6000);
        pList1.add(p1);
        pList1.add(p2);
        pList1.add(p3);
        pList2.add(p4);
        pList2.add(p5);
        pList2.add(p6);
        pList3.add(p7);
        pList3.add(p8);
        pList3.add(p9);
        Orders o1 = new Orders(1, pList1);
        Orders o2 = new Orders(2, pList2);
        Orders o3 = new Orders(3, pList3);
        List<Orders> oList = new ArrayList<>();
        oList.add(o1);
        oList.add(o2);
        oList.add(o3);

        Optional<Product> max = oList.stream().flatMap(e -> e.getProducts().stream()).
                min(Comparator.comparing(Product::getPrice));

        System.out.println(max.get());
        //sorted(Comparator.comparing(Product::getPrice))
                //.limit(1);


    }
}