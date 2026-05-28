---
layout: default
title: Study Material
parent: Week 7 - Testing, Logging and Validation
nav_order: 1
---

# Study Material

# 📘 Introduction

In real-world backend engineering, writing code is only one part of the job.

Professional backend systems must also be:

* Reliable
* Maintainable
* Testable
* Observable
* Debuggable

This is where testing, validation, and logging become extremely important.

A backend engineer is responsible not only for implementing features, but also for ensuring that the application behaves correctly under different conditions.

This week focuses on building that engineering mindset.

---

# 1. Introduction to Testing

## What is Testing?

Testing is the process of verifying that software behaves as expected.

The goal of testing is to:

* Detect bugs early
* Prevent regressions
* Improve reliability
* Increase confidence during deployment
* Ensure correct business behavior

---

## Why Testing is Important

Imagine a banking application:

* Incorrect balance calculation could cause financial loss
* Invalid transactions could corrupt data
* A simple bug could impact thousands of users

Testing helps prevent such situations.

Good testing practices help developers:

* Refactor safely
* Release faster
* Reduce production defects
* Improve code quality

---

# Types of Testing

## 1. Manual Testing

Manual testing is performed by humans.

Examples:

* Clicking UI buttons
* Sending API requests manually
* Verifying outputs

Advantages:

* Good for exploratory testing
* Useful for UI validation

Disadvantages:

* Time-consuming
* Repetitive
* Error-prone

---

## 2. Automated Testing

Automated tests are written using code.

Advantages:

* Fast execution
* Repeatable
* Reliable
* Suitable for CI/CD pipelines

Examples:

* Unit tests
* Integration tests

---

# 2. Unit Testing

## What is Unit Testing?

Unit testing verifies individual units of code.

A unit may be:

* A method
* A class
* A service

The goal is to test small pieces independently.

---

## Example

```java
public int add(int a, int b) {
    return a + b;
}
```

Unit Test:

```java
@Test
void testAdd() {
    Calculator calculator = new Calculator();
    assertEquals(5, calculator.add(2, 3));
}
```

---

# Benefits of Unit Testing

* Detects issues early
* Simplifies debugging
* Encourages modular code
* Reduces fear during code changes

---

# Characteristics of Good Unit Tests

Good unit tests should be:

* Small
* Independent
* Repeatable
* Fast
* Easy to understand

---

# 3. Introduction to JUnit 5

## What is JUnit?

JUnit is the most commonly used testing framework in Java.

JUnit helps developers:

* Write automated tests
* Execute tests
* Validate expected behavior

---

# Common JUnit Annotations

| Annotation    | Purpose                    |
| ------------- | -------------------------- |
| `@Test`       | Marks a test method        |
| `@BeforeEach` | Runs before every test     |
| `@AfterEach`  | Runs after every test      |
| `@BeforeAll`  | Runs once before all tests |
| `@AfterAll`   | Runs once after all tests  |

---

# Example JUnit Test

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void shouldAddTwoNumbers() {
        Calculator calculator = new Calculator();

        int result = calculator.add(2, 3);

        assertEquals(5, result);
    }
}
```

---

# Assertions in JUnit

Assertions verify expected outcomes.

Common assertions:

| Assertion           | Purpose                |
| ------------------- | ---------------------- |
| `assertEquals()`    | Checks equality        |
| `assertNotEquals()` | Checks inequality      |
| `assertTrue()`      | Checks true condition  |
| `assertFalse()`     | Checks false condition |
| `assertNull()`      | Checks null            |
| `assertNotNull()`   | Checks non-null        |
| `assertThrows()`    | Verifies exceptions    |

---

# Example Exception Testing

```java
@Test
void shouldThrowExceptionForNullInput() {

    assertThrows(
        IllegalArgumentException.class,
        () -> service.process(null)
    );
}
```

---

# 4. Introduction to Mockito

## What is Mockito?

Mockito is a Java mocking framework.

Mocking helps isolate components during testing.

Instead of calling real dependencies, we simulate them.

---

# Why Mocking is Important

Suppose:

* Service depends on database
* Database is unavailable
* Tests become slow

Using mocks:

* Removes external dependency
* Makes tests faster
* Improves isolation

---

# Example Mockito Usage

```java
@Mock
private UserRepository repository;
```

```java
when(repository.findById(1L))
    .thenReturn(Optional.of(user));
