---
layout: default
title: Quiz
parent: Week 2 - Collections & Exceptions
nav_order: 3
---

# 🧩 Week 2 – Assignment

## Student Management System (Collections + Exceptions Integration)

---

# 🎯 Objective

Enhance your existing **Student Management System** (created in Week 1) by:

* Using appropriate Collections
* Preventing duplicates
* Using Map for efficient lookup
* Applying Streams for filtering
* Implementing custom exceptions
* Handling errors properly

This assignment simulates real backend service-layer logic.

---

# 📌 Problem Statement

You are building a basic in-memory backend system for managing students.

You must design a `StudentService` class that performs operations on students using proper data structures and exception handling.

---

# 🏗 Requirements

---

## 1️⃣ Student Class

Create a `Student` class with:

* `int id`
* `String name`
* `int marks`

### Constraints:

* `id` must be unique
* `marks` must be between 0 and 100

---

## 2️⃣ Data Storage Strategy (Important)

Inside `StudentService`, use:

* `List<Student>` → to store all students
* `Map<Integer, Student>` → for fast lookup by id
* `Set<Integer>` → to ensure unique IDs

⚠️ You must justify in comments why you are using each collection.

---

# 🧠 Functional Requirements

---

## 1️⃣ Add Student

Method:

```java
addStudent(Student student)
```

### Rules:

* If ID already exists → throw `DuplicateStudentException`
* If marks < 0 or > 100 → throw `InvalidMarksException`
* Otherwise:

  * Add to List
  * Add ID to Set
  * Add to Map

---

## 2️⃣ Get Student by ID

Method:

```java
getStudentById(int id)
```

### Rules:

* If student not found → throw `StudentNotFoundException`

---

## 3️⃣ Remove Student

Method:

```java
removeStudent(int id)
```

### Rules:

* If not found → throw exception
* Remove from:

  * List
  * Map
  * Set

---

## 4️⃣ Get All Students

Return all students as List.

---

## 5️⃣ Get Top Scorers

Method:

```java
getTopScorers(int threshold)
```

### Requirements:

* Use Stream API
* Return students with marks > threshold
* Sort descending by marks

---

## 6️⃣ Get Average Marks

Method:

```java
getAverageMarks()
```

Use Streams.

If no students exist:

* Throw custom exception OR return 0 (justify decision).

---

# 🚨 Custom Exceptions (Mandatory)

Create:

* `DuplicateStudentException`
* `StudentNotFoundException`
* `InvalidMarksException`

All should extend `RuntimeException`.

Each must:

* Accept meaningful message
* Be used appropriately

---

# 🔎 Exception Handling

In your `main()` method:

* Wrap calls inside try-catch
* Print meaningful error messages
* Do NOT swallow exceptions silently

Example pattern:

```java
try {
    service.addStudent(student);
} catch (DuplicateStudentException e) {
    System.out.println(e.getMessage());
}
```

---

# 📊 Edge Case Handling

You must handle:

* Adding duplicate ID
* Removing non-existing student
* Getting student from empty list
* Filtering when no students match
* Null student input (optional advanced)

---

# 🧪 Manual Testing Required

In `main()`:

1. Add 5 students
2. Attempt duplicate insert
3. Attempt invalid marks
4. Retrieve existing student
5. Retrieve non-existing student
6. Print top scorers
7. Remove student
8. Print final list

Document your test scenarios in comments.

---

# 🏆 Evaluation Criteria

| Criteria                  | Weight |
| ------------------------- | ------ |
| Correct collection usage  | 20%    |
| Proper exception handling | 20%    |
| Stream usage              | 15%    |
| Clean code structure      | 15%    |
| Edge case handling        | 15%    |
| Code readability          | 15%    |

---

# 📁 Expected Structure

```
Student.java
StudentService.java
DuplicateStudentException.java
InvalidMarksException.java
StudentNotFoundException.java
Main.java
```

---

# 🧠 Design Thinking Questions (To Be Answered in Comments)

Answer these in comments inside your code:

1. Why use Map in addition to List?
2. Why not use only List?
3. Why is Set used?
4. Why are custom exceptions better than returning null?
5. Why use Stream instead of loop for filtering?

---

# 🚀 Bonus (Optional)

If you want to go further:

* Use `Optional<Student>` in some method
* Add logging instead of System.out
* Write a basic unit test
* Make Student immutable
* Use `Comparator` separately

---

# 🎯 Learning Outcome

After completing this assignment, you should be able to:

✔ Choose correct collection types
✔ Understand hashing behavior
✔ Design service-layer logic
✔ Throw meaningful domain exceptions
✔ Use Streams in real scenario
✔ Think like backend engineer

---

# 🔥 Mentor Note (For Review Session)

During review, you should be able to:

* Explain your data structure choices
* Explain exception design
* Walk through one method confidently
* Handle edge case questions

This assignment is not about syntax.
It is about backend reasoning.

---
