---
layout: default
title: Assessment
parent: Week 5 - Spring Boot
nav_order: 3
---

# 📊 Assessment – Week 5: Spring Boot

This assessment evaluates your understanding of **Spring Boot fundamentals, REST API development, and backend architecture**.

It is designed to measure both:

* Conceptual clarity
* Practical implementation skills

---

# 🎯 Assessment Objectives

By completing this assessment, you should demonstrate:

* Understanding of IoC and Dependency Injection
* Ability to design REST APIs
* Knowledge of layered architecture
* Ability to write clean, maintainable backend code
* Basic API testing skills

---

# 🧠 Section 1: Conceptual Questions

Answer the following in your own words.

---

### 1. What is Inversion of Control (IoC)? Why is it important?

---

### 2. What is Dependency Injection? How does it improve code quality?

---

### 3. Difference between Spring Framework and Spring Boot?

---

### 4. What is a REST API?

---

### 5. Explain the role of:

* Controller
* Service
* Repository

---

### 6. What is `@RestController`?

---

### 7. Difference between:

* `@GetMapping`
* `@PostMapping`

---

### 8. Why should business logic not be written in the controller?

---

### 9. What is `application.properties` used for?

---

### 10. What HTTP status codes would you return for:

* Successful GET
* Resource created
* Resource not found
* Server error

---

# 💻 Section 2: Code Understanding

---

### 11. Identify the issue in the following code:

```java
@RestController
public class ExpenseController {

    @GetMapping("/expenses")
    public List<String> getExpenses() {
        ExpenseService service = new ExpenseService();
        return service.getExpenses();
    }
}
```

👉 What is wrong? How would you fix it?

---

### 12. What will happen if `@Service` annotation is missing from a service class?

---

### 13. What is the output of this API?

```java
@GetMapping("/hello")
public String sayHello() {
    return "Hello, World!";
}
```

👉 How would you test it?

---

# 🛠 Section 3: Practical Tasks

---

### 14. Create a simple REST API with:

* GET `/items` → returns list
* POST `/items` → adds item

---

### 15. Refactor the following into layered architecture:

```java
@RestController
public class UserController {

    @GetMapping("/users")
    public List<String> getUsers() {
        List<String> users = new ArrayList<>();
        users.add("A");
        users.add("B");
        return users;
    }
}
```

---

### 16. Add a Service layer for the above example.

---

### 17. Add proper Dependency Injection.

---

# 🧪 Section 4: API Testing

---

### 18. Test your APIs using Postman or curl.

Provide:

* Request details
* Response
* Status code

---

### 19. What happens if:

* You send invalid data?
* You call a non-existing endpoint?

---

# 📈 Evaluation Criteria

| Category                 | Marks   |
| ------------------------ | ------- |
| Conceptual Understanding | 20      |
| Code Quality             | 20      |
| API Design               | 20      |
| Architecture (Layering)  | 20      |
| Testing & Validation     | 20      |
| **Total**                | **100** |

---

# 🧠 Mentor Evaluation Notes

The mentor will evaluate based on:

* Clarity of explanation
* Clean code practices
* Proper use of annotations
* Separation of concerns
* Ability to debug and explain

---

# ⚠️ Common Mistakes to Watch

* Creating objects manually instead of using DI
* Writing logic inside controllers
* Not following naming conventions
* Not testing APIs
* Ignoring edge cases

---

# 🏁 Expected Outcome

By successfully completing this assessment, you should be able to:

* Build basic REST APIs using Spring Boot
* Structure backend code properly
* Understand how Spring manages dependencies
* Test and validate APIs

---

