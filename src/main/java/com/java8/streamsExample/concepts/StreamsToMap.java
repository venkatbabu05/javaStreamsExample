package com.java8.streamsExample.concepts;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsToMap {

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return name + " (" + age + ")";
        }

        public static void main(String[] args) {
            List<Person> people = Arrays.asList(
                    new Person("Alice", 30),
                    new Person("Bob", 25),
                    new Person("Charlie", 35)
            );

            Map<String, Integer> map = people.stream()
                    .collect(Collectors.toMap(
                            Person::getName,
                            Person::getAge,
                            (existing, replacement) -> existing, // Merge function
                            LinkedHashMap::new // Supplier function for LinkedHashMap
                    ));
            map.entrySet().forEach(System.out::println);
        }
    }
}
