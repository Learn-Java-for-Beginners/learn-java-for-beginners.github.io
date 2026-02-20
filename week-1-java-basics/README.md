---
layout: default
title: Week 1 - Java Basics
parent: Weekly Curriculum
nav_order: 1
has_children: true
---

# Week 1 – Java Fundamentals and OOP Foundations

## 🎯 Week Objective

This week focuses on building a strong foundation in Java programming and Object-Oriented Programming (OOP). By the end of this week, you should be able to:

* Understand how Java programs execute
* Write clean and structured Java classes
* Apply OOP principles correctly
* Use constructors and access modifiers properly
* Follow basic coding standards
* Think like a backend engineer (not just a student)

---

# 1️⃣ Understanding Java Execution (High-Level)

Before writing backend systems, it is important to understand how Java runs.

## Java Execution Flow

1. You write `.java` source code.
2. It is compiled by `javac` into bytecode (`.class` files).
3. The JVM (Java Virtual Machine) executes the bytecode.

### Key Concepts

* **JDK** – Java Development Kit (development tools)
* **JRE** – Java Runtime Environment (to run applications)
* **JVM** – Executes bytecode
* **Bytecode** – Platform-independent compiled code

This is why Java is platform independent.

---

# 2️⃣ Basic Program Structure

Example:

```java
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello Backend World!");
    }
}
```

### Breakdown

* `public` → access modifier
* `class` → defines a class
* `main()` → entry point of program
* `String[] args` → command-line arguments
* `System.out.println()` → prints output

---

# 3️⃣ Variables and Data Types

Java is a statically typed language.

## Primitive Types

| Type    | Example |
| ------- | ------- |
| int     | 10      |
| double  | 10.5    |
| boolean | true    |
| char    | 'A'     |

Example:

```java
int age = 25;
double salary = 45000.75;
boolean isActive = true;
```

## Reference Types

* String
* Arrays
* Objects

Example:

```java
String name = "Aditya";
```

---

# 4️⃣ Control Structures

## If-Else

```java
if (age > 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}
```

## Switch

```java
switch (role) {
    case "ADMIN":
        System.out.println("Admin access");
        break;
    default:
        System.out.println("User access");
}
```

## Loops

### For Loop

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

### While Loop

```java
while (age > 0) {
    age--;
}
```

---

# 5️⃣ Introduction to OOP (Very Important)

Backend development is built on OOP principles.

## What is OOP?

Object-Oriented Programming organizes software using:

* Objects
* Classes
* Encapsulation
* Inheritance
* Polymorphism
* Abstraction

---

# 6️⃣ Classes and Objects

## Class Definition

```java
public class Student {

    String name;
    int age;

    void display() {
        System.out.println(name + " " + age);
    }
}
```

## Creating Object

```java
Student s1 = new Student();
s1.name = "Riya";
s1.age = 22;
s1.display();
```

---

# 7️⃣ Encapsulation (Critical for Backend)

Encapsulation means hiding internal data and exposing controlled access.

### Bad Practice

```java
public String name;
```

### Good Practice

```java
private String name;

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}
```

Why important?

* Protects data
* Prevents invalid state
* Improves maintainability

---

# 8️⃣ Constructors

Constructors initialize objects.

```java
public class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

Usage:

```java
Student s = new Student("Riya", 22);
```

---

# 9️⃣ Inheritance

Allows reuse of code.

```java
public class Person {
    protected String name;
}

public class Student extends Person {
    private int rollNumber;
}
```

Use `extends` keyword.

---

# 🔟 Polymorphism

Method overriding example:

```java
public class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

public class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}
```

Polymorphism allows flexible design.

---

# 1️⃣1️⃣ Abstraction

Abstraction hides implementation details.

Using abstract class:

```java
abstract class Shape {
    abstract double area();
}
```

Using interface:

```java
interface Payment {
    void processPayment();
}
```

Backend systems heavily use interfaces.

---

# 1️⃣2️⃣ Access Modifiers

| Modifier  | Scope                |
| --------- | -------------------- |
| private   | Within class         |
| default   | Package              |
| protected | Package + subclasses |
| public    | Everywhere           |

Always prefer the least permissive access level.

---

# 1️⃣3️⃣ Packages

Packages organize code.

Example:

```java
package com.backend.student;
```

Good practice:

```
com.company.project.module
```

---

# 1️⃣4️⃣ Clean Code Basics

From Day 1, follow standards:

✔ Use meaningful names
✔ Avoid long methods (>30 lines)
✔ One responsibility per method
✔ Avoid duplicate code
✔ Use proper indentation

---

# 1️⃣5️⃣ Debugging Basics

Learn to:

* Use breakpoints
* Inspect variables
* Step into / step over
* Identify null pointer exceptions

As a tester transitioning to backend, debugging will become your strength.

---

# 🧠 Engineering Thinking for Week 1

Ask yourself:

* What happens if age is negative?
* What if name is null?
* Can someone create Student without age?
* How can we prevent invalid object creation?

Backend engineering starts with defensive thinking.

---

# 🛠 Mini Practice Project (This Week)

Create:

## Student Management Console Application

Features:

* Create Student
* Display Student
* Validate input
* Use encapsulation
* Use constructor
* Use packages properly

---

# 📌 Deliverables for Week 1

* All exercises completed
* Assignment submitted via PR
* Code follows naming standards
* No public fields
* Proper constructor usage
* Clear commit messages

---

# 🚀 End of Week Outcome

By the end of Week 1, you should:

* Write structured Java classes
* Understand OOP deeply
* Apply encapsulation correctly
* Create and use constructors
* Think about edge cases
* Debug basic programs confidently

---

Next week we move to:

[👉 Collections, Exceptions & Functional Programming](./../week-2-collections-exceptions)

---
