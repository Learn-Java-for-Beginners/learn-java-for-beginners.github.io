---
layout: default
title: Assignment - Week 4
parent: Week 4 - Design Patterns & Clean Architecture
nav_order: 4
---

# 📌 Week 4 Assignment  
## Refactoring for Clean Architecture

In this assignment, you will refactor your previous project using:

- Design Patterns
- Layered Architecture
- Clean coding principles

The goal is not to add complexity —  
The goal is to improve **structure, clarity, and maintainability**.

---

# 🎯 Objective

Transform your existing console-based application into a modular, extensible system using:

✅ Factory Pattern  
✅ Strategy Pattern  
✅ DTO Pattern  
✅ Layered Architecture  

---

# 🏗 Required Project Structure

Organize your project into packages:

```
com.yourproject
│
├── controller
├── service
├── repository
├── model
├── dto
└── factory
```

---

# ✅ Functional Requirements

Your application must:

1. Create products using a Factory
2. Add products to a cart
3. Apply discount using Strategy Pattern
4. Calculate final price
5. Return order summary using DTO
6. Follow proper layered flow:

```
Controller → Service → Repository
```

No layer should skip another layer.

---

# 🧩 Pattern Requirements

## 1️⃣ Factory Pattern
- Used to create Product objects
- Client should not use `new Product()` directly

---

## 2️⃣ Strategy Pattern
- Used for discount calculation
- Implement at least two discount strategies:
  - NoDiscount
  - SeasonalDiscount (10%)

Switch strategy dynamically.

---

## 3️⃣ DTO Pattern
Create an `OrderSummaryDTO` that includes:
- List of product names
- Total price
- Discount applied
- Final amount

Do NOT expose internal model objects directly.

---

## 4️⃣ Layered Architecture

### Controller
- Handles user input/output

### Service
- Contains business logic

### Repository
- Stores products/cart data (can use ArrayList)

---

# 🧪 Example Flow

1. User selects products
2. Controller sends request to Service
3. Service calls Repository
4. Service applies Discount Strategy
5. Service returns DTO to Controller
6. Controller prints formatted output

---

# 📋 Deliverables

Submit:

- Complete project source code
- Proper package structure
- README explaining:
  - Which patterns were used
  - Why they were used
  - How architecture is organized

---

# 🧠 Evaluation Criteria

Your assignment will be evaluated based on:

- Correct use of design patterns
- Clean separation of concerns
- Readability of code
- Logical package organization
- Avoidance of tight coupling
- Code simplicity (no over-engineering)

---

# ❌ Common Mistakes to Avoid

- Using patterns where unnecessary
- Controller directly accessing Repository
- Making everything Singleton
- Writing large classes with too many responsibilities
- Ignoring naming conventions

---

# 🏆 Expected Learning Outcome

After completing this assignment, you should be able to:

✅ Write modular Java applications  
✅ Structure projects like real-world systems  
✅ Reduce coupling between components  
✅ Improve maintainability and scalability  

---

# 💬 Reflection (Mandatory)

Answer the following in a short paragraph:

1. What was the most difficult part of refactoring?
2. Which pattern improved your design the most?
3. What would you improve if given more time?

---



👉 `solutions.md` or `week-4-questions.md`?