```

---

# 5. Spring Boot Testing

Spring Boot provides excellent testing support.

We can test:

* Controllers
* Services
* Repositories

---

# Testing Service Layer

Example:

```java
@Service
public class UserService {

    public String getUserName() {
        return "Aditya";
    }
}
```

Test:

```java
@Test
void shouldReturnUserName() {

    UserService service = new UserService();

    assertEquals("Aditya", service.getUserName());
}
```

---

# Testing REST APIs

Spring Boot provides:

* MockMvc
* WebMvcTest
* SpringBootTest

These help test APIs without deploying the application.

---

# 6. Validation in Spring Boot

## What is Validation?

Validation ensures incoming data is correct before processing.

Examples:

* Name should not be blank
* Age should not be negative
* Email should follow valid format

---

# Bean Validation Annotations

| Annotation  | Purpose                |
| ----------- | ---------------------- |
| `@NotNull`  | Value cannot be null   |
| `@NotBlank` | String cannot be blank |
| `@Size`     | Restricts length       |
| `@Min`      | Minimum numeric value  |
| `@Max`      | Maximum numeric value  |
| `@Email`    | Validates email format |

---

# Example DTO Validation

```java
public class UserRequest {

    @NotBlank
    private String name;

    @Email
    private String email;
}
```

---

# Using @Valid

```java
@PostMapping
public ResponseEntity<?> createUser(
        @Valid @RequestBody UserRequest request) {

    return ResponseEntity.ok().build();
}
```

---

# Validation Error Handling

When validation fails:

* Spring throws exceptions
* Errors should be handled gracefully

Use:

```java
@ControllerAdvice
```

for global exception handling.

---

# 7. Logging

## What is Logging?

Logging means recording application events.

Logs help developers:

* Debug issues
* Monitor systems
* Diagnose failures
* Understand application flow

---

# Why Logging is Important

Without logs:

* Debugging becomes difficult
* Production issues become harder to trace

Good logging improves observability.

---

# Log Levels

| Level | Purpose                  |
| ----- | ------------------------ |
| TRACE | Detailed debugging       |
| DEBUG | Development debugging    |
| INFO  | General application flow |
| WARN  | Warning situations       |
| ERROR | Serious failures         |

---

# SLF4J Logging Example

```java
private static final Logger logger =
    LoggerFactory.getLogger(UserService.class);
```

```java
logger.info("User created successfully");
```

```java
logger.error("Failed to process request", exception);
```

---

# Logging Best Practices

## Good Practices

* Use meaningful log messages
* Log important business events
* Log exceptions with stack traces
* Use appropriate log levels

---

## Bad Practices

* Excessive logging
* Logging sensitive data
* Using `System.out.println()`
* Logging unnecessary information

---

# 8. Debugging

## What is Debugging?

Debugging is the process of identifying and fixing defects.

---

# Common Debugging Techniques

* Reading stack traces
* Using breakpoints
* Step execution
* Variable inspection
* Log analysis

---

# IntelliJ Debugging Basics

Useful debugger actions:

| Action    | Purpose              |
| --------- | -------------------- |
| Step Over | Execute current line |
| Step Into | Enter method         |
| Step Out  | Exit method          |
| Resume    | Continue execution   |

---

# Understanding Stack Traces

Example:

```text
NullPointerException at UserService.java:45
```

This indicates:

* Exception type
* File name
* Line number

Learning to read stack traces is a critical backend engineering skill.

---

# 9. Engineering Mindset

A backend engineer should always think:

* What can fail?
* What if input is invalid?
* What if database is unavailable?
* How will I debug this later?
* Can this code be tested easily?

These questions improve code quality significantly.

---

# 10. Summary

In this week, we learned:

* Fundamentals of testing
* Unit testing with JUnit
* Mocking with Mockito
* Spring Boot testing
* Validation concepts
* Logging best practices
* Debugging fundamentals

These concepts form the foundation of production-grade backend engineering.

---

# 📚 Recommended Practice

The learner is encouraged to:

* Write tests for all service methods
* Experiment with failing test cases
* Add validation to APIs
* Practice reading stack traces
* Use IntelliJ debugger regularly

Consistent practice is the best way to become confident in backend development.

---

© 2026 Aditya Pratap Bhuyan
Licensed under GPL-3.0
Maintained for backend engineering mentorship and learning.
