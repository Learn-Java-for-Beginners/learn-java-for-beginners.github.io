---
layout: default
title: Solutions
parent: Week 5 - Spring Boot
nav_order: 5
---

# ✅ Solutions – Week 5: Spring Boot

This section provides **reference implementations** for the exercises.

⚠️ **Important**
Do not read solutions before attempting exercises yourself.
Use this only for:

* Validation
* Debugging help
* Understanding best practices

---

# 🧩 Solution 1: Spring Boot Project Setup

A valid Spring Boot project should have:

* `@SpringBootApplication` main class
* Proper dependencies (Spring Web)
* Application starts successfully

---

## Main Class

```java
@SpringBootApplication
public class ExpenseTrackerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExpenseTrackerApplication.class, args);
    }
}
```

---

# 🧩 Solution 2: Hello Endpoint

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

# 🧩 Solution 3: Get Expenses (Basic)

```java
@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    @GetMapping
    public List<String> getExpenses() {
        return List.of("Food", "Travel", "Shopping");
    }
}
```

---

# 🧩 Solution 4: Path Variable

```java
@GetMapping("/{id}")
public String getExpense(@PathVariable int id) {
    return "Expense ID: " + id;
}
```

---

# 🧩 Solution 5: POST API

```java
@PostMapping
public String createExpense() {
    return "Expense Created";
}
```

---

# 🧩 Solution 6: Service Layer + DI

---

## Service

```java
@Service
public class ExpenseService {

    public List<String> getExpenses() {
        return List.of("Food", "Travel");
    }
}
```

---

## Controller

```java
@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping
    public List<String> getExpenses() {
        return expenseService.getExpenses();
    }
}
```

---

# 🧩 Solution 7: PUT & DELETE APIs

```java
@PutMapping("/{id}")
public String updateExpense(@PathVariable int id) {
    return "Expense updated: " + id;
}

@DeleteMapping("/{id}")
public String deleteExpense(@PathVariable int id) {
    return "Expense deleted: " + id;
}
```

---

# 🧩 Solution 8: Request Body

```java
@PostMapping
public String createExpense(@RequestBody String expense) {
    return "Created: " + expense;
}
```

---

# 🧩 Solution 9: Model Class

```java
public class Expense {

    private int id;
    private String name;
    private double amount;

    public Expense() {}

    public Expense(int id, String name, double amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
}
```

---

# 🧩 Solution 10: Using Model in API

```java
@PostMapping
public Expense createExpense(@RequestBody Expense expense) {
    return expense;
}
```

---

# 🧩 Solution 11: application.properties

```
server.port=8081
spring.application.name=expense-tracker
```

---

# 🧩 Solution 12: Final Structured Version (Best Practice)

---

## 📦 Model

```java
public class Expense {
    private int id;
    private String name;
    private double amount;

    // getters & setters
}
```

---

## 🧠 Service

```java
@Service
public class ExpenseService {

    private final List<Expense> expenses = new ArrayList<>();

    public List<Expense> getAll() {
        return expenses;
    }

    public Expense add(Expense expense) {
        expenses.add(expense);
        return expense;
    }

    public Expense getById(int id) {
        return expenses.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public String delete(int id) {
        expenses.removeIf(e -> e.getId() == id);
        return "Deleted";
    }
}
```

---

## 🌐 Controller

```java
@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    private final ExpenseService service;

    public ExpenseController(ExpenseService service) {
        this.service = service;
    }

    @GetMapping
    public List<Expense> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Expense create(@RequestBody Expense expense) {
        return service.add(expense);
    }

    @GetMapping("/{id}")
    public Expense getById(@PathVariable int id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        return service.delete(id);
    }
}
```

---

# 🧪 Testing Examples

---

## curl Commands

### GET

```
curl http://localhost:8081/expenses
```

---

### POST

```
curl -X POST http://localhost:8081/expenses \
-H "Content-Type: application/json" \
-d '{"id":1,"name":"Food","amount":200}'
```

---

# ⚠️ Improvements (For Future Weeks)

* Add database (Week 6)
* Add validation
* Add exception handling
* Add logging
* Add unit tests

---

# 🧠 Key Learnings from Solutions

* Use **Dependency Injection**, not manual object creation
* Keep controller thin
* Move logic to service
* Use proper request/response structures
* Follow layered architecture

---

# 🚀 Final Note

If your implementation is close to this, you are on the right track.

If not — don’t worry.
Review, refactor, and improve.

That’s how backend engineers grow 💪

---
