---
layout: default
title: Exercises
parent: Week 4 - Design Patterns & Clean Architecture
nav_order: 2
---

# 📝 Week 4 Exercises

These exercises will help you apply design patterns in real code.

Focus on writing clean, readable, and well-structured solutions.

---

# ✅ Exercise 1 – Singleton Pattern

Create a `ConfigurationManager` class that:

- Stores application configuration (e.g., appName, version)
- Can only have **one instance**
- Provides a `getInstance()` method

### Requirements

- Constructor must be private
- Provide getters for configuration values
- Demonstrate usage in a `main()` method

---

# ✅ Exercise 2 – Factory Pattern

Create a `ShapeFactory` that returns different shapes.

### Step 1 – Create Interface

```java
public interface Shape {
    void draw();
}
```

### Step 2 – Implement Shapes

- Circle
- Rectangle
- Triangle

### Step 3 – Create Factory

`ShapeFactory.createShape(String type)`

### Step 4 – Test It

Create shapes using the factory and call `draw()`.

✅ Goal: Client code should not use `new Circle()` directly.

---

# ✅ Exercise 3 – Builder Pattern

Create a `Product` class using the Builder pattern.

Fields:

- name (required)
- price (required)
- description (optional)
- category (optional)

### Requirements

- Use static inner Builder class
- Implement method chaining
- Demonstrate object creation using builder

---

# ✅ Exercise 4 – Strategy Pattern

Build a discount system using Strategy pattern.

### Step 1 – Create Interface

```java
public interface DiscountStrategy {
    double applyDiscount(double amount);
}
```

### Step 2 – Implement Strategies

- NoDiscount
- SeasonalDiscount (10%)
- PremiumCustomerDiscount (20%)

### Step 3 – Create Context Class

`ShoppingCart` that accepts a `DiscountStrategy`.

### Step 4 – Test

Apply different discount strategies dynamically.

✅ Goal: Avoid if-else chains.

---

# ✅ Exercise 5 – DTO Pattern

Create:

- `User` entity class
- `UserDTO` class

Convert a `User` object into `UserDTO`.

### Question

Why should password NOT be included in DTO?

---

# ✅ Exercise 6 – Layered Architecture Refactor

Take your previous mini project and restructure it into:

```
controller
service
repository
model
```

### Requirements

- Controller handles user input
- Service contains business logic
- Repository stores data (can use ArrayList instead of database)
- No layer should directly skip another layer

✅ Goal: Clear separation of responsibilities

---

# ⭐ Bonus Challenge

Refactor your Layered Architecture project to:

- Use Factory for object creation
- Use Strategy for payment or discount logic
- Use DTO for data transfer

---

# ✅ Submission Guidelines

- Follow proper package structure
- Use meaningful class names
- Add comments explaining pattern usage
- Keep methods small and focused

---

# 💡 Reminder

Do not use patterns unnecessarily.

Ask yourself:

- Does this solve a real problem?
- Does this improve readability?
- Does this reduce coupling?

Clean code is the ultimate goal.
