---
layout: default
title: Exercises
parent: Week 7 - Testing, Logging and Validation
nav_order: 4
---

# Exercises

# 📘 Introduction

The exercises in this week are designed to strengthen practical understanding of:

* Unit testing
* Validation
* Logging
* Exception handling
* Debugging
* Backend reliability practices

The learner is encouraged to:

* Write code independently
* Experiment with different approaches
* Make mistakes and learn from them
* Focus on understanding rather than memorization

---

# Exercise 1 - Writing Your First Unit Test

## Objective

Write a basic unit test using JUnit 5.

---

## Problem Statement

Create a class named `Calculator` with the following methods:

```java id="r9v7he"
public int add(int a, int b)
public int subtract(int a, int b)
```

Write unit tests for:

* Addition
* Subtraction

---

## Expected Concepts

* `@Test`
* Assertions
* Test class structure

---

# Exercise 2 - Testing Edge Cases

## Objective

Learn how to test edge cases and unexpected inputs.

---

## Problem Statement

Create a method:

```java id="jqabgj"
public int divide(int a, int b)
```

Requirements:

* Throw `IllegalArgumentException` if divisor is zero

Write tests for:

* Valid division
* Division by zero

---

## Expected Concepts

* `assertThrows`
* Negative testing
* Exception testing

---

# Exercise 3 - String Validation Utility

## Objective

Understand validation logic.

---

## Problem Statement

Create a utility method:

```java id="jlwm06"
public boolean isValidName(String name)
```

Validation Rules:

* Cannot be null
* Cannot be blank
* Minimum length should be 3

Write unit tests for:

* Valid names
* Null values
* Blank values
* Short names

---

## Expected Concepts

* Boundary testing
* Validation logic
* Positive and negative scenarios

---

# Exercise 4 - Spring Boot DTO Validation

## Objective

Use Bean Validation annotations.

---

## Problem Statement

Create a DTO class:

```java id="mvhv3w"
public class EmployeeRequest
```

Fields:

* name
* email
* age

Requirements:

* Name cannot be blank
* Email must be valid
* Age must be greater than 18

---

## Tasks

Add:

* `@NotBlank`
* `@Email`
* `@Min`

annotations appropriately.

---

## Expected Concepts

* Bean Validation
* Request validation
* Data integrity

---

# Exercise 5 - Controller Validation

## Objective

Validate incoming REST API requests.

---

## Problem Statement

Create a REST API endpoint:

```java id="vlmjlwm"
POST /employees
```

Requirements:

* Use `@Valid`
* Reject invalid requests
* Return proper HTTP status codes

---

## Expected Concepts

* `@Valid`
* REST API validation
* Spring Boot request handling

---

# Exercise 6 - Global Exception Handling

## Objective

Handle exceptions centrally.

---

## Problem Statement

Create a global exception handler using:

```java id="i9uhne"
@ControllerAdvice
```

Handle:

* Validation failures
* Resource not found exceptions
* Generic exceptions

---

## Expected Concepts

* Centralized exception handling
* Consistent API responses
* Error management

---

# Exercise 7 - Logging Basics

## Objective

Learn structured logging.

---

## Problem Statement

Add logging to a service class.

Log:

* Method start
* Successful operation
* Failure scenarios

---

## Example

```java id="vtj0e4"
logger.info("Creating employee with email: {}", email);
```

---

## Expected Concepts

* SLF4J
* Log levels
* Meaningful logging

---

# Exercise 8 - Debugging NullPointerException

## Objective

Practice debugging runtime issues.

---

## Problem Statement

Analyze the following code:

```java id="u8hjlwm"
public void printLength(String value) {
    System.out.println(value.length());
}
```

Tasks:

* Identify possible issue
* Explain why it happens
* Fix the implementation
* Write unit tests

---

## Expected Concepts

* Null handling
* Defensive programming
* Debugging

---

# Exercise 9 - Mockito Mocking

## Objective

Understand mocking basics.

---

## Problem Statement

Suppose:

```java id="rkqfr5"
UserService -> UserRepository
```

Write unit tests for `UserService` using Mockito.

Mock:

* Repository behavior
* Database responses

---

## Expected Concepts

* Mocking
* Isolation testing
* Mockito basics

---

# Exercise 10 - Read and Analyze Stack Trace

## Objective

Develop debugging confidence.

---

## Problem Statement

Analyze the following stack trace:

```text id="plwzfw"
java.lang.NullPointerException
    at com.example.service.UserService.create(UserService.java:42)
```

Tasks:

* Identify probable issue
* Explain root cause
* Suggest fixes

---

## Expected Concepts

* Stack trace reading
* Runtime troubleshooting
* Error analysis

---

# Exercise 11 - Test Invalid API Payload

## Objective

Understand API validation behavior.

---

## Problem Statement

Send invalid requests using:

* Empty name
* Invalid email
* Negative age

Verify:

* Validation errors
* HTTP status codes
* Error messages

---

## Expected Concepts

* API testing
* Validation behavior
* Error handling

---

# Exercise 12 - Improve Logging Strategy

## Objective

Understand logging best practices.

---

## Problem Statement

Review an application containing excessive logs.

Tasks:

* Identify unnecessary logs
* Improve log messages
* Assign proper log levels

---

## Expected Concepts

* Observability
* Clean logging
* Log optimization

---

# 🧠 Engineering Reflection Questions

Answer the following questions after completing the exercises.

1. Why are automated tests important?
2. Why should APIs validate input?
3. Why are logs useful in production systems?
4. What makes debugging difficult?
5. Why is testing mindset important for developers?

---

# 📋 Submission Guidelines

The learner should submit:

* Source code
* Test classes
* Screenshots of successful test execution
* API validation screenshots
* Notes explaining debugging observations

---

# 🏁 Expected Learning Outcome

After completing these exercises, the learner should be able to:

✅ Write basic unit tests
✅ Handle validation properly
✅ Add structured logs
✅ Debug runtime issues
✅ Understand backend reliability practices
✅ Think critically about edge cases

---

# 💡 Mentor Notes

The exercises are intentionally progressive.

Early exercises focus on:

* Simple unit testing
* Basic validation

Later exercises focus on:

* Real-world backend reliability
* Debugging
* Error handling
* Production engineering mindset

The learner is encouraged to ask questions and experiment freely.

---

© 2026 Aditya Pratap Bhuyan
Licensed under GPL-3.0
Maintained for backend engineering mentorship and learning.
