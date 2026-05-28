---
layout: default
title: Solutions
parent: Week 7 - Testing, Logging and Validation
nav_order: 7
---

# Solutions

# 📘 Introduction

This document contains reference solutions for the exercises and assignments provided in Week 7.

The purpose of these solutions is to:

* Demonstrate clean coding practices
* Show proper testing approaches
* Illustrate validation and logging usage
* Encourage good backend engineering habits

The learner is encouraged to:

* Attempt exercises independently first
* Compare approaches afterward
* Understand the reasoning behind implementations

Copying solutions directly without understanding is discouraged.

---

# Solution 1 - Basic Unit Testing

## Problem

Write unit tests for a `Calculator` class.

---

## Calculator Class

```java id="q8q6fd"
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}
```

---

## Unit Test

```java id="0xg76z"
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void shouldAddNumbersCorrectly() {

        Calculator calculator = new Calculator();

        int result = calculator.add(2, 3);

        assertEquals(5, result);
    }

    @Test
    void shouldSubtractNumbersCorrectly() {

        Calculator calculator = new Calculator();

        int result = calculator.subtract(5, 2);

        assertEquals(3, result);
    }
}
```

---

# Solution 2 - Exception Testing

## Problem

Handle division by zero properly.

---

## Updated Calculator

```java id="rjlwm8"
public int divide(int a, int b) {

    if (b == 0) {
        throw new IllegalArgumentException(
            "Divisor cannot be zero"
        );
    }

    return a / b;
}
```

---

## Unit Test

```java id="c7jlwm"
@Test
void shouldThrowExceptionWhenDivisorIsZero() {

    Calculator calculator = new Calculator();

    assertThrows(
        IllegalArgumentException.class,
        () -> calculator.divide(10, 0)
    );
}
```

---

# Solution 3 - Validation Utility

## Utility Method

```java id="nx84mv"
public boolean isValidName(String name) {

    return name != null
        && !name.isBlank()
        && name.length() >= 3;
}
```

---

## Unit Test

```java id="jlwmv8"
@Test
void shouldReturnFalseForBlankName() {

    ValidationUtil util = new ValidationUtil();

    boolean result = util.isValidName(" ");

    assertFalse(result);
}
```

---

# Solution 4 - DTO Validation

## EmployeeRequest DTO

```java id="r7ux7f"
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class EmployeeRequest {

    @NotBlank(message = "Name cannot be blank")
    private String name;

    @Email(message = "Invalid email format")
    private String email;

    @Min(value = 18, message = "Age must be at least 18")
    private int age;

    // Getters and Setters
}
```

---

# Solution 5 - Controller Validation

## REST Controller

```java id="fjlwm0"
@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @PostMapping
    public ResponseEntity<String> createEmployee(
            @Valid @RequestBody EmployeeRequest request) {

        return ResponseEntity.ok("Employee created");
    }
}
```

---

# Solution 6 - Global Exception Handling

## Global Exception Handler

```java id="ykmjlwm"
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>>
    handleValidationException(
            MethodArgumentNotValidException exception) {

        Map<String, String> errors = new HashMap<>();

        exception.getBindingResult()
                .getFieldErrors()
                .forEach(error ->
                    errors.put(
                        error.getField(),
                        error.getDefaultMessage()
                    )
                );

        return ResponseEntity.badRequest().body(errors);
    }
}
```

---

# Solution 7 - Logging

## Service Layer Logging

```java id="jlwm73"
private static final Logger logger =
    LoggerFactory.getLogger(EmployeeService.class);
```

```java id="jlwm11"
public Employee create(EmployeeRequest request) {

    logger.info(
        "Creating employee with email: {}",
        request.getEmail()
    );

    Employee employee = new Employee();

    logger.info(
        "Employee created successfully"
    );

    return employee;
}
```

---

# Solution 8 - Mockito Example

## Service Class

```java id="jlwm82"
@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User findById(Long id) {
        return repository.findById(id)
            .orElseThrow(() ->
                new RuntimeException("User not found"));
    }
}
```

---

## Mockito Test

```java id="jlwm83"
@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserRepository repository;

    @InjectMocks
    private UserService service;

    @Test
    void shouldReturnUserSuccessfully() {

        User user = new User();
        user.setId(1L);

        when(repository.findById(1L))
            .thenReturn(Optional.of(user));

        User result = service.findById(1L);

        assertNotNull(result);
    }
}
```

---

# Solution 9 - Debugging NullPointerException

## Problematic Code

```java id="jlwm84"
public void printLength(String value) {
    System.out.println(value.length());
}
```

---

## Issue

If `value` is null:

* `NullPointerException` occurs

---

## Improved Solution

```java id="jlwm85"
public void printLength(String value) {

    if (value == null) {
        throw new IllegalArgumentException(
            "Value cannot be null"
        );
    }

    System.out.println(value.length());
}
```

---

# Solution 10 - Logging Best Practices

# Good Logging Example

```java id="jlwm86"
logger.info(
    "Order created successfully with id: {}",
    orderId
);
```

---

# Bad Logging Example

```java id="jlwm87"
System.out.println("Something happened");
```

Problems:

* No structure
* Difficult to filter
* Not production friendly

---

# Solution 11 - Reading Stack Trace

## Example

```text id="jlwm88"
java.lang.NullPointerException
    at com.example.service.UserService.create(UserService.java:42)
```

---

## Analysis

This means:

* A null object was accessed
* The issue occurred in:
  `UserService.java`
* At line:
  `42`

---

## Debugging Steps

1. Open file
2. Go to line 42
3. Identify null variable
4. Trace object initialization
5. Add null handling

---

# Solution 12 - Testing Invalid API Payload

## Invalid Request

```json id="jlwm89"
{
  "name": "",
  "email": "invalid-email",
  "age": -1
}
```

---

## Expected Response

```json id="jlwm90"
{
  "name": "Name cannot be blank",
  "email": "Invalid email format",
  "age": "Age must be at least 18"
}
```

---

# 🧠 Important Engineering Lessons

## 1. Testing Improves Reliability

Tests help:

* Prevent regressions
* Improve confidence
* Detect issues early

---

## 2. Validation Protects Applications

Validation prevents:

* Corrupted data
* Invalid requests
* Unexpected failures

---

## 3. Logging Helps Troubleshooting

Good logs:

* Improve debugging
* Help production monitoring
* Explain application behavior

---

## 4. Debugging is a Core Skill

Professional developers must:

* Read stack traces
* Investigate failures
* Think logically
* Isolate root causes

---

# 📚 Additional Best Practices

## Testing Best Practices

* Write meaningful test names
* Keep tests independent
* Avoid overly complex tests
* Test edge cases

---

## Logging Best Practices

* Use appropriate log levels
* Avoid sensitive information
* Keep logs meaningful
* Avoid excessive logging

---

## Validation Best Practices

* Validate early
* Return meaningful errors
* Handle invalid requests gracefully

---

# 🏁 Final Outcome

After understanding these solutions, the learner should be able to:

✅ Write basic unit tests
✅ Handle validation properly
✅ Implement exception handling
✅ Add meaningful logs
✅ Debug common runtime issues
✅ Develop production-quality backend habits

---

# 💡 Mentor Notes

These solutions represent reference implementations.

Alternative implementations may also be valid if they:

* Follow clean coding principles
* Handle edge cases properly
* Maintain readability and reliability

The focus should always remain on:

* Learning
* Understanding
* Engineering discipline

---

© 2026 Aditya Pratap Bhuyan
Licensed under GPL-3.0
Maintained for backend engineering mentorship and learning.
