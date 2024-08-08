package com.java8.streamsExample.streamsWithMultiObjects;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindEmpByAge {
    public static void main(String[] args) {
        List<Employee> input = LoadEmployees.getEmployeeDate();
        Map<Boolean, List<Employee>> collect = input.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 30));
        //collect.forEach((k,v)->System.out.println(k+" "+v));
        collect.forEach((flag,empList)->{
            if(flag){
                System.out.println("***********greater than 30*********");
            }else{
                System.out.println("******lesser than 30************");
            }
            List<String> collect1 = empList.stream().map(e -> e.getAge() + " " + e.getName()).collect(Collectors.toList());
            collect1.forEach(e->System.out.println(e));
        });
    }
}
