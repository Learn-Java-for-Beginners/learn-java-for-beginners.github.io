---
layout: default
title: Study Material
parent: Week 3 - IO & Threads
nav_order: 1
---


# Week 3 – File IO and Multithreading

## 🎯 Learning Objectives

By the end of this week, you should be able to:

- Explain how Java handles file input and output
- Read and write files using modern Java practices
- Understand serialization and object persistence
- Explain what a thread is and why it is required
- Create and manage threads safely
- Identify race conditions
- Use synchronization correctly
- Understand thread pools using ExecutorService

---

# Part 1 – File IO in Java

---

## 1️⃣ Why Do We Need File IO?

Until now, your programs stored data in memory.

But memory is temporary.

When:
- The application stops
- The system crashes
- The JVM exits

All data is lost.

File IO allows:

- Persistent storage
- Logging
- Configuration management
- Batch processing
- Data exchange

In backend systems:
- Logs are written to files
- Configuration files are read during startup
- CSV imports are processed
- Temporary data is stored

Understanding IO is fundamental for backend development.

---

## 2️⃣ Java IO Architecture Overview

Java IO is divided into two major categories:

### A. Byte Streams

Used for binary data.

Examples:
- Images
- PDFs
- Audio files
- Serialized objects

Common classes:
- `FileInputStream`
- `FileOutputStream`

---

### B. Character Streams

Used for text data.

Examples:
- Log files
- CSV files
- Text configuration files

Common classes:
- `FileReader`
- `FileWriter`
- `BufferedReader`
- `BufferedWriter`

For backend systems, **character streams are most common**.

---

# 3️⃣ Reading Files in Java

---

## Basic FileReader Example

```java
FileReader reader = new FileReader("data.txt");
int ch;

while ((ch = reader.read()) != -1) {
    System.out.print((char) ch);
}

reader.close();
````

### Problem:

* Reads one character at a time
* Inefficient for large files
* Not ideal for production systems

---

## Recommended: BufferedReader

```java
BufferedReader br = new BufferedReader(new FileReader("data.txt"));
String line;

while ((line = br.readLine()) != null) {
    System.out.println(line);
}

br.close();
```

### Why BufferedReader?

* Reads line by line
* Faster
* Efficient for large files
* Cleaner code

---

# 4️⃣ Writing Files

---

## Using FileWriter

```java
FileWriter writer = new FileWriter("output.txt");
writer.write("Hello Backend Engineer");
writer.close();
```

---

## Using BufferedWriter (Recommended)

```java
BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
bw.write("Hello Backend Engineer");
bw.newLine();
bw.close();
```

BufferedWriter improves performance significantly.

---

# 5️⃣ Try-With-Resources (Modern Best Practice)

Manually closing files can lead to memory leaks.

Modern Java approach:

```java
try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
    String line;
    while ((line = br.readLine()) != null) {
        System.out.println(line);
    }
}
```

Why this is important:

* Automatically closes resource
* Prevents memory leaks
* Cleaner code
* Production-safe

Always prefer this approach.

---

# 6️⃣ Serialization

Serialization converts an object into a byte stream.

Used for:

* Saving object state
* Sending objects over network
* Caching
* Temporary persistence

---

## Making a Class Serializable

```java
import java.io.Serializable;

class Student implements Serializable {
    private String name;
    private int age;
}
```

---

## Writing Object to File

```java
ObjectOutputStream out = new ObjectOutputStream(
    new FileOutputStream("student.ser")
);

out.writeObject(student);
out.close();
```

---

## Reading Object from File

```java
ObjectInputStream in = new ObjectInputStream(
    new FileInputStream("student.ser")
);

Student s = (Student) in.readObject();
in.close();
```

---

### Important Notes

* Class must implement `Serializable`
* Use `serialVersionUID`
* Not recommended for long-term storage in modern systems
* Used mostly for caching or temporary persistence

In real backend systems, databases replace serialization.

---

# Part 2 – Multithreading

---

## 7️⃣ What is a Thread?

A thread is a lightweight unit of execution inside a process.

Every Java program has:

* One main thread

Multithreading allows:

* Parallel task execution
* Better CPU utilization
* Improved responsiveness

In backend systems:

* Each HTTP request is handled by a thread
* Logging can run in background
* Scheduled jobs run concurrently
* Database operations can be async

Understanding threads is critical for backend engineers.

---

# 8️⃣ Creating Threads

---

## Method 1 – Extending Thread

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running");
    }
}

MyThread t = new MyThread();
t.start();
```

---

## Method 2 – Implementing Runnable (Preferred)

```java
class MyTask implements Runnable {
    public void run() {
        System.out.println("Task running");
    }
}

Thread t = new Thread(new MyTask());
t.start();
```

### Why Runnable is Better?

* Java does not allow multiple inheritance
* More flexible
* Cleaner architecture
* Industry standard approach

---

# 9️⃣ Thread Lifecycle

A thread moves through these states:

* NEW
* RUNNABLE
* BLOCKED
* WAITING
* TERMINATED

Important:

Calling `run()` does NOT start a new thread.

You must call:

```java
t.start();
```

---

# 🔟 Race Condition

A race condition happens when:

* Two or more threads access shared data
* At least one modifies it
* No synchronization is applied

Example:

```java
class Counter {
    int count = 0;

    void increment() {
        count++;
    }
}
```

If two threads call increment simultaneously:

* Result becomes unpredictable

---

# 1️⃣1️⃣ Synchronization

To prevent race conditions:

```java
synchronized void increment() {
    count++;
}
```

Or:

```java
synchronized(this) {
    count++;
}
```

Synchronization ensures:

* Only one thread executes critical section
* Shared data remains consistent

But:

* Overuse reduces performance
* Must be applied carefully

---

# 1️⃣2️⃣ ExecutorService (Modern Thread Management)

Instead of manually creating threads:

```java
ExecutorService executor = Executors.newFixedThreadPool(3);

executor.submit(() -> {
    System.out.println("Task running");
});

executor.shutdown();
```

Advantages:

* Thread pooling
* Resource control
* Production ready
* Used internally in web servers

Spring Boot uses thread pools internally.

---

# 1️⃣3️⃣ When Not to Use Threads

Avoid threads when:

* Task is very small
* No shared state exists
* Complexity is unnecessary

Concurrency increases code complexity.

---

# 🧠 Backend Engineering Perspective

As a backend engineer, you must understand:

* How servers handle multiple users
* Why thread safety matters
* Why shared state is dangerous
* Why immutable objects are safer
* Why proper synchronization prevents production bugs

Many production bugs happen because of poor concurrency handling.

---

# 📝 Summary

This week you learned:

* File IO basics
* Buffered streams
* Serialization
* Thread creation
* Runnable vs Thread
* Race conditions
* Synchronization
* ExecutorService

This is where you begin to understand:

How your backend actually runs under the hood.

---

# 📌 Self-Check Questions

Before moving to exercises, ensure you can answer:

1. Why is BufferedReader preferred over FileReader?
2. What happens if multiple threads increment a shared variable?
3. Why should we prefer Runnable over extending Thread?
4. What problem does ExecutorService solve?
5. What is a race condition?
6. Why is synchronization important?

If you cannot explain these clearly, revisit the sections above.


---
