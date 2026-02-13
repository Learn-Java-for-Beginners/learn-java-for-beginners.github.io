package com.learnjava.week1.examples;

class BasicStudent {

    String name;
    int age;

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class BasicClassExample {

    public static void main(String[] args) {

        BasicStudent student = new BasicStudent();
        student.name = "Riya";
        student.age = 21;

        student.display();
    }
}
