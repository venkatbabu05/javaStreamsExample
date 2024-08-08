package com.java8.streamsExample.StreamsWithObject;

import java.util.List;
import java.util.stream.Collectors;

public class FindEmpByAge30 {
    public static void main(String[] args) {
      List<Employee> input = LoadEmployees.getEmployeeDate();
      List<Employee>  output = input.stream().filter(e->e.getAge()>=30 && e.getAge()<=30).collect(Collectors.toList());
      output.forEach(e->System.out.println(e));
    }
}
