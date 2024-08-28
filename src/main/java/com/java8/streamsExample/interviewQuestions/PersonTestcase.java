package com.java8.streamsExample.interviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonTestcase {
    public static void main(String[] args) {
        Person p1 = new Person("Jack", 20);
        Person p2 = new Person("Jill", 30);

        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);

        Person test1 = new Person("Jack", 30);
        Person test2 = new Person("Jill", 30);

        System.out.println(isExists(p1, persons)); //true

        System.out.println(isExists(p2, persons)); //true

        System.out.println(isExists(test1, persons)); //false

        System.out.println(isExists(test2, persons)); //true
    }

    private static boolean isExists(Person p1, List<Person> persons) {
        if (persons.contains(p1)){
            return true;
        }
        return false;
    }
}
