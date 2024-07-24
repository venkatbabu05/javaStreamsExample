package com.java8.streamsExample.streamsWithObjects;

import java.util.List;

public class Employee {
    private int id;
    private String name;
    private int age;
    private long salary;
    private String gender;
    private List<Department> dept;
    private String city;
    private String dateOfJoining;

    public Employee(int id, String name, int age, long salary, String gender, List<Department> dept, String city, String dateOfJoining) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.dept = dept;
        this.city = city;
        this.dateOfJoining = dateOfJoining;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Department> getDept() {
        return dept;
    }

    public void setDept(List<Department> dept) {
        this.dept = dept;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public void setYearOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                ", dept=" + dept +
                ", city='" + city + '\'' +
                ", dateOfJoining=" + dateOfJoining +
                '}';
    }
}
