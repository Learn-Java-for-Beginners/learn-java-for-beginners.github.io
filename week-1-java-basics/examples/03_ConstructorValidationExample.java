package com.learnjava.week1.examples;

class ValidatedStudent {

    private String name;
    private int age;

    public ValidatedStudent(String name, int age) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        if (age < 16) {
            throw new IllegalArgumentException("Age must be at least 16");
        }

        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ValidatedStudent{name='" + name + "', age=" + age + "}";
    }
}

public class ConstructorValidationExample {

    public static void main(String[] args) {

        ValidatedStudent student =
                new ValidatedStudent("Kavya", 20);

        System.out.println(student);
    }
}
