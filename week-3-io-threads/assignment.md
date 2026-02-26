---
layout: default
title: Assignment
parent: Week 3 - IO & Threads
nav_order: 4
---

# Week 3 – Assignment  
## File Persistence & Concurrent Processing

This assignment combines:

- File IO
- Serialization
- Multithreading
- Synchronization
- Backend thinking

You will extend your existing project (Student Management / Expense Tracker / Library System – whichever you are building).

---

# 🎯 Assignment Objective

Build a system that:

1. Persists data to a file
2. Loads data on application startup
3. Handles concurrent operations safely
4. Avoids race conditions
5. Uses ExecutorService for background processing

---

# Part 1 – File Persistence

---

## Requirement 1: Save Data to File

Modify your existing service so that:

- Every time a new record is added,
- The updated list is saved to a file.

### Rules:

- Use `BufferedWriter`
- Use try-with-resources
- Store data in readable format (CSV or plain text)

Example format:

```

1,Aditya,25
2,Riya,23
3,Aman,28

````

---

## Requirement 2: Load Data on Startup

When the application starts:

- It should check if the file exists
- If it exists → load records into memory
- If not → start with empty list

Use:

- `BufferedReader`
- Proper exception handling

---

## Requirement 3: Handle Invalid Data

If file contains corrupted data:

- Skip invalid line
- Log an error message
- Continue processing

Backend systems must be fault-tolerant.

---

# Part 2 – Object Serialization (Advanced Section)

Instead of plain text:

- Save the entire list using serialization
- Use `ObjectOutputStream`
- Load using `ObjectInputStream`

Make sure:

- Model class implements `Serializable`
- Add `serialVersionUID`

After implementing both methods:

Answer:

- Which approach is more readable?
- Which approach is easier to debug?
- Which is closer to real backend systems?

---

# Part 3 – Concurrent Processing

---

## Requirement 4: Simulate Concurrent Requests

Simulate 5 threads adding records simultaneously.

Example scenario:

- 5 threads
- Each thread adds 100 records
- Final count should be correct

---

## Requirement 5: Fix Race Condition

If final count is inconsistent:

- Identify the problem
- Fix it using synchronization

You may use:

- `synchronized` keyword
- Or synchronized block

Explain:

- Why the issue occurred
- How your solution fixed it

---

# Part 4 – ExecutorService Implementation

Instead of manually creating threads:

- Use `ExecutorService`
- Create fixed thread pool of size 3
- Submit tasks
- Shutdown executor properly

Use:

```java
Executors.newFixedThreadPool(3);
````

Make sure:

* No memory leaks
* Executor is properly shutdown

---

# Part 5 – Logging (Basic)

Whenever:

* A record is added
* A file is saved
* A thread starts execution

Print meaningful log messages.

Example:

```
[Thread-1] Adding record ID=101
[Thread-2] Saving file
```

This builds backend observability thinking.

---

# Deliverables

You must submit:

* Updated project code
* Demonstration of file being created
* Screenshot of concurrent execution
* Short explanation (in README) answering:

  1. What was the race condition?
  2. How did you fix it?
  3. Why is ExecutorService better?
  4. What happens if you remove synchronization?

---

# Evaluation Criteria

| Category                 | Marks |
| ------------------------ | ----- |
| File IO Implementation   | 20    |
| Proper Resource Handling | 10    |
| Serialization            | 10    |
| Concurrency Simulation   | 20    |
| Race Condition Fix       | 20    |
| Code Quality             | 10    |
| Explanation Clarity      | 10    |

Total: 100 Marks

---

# Bonus Challenge (Optional)

1. Use `AtomicInteger` instead of synchronized.
2. Add a background thread that autosaves data every 10 seconds.
3. Measure execution time with and without synchronization.

---

# Common Mistakes to Avoid

* Forgetting to close file resources
* Calling `run()` instead of `start()`
* Not waiting for threads to complete before printing final count
* Not shutting down ExecutorService
* Ignoring exceptions

---

# Backend Engineering Reflection

After completing this assignment, you should understand:

* Why file handling must be careful
* Why concurrency creates unpredictable bugs
* Why thread pools are used in production
* Why shared mutable state is dangerous

This assignment is important.

Many real production issues happen because developers do not understand:

* Resource management
* Concurrency
* Synchronization

Take your time. Test thoroughly.

---

# Before Submission Checklist

☐ File loads correctly on restart
☐ No resource leaks
☐ Concurrent count is accurate
☐ ExecutorService shuts down properly
☐ Code is clean and readable
☐ Proper exception handling implemented

---

When you complete this assignment, you are no longer just writing Java.

You are starting to think like a backend engineer.

