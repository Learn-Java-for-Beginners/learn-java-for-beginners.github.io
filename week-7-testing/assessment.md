---
layout: default
title: Assessment
parent: Week 7 - Testing, Logging and Validation
nav_order: 2
---

# Assessment

# 📘 Objective

The purpose of this assessment is to evaluate the learner’s understanding of:

* Unit testing concepts
* JUnit 5 fundamentals
* Validation in Spring Boot
* Logging practices
* Debugging skills
* Backend engineering mindset

The assessment focuses not only on theoretical understanding but also on practical implementation and problem-solving ability.

---

# 🎯 Assessment Goals

By the end of this assessment, the learner should demonstrate the ability to:

* Write clean and maintainable unit tests
* Validate API inputs correctly
* Handle invalid requests gracefully
* Use logs effectively for troubleshooting
* Debug backend issues independently
* Explain testing-related concepts clearly

---

# 📊 Assessment Breakdown

| Category                        | Weightage |
| ------------------------------- | --------- |
| Conceptual Understanding        | 20%       |
| Coding Exercises                | 25%       |
| Unit Testing Implementation     | 20%       |
| Validation & Exception Handling | 15%       |
| Logging Practices               | 10%       |
| Debugging & Troubleshooting     | 10%       |

---

# 1. Conceptual Assessment

The learner should be able to explain the following concepts clearly.

---

## Testing Concepts

* What is unit testing?
* Difference between manual and automated testing
* Difference between unit testing and integration testing
* Why automated testing is important
* Characteristics of good unit tests

---

## JUnit Concepts

* Purpose of JUnit
* Usage of `@Test`
* Common assertions
* Purpose of `@BeforeEach`
* Exception testing using `assertThrows`

---

## Mockito Concepts

* What is mocking?
* Why mocking is needed
* Benefits of isolated testing

---

## Validation Concepts

* Purpose of validation
* Difference between `@NotNull` and `@NotBlank`
* Why validation improves API reliability
* Purpose of `@Valid`

---

## Logging Concepts

* Importance of logging
* Different log levels
* Difference between logging and debugging
* Why `System.out.println()` is discouraged

---

## Debugging Concepts

* Understanding stack traces
* Identifying runtime issues
* Using debugger tools effectively

---

# 2. Practical Coding Assessment

The learner should complete the following tasks independently.

---

## Task 1 - Write Unit Tests

Write unit tests for:

* Service methods
* Utility methods
* Validation scenarios

The tests should include:

* Positive test cases
* Negative test cases
* Boundary conditions

---

## Task 2 - Validation Implementation

Add validation to API request DTOs using:

* `@NotNull`
* `@NotBlank`
* `@Size`
* `@Email`

Validation failures should return meaningful responses.

---

## Task 3 - Global Exception Handling

Implement centralized exception handling using:

```java id="ps5s66"
@ControllerAdvice
```

The solution should:

* Handle validation exceptions
* Return proper HTTP status codes
* Provide readable error messages

---

## Task 4 - Logging Implementation

Add logs to:

* Service layer
* Exception handling
* Important business events

The learner should use:

* Appropriate log levels
* Meaningful log messages

---

## Task 5 - Debugging Exercise

The learner will be provided intentionally broken code and should:

* Identify the issue
* Explain the root cause
* Fix the problem
* Verify the fix

---

# 3. Code Quality Assessment

The following code quality standards will be evaluated.

---

## Naming Standards

* Meaningful variable names
* Meaningful method names
* Readable class names

---

## Clean Code Practices

* Small methods
* Proper formatting
* Avoiding duplicate code
* Proper separation of concerns

---

## Testing Quality

Tests should:

* Be readable
* Be independent
* Test one behavior at a time
* Avoid unnecessary complexity

---

# 4. Review Discussion Assessment

During the weekly review session, the learner should be able to:

* Explain implementation decisions
* Walk through written tests
* Explain validation logic
* Discuss debugging approach
* Interpret stack traces

---

# 5. Assessment Scoring Rubric

## Excellent (90-100%)

The learner:

* Writes clean and structured tests
* Demonstrates strong understanding
* Debugs independently
* Uses validation and logging properly
* Explains concepts confidently

---

## Good (75-89%)

The learner:

* Understands major concepts
* Writes functional tests
* Handles validation correctly
* Requires minor guidance

---

## Average (60-74%)

The learner:

* Understands basics
* Struggles with advanced scenarios
* Requires guidance during debugging

---

## Needs Improvement (<60%)

The learner:

* Has conceptual gaps
* Writes incomplete tests
* Struggles with debugging and validation
* Requires significant mentoring support

---

# 🧠 Important Evaluation Areas

Special focus will be given to the learner’s ability to:

* Think critically
* Handle edge cases
* Anticipate failures
* Debug problems systematically
* Write reliable backend code

The goal is not only to complete tasks but to develop professional backend engineering habits.

---

# 🏁 Expected Outcome

By the end of this assessment, the learner should be capable of:

✅ Writing basic unit tests independently
✅ Validating API requests properly
✅ Handling backend errors gracefully
✅ Using logging effectively
✅ Debugging common runtime issues
✅ Thinking like a backend engineer

---

# 📌 Mentor Notes

The assessment should encourage learning and improvement rather than fear of mistakes.

The primary objective is:

* Skill development
* Confidence building
* Engineering mindset cultivation

Constructive feedback should always accompany review discussions.

---

© 2026 Aditya Pratap Bhuyan
Licensed under GPL-3.0
Maintained for backend engineering mentorship and learning.
