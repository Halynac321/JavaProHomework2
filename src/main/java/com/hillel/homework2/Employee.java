package com.hillel.homework2;

import java.util.stream.Stream;

public class Employee {
    private String name;
    private String surname;
    private String jobTitle;
    private int phoneNumber;
    private int age;
    private String email;

    public Employee(String name, String surname, String jobTitle, int phoneNumber, int age, String email) {
        this.name = name;
        this.surname = surname;
        this.jobTitle = jobTitle;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
