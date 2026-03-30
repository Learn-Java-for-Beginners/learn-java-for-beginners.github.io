---
layout: default
title: Study Material
parent: Week 5 - Spring Boot
nav_order: 2
---

# 📘 Study Material – Week 5: Spring Boot

---

# 🚀 1. Introduction to Spring & Spring Boot

## 🔹 What is Spring?

Spring is a **Java framework** used to build enterprise applications.

It provides:

* Dependency management
* Modular architecture
* Integration with databases, messaging systems, etc.

---

## 🔹 What is Spring Boot?

Spring Boot is an extension of Spring that:

* Removes boilerplate configuration
* Provides auto-configuration
* Helps you start applications quickly

👉 In simple terms:

> Spring = Powerful but complex
> Spring Boot = Spring made easy

---

# 🧠 2. Core Concept: Inversion of Control (IoC)

## 🔹 Traditional Approach

```java
class OrderService {
    PaymentService paymentService = new PaymentService();
}
```

Problem:

* Tight coupling
* Hard to test
* Hard to replace dependencies

---

## 🔹 Spring Approach (IoC)

Spring creates and manages objects for you.

```java
@Service
class OrderService {

    private final PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
```

---

## 🔑 Key Idea

> Instead of creating objects, you **receive them from the framework**

This is called **Inversion of Control (IoC)**.

---

# 💉 3. Dependency Injection (DI)

Dependency Injection is how IoC is implemented.

## Types:

### 1️⃣ Constructor Injection (Recommended)

```java
@Service
class OrderService {

    private final PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
```

✔ Best for:

* Immutability
* Testability
* Clean design

---

### 2️⃣ Field Injection (Avoid in production)

```java
@Autowired
private PaymentService paymentService;
```

❌ Hard to test
❌ Not recommended

---

# 🏗 4. Spring Boot Application Structure

A standard Spring Boot application follows layered architecture:

```
Controller → Service → Repository
```

---

## 🔹 Controller Layer (API Layer)

Handles HTTP requests.

```java
@RestController
@RequestMapping("/expenses")
class ExpenseController {

    @GetMapping
    public String getAllExpenses() {
        return "List of expenses";
    }
}
```

---

## 🔹 Service Layer (Business Logic)

```java
@Service
class ExpenseService {

    public String getExpenses() {
        return "Business logic here";
    }
}
```

---

## 🔹 Repository Layer

(We will fully implement this in Week 6)

```java
@Repository
class ExpenseRepository {
}
```

---

# 🌐 5. Building REST APIs

REST = Representational State Transfer

You expose endpoints that clients (UI, mobile apps) can call.

---

## 🔹 Common HTTP Methods

| Method | Purpose     |
| ------ | ----------- |
| GET    | Fetch data  |
| POST   | Create data |
| PUT    | Update data |
| DELETE | Delete data |

---

## 🔹 Example REST Controller

```java
@RestController
@RequestMapping("/expenses")
class ExpenseController {

    @GetMapping
    public List<String> getAllExpenses() {
        return List.of("Food", "Travel");
    }

    @PostMapping
    public String createExpense() {
        return "Expense created";
    }
}
```

---

# 📥 6. Handling Request Data

## 🔹 Query Params

```
GET /expenses?id=1
```

```java
@GetMapping
public String getExpense(@RequestParam int id) {
    return "Expense " + id;
}
```

---

## 🔹 Path Variables

```
GET /expenses/1
```

```java
@GetMapping("/{id}")
public String getExpense(@PathVariable int id) {
    return "Expense " + id;
}
```

---

## 🔹 Request Body (POST)

```java
@PostMapping
public String createExpense(@RequestBody String expense) {
    return "Created: " + expense;
}
```

---

# 📤 7. Response Handling

Spring automatically converts objects to JSON.

```java
@GetMapping
public Map<String, String> getExpense() {
    return Map.of("name", "Food", "amount", "100");
}
```

---

# ⚙️ 8. application.properties

Used for configuration.

Example:

```
server.port=8081
spring.application.name=expense-tracker
```

---

# 🧪 9. Testing APIs (Important)

Use tools like:

* Postman
* curl

---

## Example curl command:

```
curl -X GET http://localhost:8080/expenses
```

---

## What to Validate:

* Correct response
* HTTP status codes
* Edge cases:

  * Invalid ID
  * Missing data
  * Empty response

---

# 🧱 10. Project Setup (Quick Start)

Use Spring Initializr:

* Project: Maven
* Language: Java
* Dependencies:

  * Spring Web

---

## Basic Application Class

```java
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
```

---

# ⚠️ 11. Common Mistakes to Avoid

❌ Writing all logic in Controller
❌ Not using Service layer
❌ Field injection
❌ No error handling
❌ Large methods

---

# 🧠 12. Best Practices

✔ Use constructor injection
✔ Keep layers separate
✔ Use meaningful names
✔ Keep methods small
✔ Return proper responses

---

# 🔄 13. How This Connects to Next Week

Right now:

* Your APIs return dummy data

Next week:

* You will connect to a database
* Use JPA & Hibernate
* Store real data

---

# 🏁 Summary

This week, you learned:

* What Spring Boot is
* IoC and Dependency Injection
* REST API basics
* Layered architecture
* Request & response handling

---

# 🚀 Final Thought

You are no longer just writing Java programs.

You are now building **real backend systems**.

Focus on:

* Clean code
* Clear structure
* Understanding concepts deeply

Consistency is the key 💪
