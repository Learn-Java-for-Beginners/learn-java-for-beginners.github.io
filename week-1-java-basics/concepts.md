---
layout: default
title: Concepts
parent: Week 1 - Java Basics
nav_order: 1
---

# Concepts – Week 1: Java Foundations and OOP Thinking

This document explains the **core engineering concepts** behind Java basics.
The goal is not memorization — the goal is clarity.

---

# 1️⃣ What Makes Java Different?

Java is:

* Object-Oriented
* Strongly Typed
* Compiled + Interpreted (via JVM)
* Platform Independent

The most important thing to remember:

> Java is designed for building large, maintainable systems.

Backend systems rely heavily on structure, predictability, and clarity — Java enforces these.

---

# 2️⃣ Primitive vs Reference Types

Understanding memory model basics is important even at beginner stage.

## Primitive Types

Stored directly in memory.

Examples:

* int
* double
* boolean
* char

Example:

```java
int x = 10;
```

Here, `x` directly stores value `10`.

---

## Reference Types

They store a reference (memory address) to an object.

Example:

```java
String name = "Riya";
```

Here:

* The actual string object lives in memory.
* `name` holds a reference to it.

This distinction becomes very important later (especially in collections and ORM frameworks).

---

# 3️⃣ Stack vs Heap (High-Level Understanding)

When you create variables:

* Primitive values → stored in stack
* Objects → stored in heap
* Reference variables → stored in stack pointing to heap

Example:

```java
Student s = new Student("Riya", 22);
```

What happens?

1. Memory allocated in heap for Student
2. Constructor runs
3. Reference `s` stored in stack

You don’t need deep JVM internals yet — just conceptual clarity.

---

# 4️⃣ What is a Class?

A class is a blueprint.

Think of it as:

* Structure
* Behavior definition
* Data container

Example:

```java
public class Student {
    private String name;
    private int age;
}
```

This defines what a Student **is**.

---

# 5️⃣ What is an Object?

An object is an instance of a class.

```java
Student s1 = new Student("Riya", 22);
```

This creates a real entity in memory.

Important:

> Class = Blueprint
> Object = Real-world instance

---

# 6️⃣ Encapsulation – Why It Matters in Backend

Encapsulation is not just about `private` keyword.

It means:

* Protecting object state
* Preventing invalid values
* Controlling modification

Example:

```java
public void setAge(int age) {
    if (age < 0) {
        throw new IllegalArgumentException("Age cannot be negative");
    }
    this.age = age;
}
```

Now your object cannot enter invalid state.

This is critical in backend systems.

---

# 7️⃣ Constructor – Object Initialization Discipline

A constructor ensures:

* Object is created in valid state
* Mandatory fields are set

Example:

```java
public Student(String name, int age) {
    if (name == null || name.isBlank()) {
        throw new IllegalArgumentException("Name cannot be empty");
    }
    this.name = name;
    this.age = age;
}
```

Without constructor validation, your system becomes fragile.

---

# 8️⃣ Inheritance – Code Reuse vs Design Responsibility

Inheritance allows one class to reuse another.

Example:

```java
class Person {
    protected String name;
}

class Student extends Person {
    private int rollNumber;
}
```

But remember:

> Inheritance should represent “is-a” relationship.

Student **is a** Person.

Not everything should use inheritance.
Later we will see composition is often better.

---

# 9️⃣ Polymorphism – Flexibility in Design

Polymorphism allows:

* One interface
* Multiple implementations

Example:

```java
Animal a = new Dog();
a.sound();
```

Even though `a` is type Animal, actual method of Dog runs.

This is runtime polymorphism.

Why important?

Backend frameworks like Spring use this extensively.

---

# 🔟 Abstraction – Hide Complexity

Abstraction allows hiding implementation.

Example:

```java
interface PaymentService {
    void process();
}
```

You don’t care how payment is processed — you care that it can be processed.

This becomes critical in scalable backend systems.

---

# 1️⃣1️⃣ Access Modifiers – Controlling Visibility

Never expose more than necessary.

Bad:

```java
public String name;
```

Good:

```java
private String name;
```

Principle:

> Default to private. Expose only what is needed.

---

# 1️⃣2️⃣ The "this" Keyword

`this` refers to the current object.

Example:

```java
public Student(String name) {
    this.name = name;
}
```

It distinguishes between:

* Instance variable
* Method parameter

---

# 1️⃣3️⃣ Method Design Principles

Good methods:

* Do one thing
* Have meaningful names
* Are short
* Avoid deep nesting

Bad:

```java
public void processStudentDataAndSaveAndPrint() { ... }
```

Good:

```java
validateStudent();
saveStudent();
printStudent();
```

---

# 1️⃣4️⃣ Common Beginner Mistakes

Be aware of:

* Forgetting private fields
* Creating empty constructors unnecessarily
* Not validating input
* Writing everything in main()
* Using too many static methods
* Poor naming conventions

---

# 1️⃣5️⃣ Static Keyword (Basic Understanding)

Static means:

* Belongs to class
* Not object-specific

Example:

```java
public static void main(String[] args)
```

Static variables are shared across objects.

Avoid excessive static usage in OOP design.

---

# 1️⃣6️⃣ Null – The Most Dangerous Thing

Null causes:

```
NullPointerException
```

Example:

```java
Student s = null;
s.getName();  // Exception
```

Always ask:

* Can this variable be null?
* Should I validate before use?

Backend engineers must think defensively.

---

# 1️⃣7️⃣ Naming Conventions (Industry Standard)

Follow Java conventions:

Classes:

```
Student
OrderService
PaymentController
```

Variables:

```
studentName
orderAmount
```

Constants:

```
MAX_RETRY_COUNT
```

Packages:

```
com.company.project.module
```

---

# 1️⃣8️⃣ Thinking Like a Backend Engineer

When writing even simple class, ask:

* Can this object be misused?
* Is it thread-safe? (Later concept)
* Can invalid data enter?
* Is this responsibility correct?

Even in Week 1, start thinking in terms of:

* Responsibility
* Validation
* Clean boundaries

---

# 1️⃣9️⃣ Object Responsibility Principle (Beginner Version)

Each class should:

* Represent one concept
* Have one responsibility

Student should not:

* Save itself to database
* Print itself
* Manage other students

Separation of concerns begins here.

---

# 2️⃣0️⃣ Why Week 1 Is Critical

If OOP foundation is weak:

* Spring will feel confusing
* Hibernate will feel magical
* Debugging will be hard
* Code will become messy

Strong OOP → Smooth backend journey.

---

# 🧠 Self Reflection Questions

1. Why should fields be private?
2. What happens if constructor does not validate input?
3. When should you use inheritance?
4. What is the difference between object and class?
5. Why is null dangerous?

If you can confidently answer these — Week 1 is strong.

---
