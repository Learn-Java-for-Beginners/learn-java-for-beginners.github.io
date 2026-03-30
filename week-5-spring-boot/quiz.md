---
layout: default
title: Quiz
parent: Week 5 - Spring Boot
nav_order: 7
---

# 🧠 Quiz – Week 5: Spring Boot

This quiz is designed to test your understanding of:

* Spring Boot fundamentals
* REST APIs
* Dependency Injection
* Backend architecture

👉 Try to answer without referring to notes.

---

# 📘 Section 1: Conceptual Questions

---

### 1. What problem does Spring Framework solve?

---

### 2. What is Inversion of Control (IoC)?

---

### 3. What is Dependency Injection?

---

### 4. Difference between Spring and Spring Boot?

---

### 5. What is a REST API?

---

### 6. What does `@SpringBootApplication` do?

---

### 7. What is the role of `@RestController`?

---

### 8. Why do we use `@RequestMapping`?

---

### 9. Difference between:

* `@GetMapping`
* `@PostMapping`

---

### 10. What is the purpose of `application.properties`?

---

# 💻 Section 2: Code Understanding

---

### 11. What is wrong in the following code?

```java id="2wblvr"
@RestController
public class UserController {

    @GetMapping("/users")
    public List<String> getUsers() {
        UserService service = new UserService();
        return service.getUsers();
    }
}
```

---

### 12. What will happen if Spring cannot find a bean to inject?

---

### 13. What is the output of this API?

```java id="mb4npb"
@GetMapping("/test")
public String test() {
    return "Spring Boot Working!";
}
```

---

### 14. Identify the mistake:

```java id="sv3h83"
@Service
public class UserService {
}
```

```java id="2a0md8"
@RestController
public class UserController {

    private UserService userService;

    public UserController() {
        this.userService = new UserService();
    }
}
```

---

# 🛠 Section 3: Practical Thinking

---

### 15. Design an API to:

* Get all products
* Add a product

What endpoints will you create?

---

### 16. Where should business logic be written?

---

### 17. Why should controllers be kept thin?

---

### 18. What happens if multiple responsibilities are placed in one class?

---

# 🧪 Section 4: API Testing

---

### 19. How will you test a POST API?

---

### 20. What status code should be returned for:

* Successful GET
* Resource created
* Invalid request
* Resource not found

---

### 21. What happens if you call:

```id="fh5pfq"
GET /invalid-endpoint
```

---

# 🔍 Section 5: Debugging & Scenario-Based

---

### 22. Your API is returning `500 Internal Server Error`. What will you check?

---

### 23. Your API is not getting called. What could be the reasons?

---

### 24. You added a service class but Spring is not injecting it. Why?

---

### 25. You wrote a REST API but browser shows 404. What could be wrong?

---

# 🏁 Self-Evaluation

After completing this quiz, you should be able to:

✔ Explain core Spring concepts
✔ Understand REST APIs
✔ Identify common mistakes
✔ Think like a backend developer

---

