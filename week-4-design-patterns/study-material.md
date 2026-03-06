---
layout: default
title: Study Material
parent: Week 4 - Design Patterns & Clean Architecture
nav_order: 1
---

# Introduction to Design Patterns

As software grows, code can quickly become:

- Difficult to read
- Hard to maintain
- Rigid and fragile
- Difficult to extend

Design patterns provide **proven solutions** to common software design problems.

They are not libraries.
They are not frameworks.
They are **structured approaches to writing better code**.

---

# 1️⃣ Singleton Pattern

## ✅ Purpose

Ensure a class has **only one instance** and provide a global access point to it.

## ✅ When to Use

- Logger
- Configuration manager
- Database connection
- Caching system

## ✅ Basic Implementation

```java
public class Logger {

    private static Logger instance;

    private Logger() {
        // private constructor prevents external instantiation
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println(message);
    }
}
```

## ✅ Usage

```java
Logger logger = Logger.getInstance();
logger.log("Application started");
```

## ⚠ Important Note

Singleton can become an anti-pattern if:
- Overused
- It introduces global state
- It makes testing difficult

Use it carefully.

---

# 2️⃣ Factory Pattern

## ✅ Purpose

Create objects **without exposing instantiation logic** to the client.

## ✅ Problem Without Factory

```java
Payment payment = new CreditCardPayment();
```

The client is tightly coupled to the implementation.

## ✅ Factory Implementation

```java
public interface Payment {
    void pay();
}
```

```java
public class CreditCardPayment implements Payment {
    public void pay() {
        System.out.println("Paid using Credit Card");
    }
}
```

```java
public class UpiPayment implements Payment {
    public void pay() {
        System.out.println("Paid using UPI");
    }
}
```

```java
public class PaymentFactory {

    public static Payment createPayment(String type) {

        if (type.equalsIgnoreCase("credit")) {
            return new CreditCardPayment();
        } 
        else if (type.equalsIgnoreCase("upi")) {
            return new UpiPayment();
        }

        throw new IllegalArgumentException("Invalid payment type");
    }
}
```

## ✅ Usage

```java
Payment payment = PaymentFactory.createPayment("credit");
payment.pay();
```

✅ Now the client does not depend on concrete classes.

---

# 3️⃣ Builder Pattern

## ✅ Purpose

Create complex objects step-by-step.

Useful when:
- Many optional parameters exist
- Constructors become too large

## ❌ Problem

```java
User user = new User("John", 25, "Delhi", "1234567890");
```

Hard to read and error-prone.

## ✅ Builder Implementation

```java
public class User {

    private String name;
    private int age;
    private String city;

    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.city = builder.city;
    }

    public static class Builder {

        private String name;
        private int age;
        private String city;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
```

## ✅ Usage

```java
User user = new User.Builder()
                    .setName("John")
                    .setAge(25)
                    .setCity("Delhi")
                    .build();
```

✅ More readable  
✅ Flexible  
✅ Safer  

---

# 4️⃣ Strategy Pattern

## ✅ Purpose

Define a family of algorithms and make them interchangeable.

Instead of:

```java
if(paymentType.equals("credit")) { ... }
else if(paymentType.equals("upi")) { ... }
```

We delegate behavior to strategy classes.

## ✅ Strategy Interface

```java
public interface PaymentStrategy {
    void pay(double amount);
}
```

## ✅ Concrete Strategies

```java
public class CreditCardPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}
```

```java
public class UpiPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}
```

## ✅ Context Class

```java
public class PaymentContext {

    private PaymentStrategy strategy;

    public PaymentContext(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(double amount) {
        strategy.pay(amount);
    }
}
```

✅ Now behavior can change at runtime.

---

# 5️⃣ DTO (Data Transfer Object) Pattern

## ✅ Purpose

Transfer data between layers.

Example:

```java
public class UserDTO {

    private String name;
    private String email;

    public UserDTO(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // getters
}
```

DTOs:
- Prevent exposing internal models
- Improve security
- Reduce tight coupling

---

# 6️⃣ Layered Architecture

Professional applications follow layered structure:

```
Controller → Service → Repository
```

## ✅ Controller
Handles input/output (UI, API)

## ✅ Service
Contains business logic

## ✅ Repository
Handles database operations

---

# ✅ Example Structure

```
com.example.project
│
├── controller
├── service
├── repository
└── model
```

---

# ✅ Why This Matters

Without architecture:
- Code becomes messy
- Everything depends on everything
- Testing becomes hard

With layered architecture:
- Each class has one responsibility
- Code is modular
- Easier to extend
- Easier to test

---

# ✅ Key Takeaway

Design patterns are tools.

Use them:
- When they solve a real problem
- When code becomes difficult to maintain
- When flexibility is required

Do NOT use them just to “show knowledge”.

Clean code > Clever code.
