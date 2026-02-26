---
layout: default
title: Week 3 - IO & Threads
parent: Weekly Curriculum
nav_order: 3
has_children: true
---

# Week 3 – File IO and Multithreading

## 🎯 Learning Objectives

By the end of this week, you should be able to:

- Understand Java File IO architecture
- Read and write data using different IO classes
- Use BufferedReader and BufferedWriter efficiently
- Understand serialization and object persistence
- Explain what a thread is and why it is needed
- Create threads using Thread and Runnable
- Understand synchronization basics
- Use ExecutorService for thread management
- Identify race conditions and concurrency problems

---

# Part 1 – Understanding File IO in Java

## 1️⃣ Why File IO?

So far, your programs store data in memory.

But what happens when:
- The application restarts?
- The JVM crashes?
- The system shuts down?

All in-memory data is lost.

File IO allows:
- Persistent storage
- Log writing
- Data import/export
- Configuration management

Backend systems heavily depend on file handling for:
- Logs
- Temporary data
- Batch processing
- Configuration files

---

## 2️⃣ Java IO Architecture Overview

Java IO is mainly divided into:

### Byte Streams
Used for binary data:
- Images
- PDFs
- Audio
- Serialized objects

Main classes:
- `FileInputStream`
- `FileOutputStream`

---

### Character Streams
Used for text data:

- `FileReader`
- `FileWriter`
- `BufferedReader`
- `BufferedWriter`

Character streams are preferred for:
- Reading text files
- Logs
- CSV files

---

# 3️⃣ Reading Files in Java

### Using FileReader (Basic)

```java
FileReader reader = new FileReader("data.txt");
int character;

while ((character = reader.read()) != -1) {
    System.out.print((char) character);
}
reader.close();
````

⚠️ Problem:

* Reads one character at a time.
* Inefficient for large files.

---

## 4️⃣ Using BufferedReader (Recommended)

```java
BufferedReader br = new BufferedReader(new FileReader("data.txt"));
String line;

while ((line = br.readLine()) != null) {
    System.out.println(line);
}
br.close();
```

Advantages:

* Faster
* Reads line by line
* More practical for backend systems

---

# 5️⃣ Writing Files

### Using FileWriter

```java
FileWriter writer = new FileWriter("output.txt");
writer.write("Hello Backend World");
writer.close();
```

### Using BufferedWriter

```java
BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
bw.write("Hello Backend World");
bw.newLine();
bw.close();
```

BufferedWriter is preferred for performance.

---

# 6️⃣ Try-With-Resources (Important)

Always close resources.

Modern Java:

```java
try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
    String line;
    while ((line = br.readLine()) != null) {
        System.out.println(line);
    }
}
```

This prevents memory leaks.

---

# 7️⃣ Serialization

Serialization converts an object into byte stream.

Used when:

* Saving object state
* Sending over network
* Caching

Example:

```java
class Student implements Serializable {
    private String name;
    private int age;
}
```

Writing object:

```java
ObjectOutputStream out = new ObjectOutputStream(
    new FileOutputStream("student.ser")
);
out.writeObject(student);
out.close();
```

Reading object:

```java
ObjectInputStream in = new ObjectInputStream(
    new FileInputStream("student.ser")
);
Student s = (Student) in.readObject();
in.close();
```

Important:

* Class must implement `Serializable`
* serialVersionUID recommended

---

# Part 2 – Multithreading

---

# 8️⃣ What is a Thread?

A thread is a lightweight unit of execution.

Every Java program has at least one thread:

* Main Thread

Multithreading allows:

* Parallel execution
* Better CPU utilization
* Faster processing

Backend examples:

* Handling multiple user requests
* Async logging
* Background tasks

---

# 9️⃣ Creating Threads

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

Why Runnable is preferred:

* Java does not support multiple inheritance
* More flexible design

---

# 🔟 Thread Lifecycle

States:

* NEW
* RUNNABLE
* BLOCKED
* WAITING
* TERMINATED

Important:
Calling `run()` directly does NOT create a new thread.
Always call `start()`.

---

# 1️⃣1️⃣ Race Conditions

Occurs when:

* Multiple threads access shared resource
* At least one modifies it
* No synchronization

Example:

```java
class Counter {
    int count = 0;

    void increment() {
        count++;
    }
}
```

Multiple threads → unpredictable result.

---

# 1️⃣2️⃣ Synchronization

To avoid race condition:

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

* Only one thread enters critical section

---

# 1️⃣3️⃣ ExecutorService (Modern Approach)

Instead of manually managing threads:

```java
ExecutorService executor = Executors.newFixedThreadPool(3);

executor.submit(() -> {
    System.out.println("Task running");
});

executor.shutdown();
```

Advantages:

* Better resource management
* Thread pooling
* Production ready

---

# 1️⃣4️⃣ When NOT to Use Threads

Avoid threads when:

* Task is trivial
* You don’t understand shared state
* You don’t need parallelism

Concurrency increases complexity.

---

# 🧠 Backend Engineering Perspective

In real backend systems:

* Spring Boot uses thread pools
* Web servers handle multiple requests via threads
* Logging frameworks are async
* Databases handle concurrent transactions

Understanding threads helps you:

* Avoid deadlocks
* Avoid performance bottlenecks
* Write thread-safe code

---

# 📝 Summary

This week you learned:

* File reading and writing
* Buffered streams
* Serialization
* Thread creation
* Runnable vs Thread
* Synchronization
* ExecutorService

You are now transitioning from:
"Java programmer"

to

"Backend engineer who understands execution model"

---

# ⚠️ Common Mistakes

* Forgetting to close files
* Calling run() instead of start()
* Ignoring synchronization
* Overusing threads
* Sharing mutable state without protection

---

# 📌 Before Moving to Exercises

Make sure you can answer:

1. Why is BufferedReader better than FileReader?
2. What happens if two threads increment a counter?
3. Why is Runnable preferred over extending Thread?
4. What problem does ExecutorService solve?
5. When should you use synchronization?

If you cannot answer clearly, revisit the sections above.


---
