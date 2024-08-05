package com.java8.streamsExample.interviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PersonTestCase {
        String name;
        int age;

        public PersonTestCase(String name, int age) {
            this.name= name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String toString() {
            return "Person[" + name + age + " ]";
        }

   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonTestCase that = (PersonTestCase) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

