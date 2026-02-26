---
layout: default
title: Exercises
parent: Week 3 - IO & Threads
nav_order: 2
---

# Week 3 – Exercises  
## File IO and Multithreading Practice

These exercises are designed to:

- Strengthen your understanding of File IO
- Help you practice safe resource handling
- Introduce multithreading gradually
- Build debugging confidence
- Prepare you for the assignment

Complete them in order.

---

# 🟢 Part 1 – File IO Basics

---

## Exercise 1 – Read a Text File

Create a program that:

- Reads a file named `input.txt`
- Prints each line to the console
- Uses `BufferedReader`
- Uses try-with-resources

Edge Cases:
- What happens if file does not exist?
- Handle exception properly.

---

## Exercise 2 – Write to a File

Write a program that:

- Creates a file named `output.txt`
- Writes 5 lines of text
- Uses `BufferedWriter`
- Uses try-with-resources

Verify:
- File is created
- Content is correct

---

## Exercise 3 – Append Mode

Modify Exercise 2 so that:

- Instead of overwriting,
- It appends new content to the existing file.

Hint:
Use the correct constructor of `FileWriter`.

---

## Exercise 4 – Count Words in File

Create a program that:

- Reads a text file
- Counts total number of words
- Prints total count

Think carefully:
- How will you split words?
- How will you handle empty lines?

---

# 🟡 Part 2 – Object Serialization

---

## Exercise 5 – Serialize a Simple Object

Create a `Student` class:

- id
- name
- age

Make it:

- Implement `Serializable`

Write code to:

- Save object to file `student.ser`
- Read it back
- Print the object

---

## Exercise 6 – Serialize a List

Create:

- A `List<Student>`
- Add 3 students
- Serialize entire list
- Deserialize and print

Reflect:
- What happens if you modify the class later?

---

# 🟠 Part 3 – Thread Basics

---

## Exercise 7 – Create a Thread Using Thread Class

Create a class:

- Extend `Thread`
- Print numbers 1 to 5
- Sleep for 1 second between prints

Observe:
- What happens if you call `run()` instead of `start()`?

---

## Exercise 8 – Create a Thread Using Runnable

Create:

- A class implementing `Runnable`
- Print current thread name
- Run it using `Thread`

Print:

```java
Thread.currentThread().getName();
````

Observe how names differ.

---

## Exercise 9 – Multiple Threads

Create:

* 3 threads
* Each prints numbers from 1 to 5

Observe:

* Are outputs ordered?
* Why not?

---

# 🔴 Part 4 – Race Condition Practice

---

## Exercise 10 – Shared Counter (Unsafe Version)

Create:

```java
class Counter {
    int count = 0;

    void increment() {
        count++;
    }
}
```

Create:

* 2 threads
* Each increments 1000 times

Print final count.

Run multiple times.

Question:

* Is result always 2000?
* Why not?

---

## Exercise 11 – Fix the Race Condition

Modify previous exercise:

* Add synchronization
* Make final result consistently correct

Explain:

* What changed?
* Why does it work now?

---

# 🔵 Part 5 – ExecutorService

---

## Exercise 12 – Fixed Thread Pool

Create:

* ExecutorService with 2 threads
* Submit 5 tasks
* Each task prints thread name

Observe:

* How many threads are created?
* Are threads reused?

---

## Exercise 13 – Shutdown Executor

Modify Exercise 12:

* Properly shutdown executor
* Ensure no memory leaks

Research:

* What happens if you forget shutdown?

---

# 🟣 Part 6 – Backend Thinking Exercises

---

## Exercise 14 – Simulate Concurrent Add Operation

Create a simple in-memory list.

Create:

* 5 threads
* Each adds 50 elements

Check:

* Final list size
* Is it always correct?

If not:

* Why?
* How would you fix it?

---

## Exercise 15 – Logging with Threads

Create 3 threads.

Each thread:

* Prints:

  * Thread name
  * Timestamp
  * Action performed

Example format:

```
[Thread-1] 10:32:12 - Adding record
```

This builds real backend observability thinking.

---

# 🧠 Reflection Questions

After completing exercises, answer:

1. Why are file resources dangerous if not closed?
2. Why is shared mutable state risky?
3. Why is concurrency harder to debug?
4. Why do production systems use thread pools?

---

# ⏱ Suggested Time

* IO Exercises: 2–3 hours
* Thread Exercises: 3–4 hours
* Reflection & Debugging: 1 hour

Do not rush.

---

# ✅ Before Moving to Assignment

Make sure:

☐ You understand race condition clearly
☐ You can fix synchronization issue confidently
☐ You can use ExecutorService properly
☐ You always use try-with-resources
☐ You understand why concurrency increases complexity

If you are unsure, revisit study material before proceeding.

---

These exercises are foundational.

Mastering them means you are beginning to think like a backend engineer.

