package com.learnjava.week1.examples;

class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class StudentPrinter {

    public void print(Student student) {
        System.out.println("Student Name: " + student.getName());
    }
}

public class SeparationOfConcernExample {

    public static void main(String[] args) {

        Student student = new Student("Aman");
        StudentPrinter printer = new StudentPrinter();

        printer.print(student);
    }
}
