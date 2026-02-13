package com.learnjava.week1.examples;

class Animal {

    public void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Bark");
    }
}

public class PolymorphismExample {

    public static void main(String[] args) {

        Animal animal = new Dog();
        animal.sound();  // Runtime polymorphism
    }
}
