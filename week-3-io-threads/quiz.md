---
layout: default
title: Quiz
parent: Week 3 - IO & Threads
nav_order: 3
---

# Week 3 – Quiz  
## File IO and Multithreading

This quiz is designed to test:

- Concept clarity
- Code understanding
- Debugging ability
- Backend reasoning

Do not rush.  
Try to explain answers in your own words wherever possible.

---

# Part 1 – Conceptual Questions (Short Answer)

### 1️⃣ What is the difference between Byte Streams and Character Streams?

Explain:
- When you would use each
- Give one real backend example

---

### 2️⃣ Why is `BufferedReader` preferred over `FileReader`?

What performance improvement does it provide?

---

### 3️⃣ What problem does try-with-resources solve?

What can happen if files are not properly closed?

---

### 4️⃣ What is serialization?

When would you use it in real systems?

---

### 5️⃣ What is a thread?

Why do backend applications need multiple threads?

---

### 6️⃣ Why is `Runnable` preferred over extending `Thread`?

Give two reasons.

---

### 7️⃣ What is a race condition?

Explain with an example.

---

### 8️⃣ What does the `synchronized` keyword do?

Does it improve performance or reduce it? Why?

---

### 9️⃣ What problem does `ExecutorService` solve?

Why is it preferred over manually creating threads?

---

### 🔟 What happens if you call `run()` instead of `start()`?

Explain clearly.

---

# Part 2 – Code Understanding

---

## 1️⃣ Predict the Output

```java
Thread t = new Thread(() -> {
    System.out.println("Inside thread");
});

t.run();
System.out.println("Main method");
````

What will be the output?
Will it create a new thread?

---

## 2️⃣ Predict the Result

```java
class Counter {
    int count = 0;

    void increment() {
        count++;
    }
}

Counter counter = new Counter();

Thread t1 = new Thread(() -> {
    for(int i = 0; i < 1000; i++) {
        counter.increment();
    }
});

Thread t2 = new Thread(() -> {
    for(int i = 0; i < 1000; i++) {
        counter.increment();
    }
});

t1.start();
t2.start();

System.out.println(counter.count);
```

What are the possible outputs?

Why?

---

## 3️⃣ Identify the Problem

```java
FileWriter writer = new FileWriter("data.txt");
writer.write("Hello");
```

What is wrong with this code?

What issue might occur?

---

## 4️⃣ Fix the Code

```java
class Task implements Runnable {
    public void run() {
        System.out.println("Task running");
    }
}

Task task = new Task();
task.run();
```

Is this multithreading?
If not, fix it.

---

# Part 3 – Debugging Scenario

---

## Scenario 1

Your application writes logs to a file.

After running for several hours, the application crashes with:

```
Too many open files
```

What is the most likely cause?

How would you fix it?

---

## Scenario 2

A shared counter sometimes gives correct results,
sometimes gives smaller numbers than expected.

What is the most likely reason?

How would you fix it?

---

# Part 4 – Backend Thinking

---

### 1️⃣ In a Spring Boot application:

* Does each HTTP request run on a separate thread?
* Why is thread safety important in controllers and services?

---

### 2️⃣ Why should shared mutable state be avoided in backend applications?

What is a safer alternative?

---

### 3️⃣ When would using multithreading be unnecessary?

Give one example.

---

# Bonus Challenge (Optional)

Write a small program that:

* Creates 5 threads
* Each thread prints its name
* Use ExecutorService instead of manually creating threads

---

# Self-Evaluation

After completing this quiz, ask yourself:

* Can I clearly explain race conditions?
* Do I understand how threads execute?
* Do I know how to prevent file resource leaks?
* Can I predict multithreading behavior?

If not, revisit the study material before moving to exercises.

---

⚠️ Important:

Do not move to the assignment until:

* All conceptual questions are clear
* You can explain thread safety confidently
* You understand why synchronization is needed

