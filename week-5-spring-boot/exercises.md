---
layout: default
title: Exercises
parent: Week 5 - Spring Boot
nav_order: 4
---

# 💻 Exercises – Week 5: Spring Boot

These exercises are designed to help you **build confidence step-by-step** in developing backend applications using Spring Boot.

👉 Complete all exercises in order. Do not skip.

---

# 🎯 Goal

By completing these exercises, you will:

* Understand Spring Boot project setup
* Build REST APIs
* Apply layered architecture
* Use Dependency Injection properly
* Think like a backend developer

---

# 🧩 Exercise 1: Create Your First Spring Boot Project

### Task

* Create a Spring Boot project using:

  * Spring Initializr
  * Maven or Gradle
* Add dependency:

  * Spring Web

---

### Expected Output

* Project runs successfully
* Application starts on port 8080
* No errors

---

# 🧩 Exercise 2: Create a Simple REST Endpoint

### Task

Create a controller:

```java
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Backend!";
    }
}
```

---

### Test

Open browser or use curl:

```
http://localhost:8080/hello
```

---

### Expected Output

```
Hello Backend!
```

---

# 🧩 Exercise 3: Build Expense Controller

### Task

Create a controller:

* Endpoint: `/expenses`
* Method: GET
* Return: List of expenses (hardcoded for now)

---

### Example

```java
@GetMapping("/expenses")
public List<String> getExpenses() {
    return List.of("Food", "Travel", "Shopping");
}
```

---

# 🧩 Exercise 4: Add Path Variable

### Task

Create API:

```
GET /expenses/{id}
```

---

### Example

```java
@GetMapping("/expenses/{id}")
public String getExpense(@PathVariable int id) {
    return "Expense ID: " + id;
}
```

---

# 🧩 Exercise 5: Add POST API

### Task

Create API:

```
POST /expenses
```

---

### Example

```java
@PostMapping("/expenses")
public String createExpense() {
    return "Expense Created";
}
```

---

# 🧩 Exercise 6: Introduce Service Layer

### Task

* Create `ExpenseService` class
* Move logic from controller to service

---

### Example

```java
@Service
public class ExpenseService {

    public List<String> getExpenses() {
        return List.of("Food", "Travel");
    }
}
```

---

### Update Controller

```java
@RestController
public class ExpenseController {

    private final ExpenseService service;

    public ExpenseController(ExpenseService service) {
        this.service = service;
    }

    @GetMapping("/expenses")
    public List<String> getExpenses() {
        return service.getExpenses();
    }
}
```

---

# 🧩 Exercise 7: Add PUT and DELETE APIs

### Task

Create:

* PUT `/expenses/{id}`
* DELETE `/expenses/{id}`

---

### Expected Behavior

* Update returns confirmation message
* Delete returns confirmation message

---

# 🧩 Exercise 8: Use Request Body

### Task

Accept input using request body.

---

### Example

```java
@PostMapping("/expenses")
public String createExpense(@RequestBody String expense) {
    return "Created: " + expense;
}
```

---

# 🧩 Exercise 9: Add Model Class

### Task

Create a model:

```java
public class Expense {
    private int id;
    private String name;
    private double amount;
}
```

---

Update APIs to use this object instead of String.

---

# 🧩 Exercise 10: Add Configuration

### Task

Modify:

```
application.properties
```

Add:

```
server.port=8081
spring.application.name=expense-tracker
```

---

### Verify

* Application runs on new port
* Name is visible in logs

---

# 🧪 Exercise 11: API Testing

### Task

Test all APIs using:

* Postman OR
* curl

---

### Validate

* Correct responses
* Proper status codes
* Invalid input handling

---

# 🧠 Bonus Challenge (Optional)

### 🔥 Build Mini Expense API

Implement:

* Add expense
* Get all expenses
* Get by ID
* Update
* Delete

Use:

* Controller
* Service
* Model

---

# ⚠️ Rules

* Do NOT write all logic in controller
* Follow clean code practices
* Use meaningful names
* Keep methods small

---

# 🏁 Completion Checklist

✔ Spring Boot app created
✔ REST APIs implemented
✔ Service layer added
✔ Dependency Injection used
✔ APIs tested successfully

---

# 🚀 Next Step

After completing exercises:

➡️ Move to **Assignment** for real-world implementation

---
