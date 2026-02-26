---
layout: default
title: Examples & Solutions
parent: Week 3 - IO & Threads
nav_order: 6
---

# Week 3 – Examples & Solutions  
## File IO and Multithreading

This page contains:

1. Practical examples (for learning)
2. Solutions to exercises (for verification after attempt)

⚠️ Do not read the Solutions section before attempting exercises.

---

# ============================
# SECTION 1 – EXAMPLES
# ============================

# 🟢 Example 1 – Reading a File Line by Line

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
````

Key Learning:

* Uses try-with-resources
* Prevents memory leaks
* Handles exceptions properly

---

# 🟢 Example 2 – Writing to a File

```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {

    public static void main(String[] args) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {

            bw.write("Hello Backend Engineer");
            bw.newLine();
            bw.write("Learning IO in Java");

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
```

---

# 🟢 Example 3 – Simple Thread Creation

```java
public class ThreadExample {

    public static void main(String[] args) {

        Thread t = new Thread(() -> {
            System.out.println("Thread Name: " + Thread.currentThread().getName());
        });

        t.start();
    }
}
```

Important:

* `start()` creates a new thread
* `run()` does not

---

# 🟢 Example 4 – Race Condition Demonstration

```java
class Counter {
    int count = 0;

    void increment() {
        count++;
    }
}

public class RaceConditionExample {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + counter.count);
    }
}
```

Run multiple times.
Result may not always be 2000.

---

# 🟢 Example 5 – Fixing Race Condition

```java
class SafeCounter {
    int count = 0;

    synchronized void increment() {
        count++;
    }
}
```

Synchronization ensures:

* Only one thread enters critical section at a time.

---

# 🟢 Example 6 – Using ExecutorService

```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) {
            executor.submit(() -> {
                System.out.println("Running in: " + Thread.currentThread().getName());
            });
        }

        executor.shutdown();
    }
}
```

Key Concept:

* Threads are reused
* Better resource control

---

# ============================

# SECTION 2 – SOLUTIONS

# ============================

# 🔵 Solution 1 – Word Count Exercise

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountSolution {

    public static void main(String[] args) {

        int wordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            System.out.println("Total words: " + wordCount);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```

---

# 🔵 Solution 2 – Serialization Exercise

```java
import java.io.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializationSolution {

    public static void main(String[] args) throws Exception {

        Student student = new Student(1, "Aditya");

        // Write object
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("student.ser"))) {

            out.writeObject(student);
        }

        // Read object
        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("student.ser"))) {

            Student s = (Student) in.readObject();
            System.out.println("Student Name: " + s.name);
        }
    }
}
```

---

# 🔵 Solution 3 – Fixed Counter with Synchronization

```java
class SafeCounter {
    int count = 0;

    synchronized void increment() {
        count++;
    }
}
```

Full Execution:

```java
SafeCounter counter = new SafeCounter();

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

t1.join();
t2.join();

System.out.println(counter.count);
```

Result:
Always 2000.

---

# 🔵 Solution 4 – ExecutorService Proper Shutdown

```java
ExecutorService executor = Executors.newFixedThreadPool(2);

executor.submit(() -> {
    System.out.println("Task executed");
});

executor.shutdown();
```

If shutdown is not called:

* Threads remain alive
* JVM may not terminate properly

---

# 🔎 Engineering Reflection

After reviewing solutions:

Ask yourself:

* Why was the counter inconsistent?
* What exactly does synchronized protect?
* Why are thread pools more efficient?
* Why is try-with-resources mandatory in production systems?

---

Do not just copy these solutions.

Understand:

* Why it works
* What problem it solves
* What happens if removed


