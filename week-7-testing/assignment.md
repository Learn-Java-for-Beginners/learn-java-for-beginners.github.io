---
layout: default
title: Assignment
parent: Week 7 - Testing, Logging and Validation
nav_order: 3
---

# Assignment

# 📘 Objective

The objective of this assignment is to help the learner gain hands-on experience with:

* Unit testing
* Validation
* Exception handling
* Logging
* Debugging
* Backend reliability practices

The learner will enhance an existing Spring Boot application by implementing testing and production-quality engineering practices.

---

# 🎯 Assignment Overview

In this assignment, the learner will improve a Spring Boot REST API application by:

* Adding unit tests
* Implementing validation
* Handling exceptions globally
* Adding logging
* Debugging intentionally broken scenarios

The assignment focuses on developing production-grade backend engineering skills.

---

# 🏗 Project Scenario

You are developing a backend application for managing users in a small organization.

The application currently supports:

* Creating users
* Fetching users
* Updating users
* Deleting users

However, the application lacks:

* Automated testing
* Proper validation
* Centralized exception handling
* Structured logging

Your task is to improve the application quality.

---

# 📂 Suggested Project Structure

```text id="xytyf5"
src/
 ├── main/
 │    ├── controller/
 │    ├── service/
 │    ├── repository/
 │    ├── entity/
 │    ├── dto/
 │    └── exception/
 │
 └── test/
      ├── controller/
      ├── service/
      └── repository/
```

---

# 📋 Assignment Tasks

# Task 1 - Add Validation

## Objective

Ensure invalid requests are rejected before business processing.

---

## Requirements

Create a DTO class with validation annotations.

Example validations:

| Field | Validation             |
| ----- | ---------------------- |
| name  | Cannot be blank        |
| email | Must be valid          |
| age   | Must be greater than 0 |

---

## Example DTO

```java id="0n0v6e"
public class UserRequest {

    @NotBlank
    private String name;

    @Email
    private String email;

    @Min(1)
    private int age;
}
```

---

## Deliverables

* Add validation annotations
* Use `@Valid` in controller
* Ensure invalid requests fail properly

---

# Task 2 - Global Exception Handling

## Objective

Handle application exceptions consistently.

---

## Requirements

Create a global exception handler using:

```java id="x5kh6k"
@ControllerAdvice
```

Handle:

* Validation exceptions
* Resource not found exceptions
* Generic exceptions

---

## Expected Behavior

The API should return:

* Proper HTTP status codes
* Meaningful error messages
* Consistent error response structure

---

# Task 3 - Add Logging

## Objective

Improve application observability using logs.

---

## Requirements

Add logging to:

* User creation
* User deletion
* Validation failures
* Exception handling
* Service layer operations

---

## Example

```java id="h8u4kr"
logger.info("Creating user with email: {}", request.getEmail());
```

---

## Important Notes

Do NOT:

* Use `System.out.println()`
* Log passwords or sensitive information
* Over-log unnecessary details

---

# Task 4 - Write Unit Tests

## Objective

Write automated tests for service methods.

---

## Requirements

Write tests for:

* Successful user creation
* Invalid user creation
* User lookup
* User deletion
* Exception scenarios

---

## Suggested Technologies

* JUnit 5
* Mockito

---

## Example Test

```java id="2sn8e0"
@Test
void shouldCreateUserSuccessfully() {

    User savedUser = service.create(request);

    assertNotNull(savedUser);
}
```

---

# Task 5 - Mock Repository Layer

## Objective

Use Mockito to isolate service layer testing.

---

## Requirements

Mock:

* Repository dependencies
* External service dependencies if present

---

## Example

```java id="8t9mq2"
when(repository.findById(1L))
    .thenReturn(Optional.of(user));
```

---

# Task 6 - Debugging Exercise

## Objective

Develop debugging and troubleshooting skills.

---

## Scenario

The mentor will intentionally introduce:

* Null pointer issues
* Incorrect validations
* Logical bugs
* Broken test cases

The learner should:

* Identify the issue
* Explain root cause
* Fix the issue
* Verify correctness

---

# 📌 Technical Requirements

## Mandatory Requirements

The solution must:

✅ Use Spring Boot
✅ Use JUnit 5
✅ Use Mockito
✅ Use SLF4J logging
✅ Use Bean Validation
✅ Follow clean coding practices

---

# 📏 Code Quality Guidelines

## Naming Standards

Use:

* Meaningful method names
* Descriptive variable names
* Clear class names

---

## Method Design

Methods should:

* Be small
* Have single responsibility
* Avoid duplication

---

## Exception Handling

Exceptions should:

* Be meaningful
* Provide useful messages
* Avoid exposing internal details

---

# 🧪 Testing Expectations

Tests should include:

| Type            | Example       |
| --------------- | ------------- |
| Positive Tests  | Valid request |
| Negative Tests  | Invalid input |
| Boundary Tests  | Empty strings |
| Exception Tests | Missing data  |

---

# 📊 Evaluation Criteria

| Category                  | Marks |
| ------------------------- | ----- |
| Validation Implementation | 20    |
| Exception Handling        | 20    |
| Logging Practices         | 15    |
| Unit Testing              | 30    |
| Debugging Skills          | 15    |

---

# 🧠 Engineering Mindset Expectations

While implementing the assignment, always think:

* What happens if input is invalid?
* How will this be debugged later?
* Is this code testable?
* Can another developer understand this easily?
* Are edge cases handled properly?

This mindset is essential for professional backend engineering.

---

# 📦 Submission Requirements

The learner should submit:

* Source code
* Test classes
* Screenshots of successful test execution
* API testing evidence
* README explaining implementation

---

# 🏁 Expected Outcome

By completing this assignment, the learner should be able to:

✅ Write basic unit tests
✅ Validate REST API requests
✅ Handle backend exceptions properly
✅ Add meaningful application logs
✅ Debug common backend issues
✅ Improve backend application quality

---

# 📚 Bonus Challenges (Optional)

Advanced learners may additionally implement:

* Custom validation annotations
* Structured JSON logging
* Test coverage reporting
* Integration tests
* Parameterized tests

---

# 💡 Mentor Notes

The goal of this assignment is not perfection.

The goal is to:

* Build confidence
* Encourage experimentation
* Develop debugging skills
* Learn production-quality backend practices

Mistakes are expected and encouraged during learning.

---

© 2026 Aditya Pratap Bhuyan
Licensed under GPL-3.0
Maintained for backend engineering mentorship and learning.
