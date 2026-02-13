package com.learnjava.week1.examples;

class Person {

    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("Hello, I am " + name);
    }
}

class Student extends Person {

    private String studentId;

    public Student(String name, String studentId) {
        super(name);
        this.studentId = studentId;
    }

    public void showStudentId() {
        System.out.println("Student ID: " + studentId);
    }
}

public class InheritanceExample {

    public static void main(String[] args) {

        Student student = new Student("Riya", "S101");

        student.introduce();
        student.showStudentId();
    }
}
