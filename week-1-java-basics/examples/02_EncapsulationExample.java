package com.learnjava.week1.examples;

class Student {

    private String name;
    private int age;

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class EncapsulationExample {

    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Aman");
        student.setAge(22);

        student.display();
    }
}
