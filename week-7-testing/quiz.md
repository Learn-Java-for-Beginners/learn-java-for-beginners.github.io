---
layout: default
title: Quiz
parent: Week 7 - Testing, Logging and Validation
nav_order: 5
---

# Quiz

# 📘 Instructions

This quiz is designed to evaluate understanding of:

* Unit testing
* JUnit 5
* Validation
* Logging
* Debugging
* Backend reliability concepts

The learner is encouraged to:

* Attempt all questions honestly
* Explain reasoning wherever applicable
* Focus on understanding rather than memorization

---

# Section 1 - Basic Concepts

## Question 1

What is the primary purpose of unit testing?

### Options

A. To deploy applications
B. To test small units of code independently
C. To replace debugging
D. To generate logs automatically

---

## Question 2

Which annotation is used to mark a test method in JUnit 5?

### Options

A. `@Controller`
B. `@Bean`
C. `@Test`
D. `@Service`

---

## Question 3

Which assertion verifies that two values are equal?

### Options

A. `assertNull()`
B. `assertTrue()`
C. `assertEquals()`
D. `assertThrows()`

---

## Question 4

What is the purpose of mocking in unit testing?

### Options

A. To deploy applications faster
B. To replace dependencies during testing
C. To create database tables
D. To improve UI rendering

---

## Question 5

Which framework is commonly used for mocking in Java?

### Options

A. Hibernate
B. Mockito
C. Maven
D. Lombok

---

# Section 2 - Validation Concepts

## Question 6

Which annotation ensures a string is not null and not blank?

### Options

A. `@NotNull`
B. `@Size`
C. `@NotBlank`
D. `@Min`

---

## Question 7

Which annotation validates email format?

### Options

A. `@Email`
B. `@Pattern`
C. `@Value`
D. `@Validated`

---

## Question 8

Why is validation important in backend systems?

### Options

A. To reduce application size
B. To improve UI color themes
C. To ensure invalid data is rejected
D. To increase CPU usage

---

## Question 9

Which annotation is commonly used in Spring Boot controllers to trigger validation?

### Options

A. `@Autowired`
B. `@Valid`
C. `@Transactional`
D. `@Primary`

---

# Section 3 - Logging Concepts

## Question 10

What is the purpose of logging?

### Options

A. To compile applications
B. To monitor and troubleshoot applications
C. To replace databases
D. To reduce memory usage

---

## Question 11

Which log level is generally used for serious failures?

### Options

A. TRACE
B. DEBUG
C. INFO
D. ERROR

---

## Question 12

Which of the following is considered a bad logging practice?

### Options

A. Logging exceptions
B. Using meaningful log messages
C. Logging passwords and sensitive data
D. Using appropriate log levels

---

## Question 13

Which logging framework abstraction is commonly used in Spring Boot?

### Options

A. SLF4J
B. JDBC
C. JPA
D. Servlet API

---

# Section 4 - Debugging Concepts

## Question 14

What does a stack trace help identify?

### Options

A. Database schema
B. Runtime error location
C. Network bandwidth
D. Docker image size

---

## Question 15

Which debugging action enters inside a method during execution?

### Options

A. Step Over
B. Resume
C. Step Into
D. Stop

---

## Question 16

What is a common cause of `NullPointerException`?

### Options

A. Accessing a null object reference
B. Missing semicolon
C. Incorrect import statement
D. Invalid package name

---

# Section 5 - Code Analysis

## Question 17

Analyze the following code:

```java id="9bc31j"
public int divide(int a, int b) {
    return a / b;
}
```

What issue can occur?

### Options

A. Compilation failure
B. Memory leak
C. Division by zero exception
D. Syntax error

---

## Question 18

Analyze the following code:

```java id="cr18pz"
String name = null;
System.out.println(name.length());
```

What will happen?

### Options

A. Program executes normally
B. NullPointerException occurs
C. ArithmeticException occurs
D. Compilation error occurs

---

## Question 19

Analyze the following validation:

```java id="mb5v4s"
@NotBlank
private String username;
```

Which value is invalid?

### Options

A. `"Aditya"`
B. `"Java"`
C. `"   "`
D. `"Developer"`

---

## Question 20

Analyze the following logging statement:

```java id="djlwm8"
logger.error("Failed to create user", exception);
```

What is the purpose of passing the exception object?

### Options

A. To restart the application
B. To log stack trace information
C. To create database backup
D. To improve performance

---

# Section 6 - Short Answer Questions

## Question 21

Explain the difference between:

* Unit testing
* Integration testing

---

## Question 22

Why should developers avoid using:

```java id="mwjlwm"
System.out.println()
```

for production logging?

---

## Question 23

What are the benefits of automated testing?

---

## Question 24

Explain the purpose of:

```java id="tr4jlwm"
assertThrows()
```

---

## Question 25

Why is centralized exception handling useful?

---

# Section 7 - Practical Thinking Questions

## Question 26

Suppose an API accepts employee age.

What validations would you add and why?

---

## Question 27

A production issue occurs but there are no logs.

Why does this make troubleshooting difficult?

---

## Question 28

A unit test passes on your machine but fails on another system.

What could be possible reasons?

---

## Question 29

You receive the following stack trace:

```text id="qk8z13"
NullPointerException at UserService.java:52
```

What steps would you take to debug the issue?

---

## Question 30

Why should backend engineers think about edge cases while writing code?

---

# 🧠 Bonus Challenge Questions

## Question 31

What is the difference between:

* `@NotNull`
* `@NotBlank`
* `@NotEmpty`

---

## Question 32

Why should unit tests be independent from each other?

---

## Question 33

What are the risks of insufficient testing in production systems?

---

## Question 34

What information should good log messages contain?

---

## Question 35

Why is debugging considered an important engineering skill?

---

# 📋 Submission Instructions

The learner should submit:

* Answers to objective questions
* Explanations for descriptive questions
* Any code snippets requested
* Notes explaining debugging thought process

---

# 🏁 Expected Outcome

After completing this quiz, the learner should have improved understanding of:

✅ Unit testing fundamentals
✅ Validation concepts
✅ Logging best practices
✅ Debugging approaches
✅ Backend reliability principles
✅ Engineering mindset development

---

# 💡 Mentor Notes

The purpose of this quiz is not only evaluation.

It is intended to:

* Encourage critical thinking
* Reinforce backend engineering practices
* Build debugging confidence
* Develop production-quality thinking

Discussion after the quiz is strongly encouraged.

---

© 2026 Aditya Pratap Bhuyan
Licensed under GPL-3.0
Maintained for backend engineering mentorship and learning.
