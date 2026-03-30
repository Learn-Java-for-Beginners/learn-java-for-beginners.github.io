---
layout: default
title: Assignment
parent: Week 5 - Spring Boot
nav_order: 6
---

# 🛠 Assignment – Week 5: Spring Boot REST API

This assignment is designed to help you apply everything you have learned this week in a **real-world backend development scenario**.

You will build a **mini backend application** using Spring Boot following proper architecture and best practices.

---

# 🎯 Objective

Build a **RESTful Expense Tracker API** with:

* Clean layered architecture
* Proper use of Spring Boot annotations
* Dependency Injection
* REST endpoints for CRUD operations

---

# 🧩 Problem Statement

You are required to develop a backend system for managing expenses.

Each expense should contain:

* `id` (integer)
* `name` (string)
* `amount` (double)

---

# 📦 Functional Requirements

Implement the following APIs:

---

## 1️⃣ Create Expense

```
POST /expenses
```

* Accept expense in request body
* Return created expense

---

## 2️⃣ Get All Expenses

```
GET /expenses
```

* Return list of all expenses

---

## 3️⃣ Get Expense by ID

```
GET /expenses/{id}
```

* Return specific expense
* Handle case when expense is not found

---

## 4️⃣ Update Expense

```
PUT /expenses/{id}
```

* Update expense details
* Return updated response

---

## 5️⃣ Delete Expense

```
DELETE /expenses/{id}
```

* Delete expense
* Return confirmation message

---

# 🏗 Architecture Requirements

Your application must follow:

### 🔹 Controller Layer

* Handles HTTP requests
* Should NOT contain business logic

### 🔹 Service Layer

* Contains business logic
* Handles data operations

### 🔹 Model Layer

* Represents Expense object

---

# ⚙️ Technical Requirements

* Use Spring Boot
* Use `@RestController`, `@Service`
* Use Dependency Injection
* Use proper request mappings
* Use `application.properties`

---

# 🧪 Testing Requirements

You must test your APIs using:

* Postman OR
* curl

---

### Validate:

* Correct responses
* Proper HTTP status codes
* Edge cases:

  * Invalid ID
  * Empty input
  * Duplicate data

---

# 📁 Suggested Project Structure

```
com.example.expensetracker
│
├── controller/
├── service/
├── model/
└── Application.java
```

---

# 📌 Constraints

* No database required (use in-memory list)
* No UI required
* Focus on backend logic

---

# 📊 Evaluation Criteria

| Category           | Marks   |
| ------------------ | ------- |
| API Functionality  | 20      |
| Code Structure     | 20      |
| Use of DI          | 15      |
| Clean Code         | 15      |
| Testing            | 15      |
| Edge Case Handling | 15      |
| **Total**          | **100** |

---

# 🧠 Hints

* Start with model class
* Then create service layer
* Then controller
* Test each API step-by-step
* Use meaningful names

---

# ⚠️ Common Mistakes to Avoid

* Writing logic in controller
* Not using DI
* Hardcoding values
* Ignoring invalid inputs
* Not testing APIs

---

# 🚀 Bonus (Optional)

If you finish early, try:

* Return proper HTTP status codes
* Add basic validation
* Add logging
* Improve response structure

---

# 📤 Submission

* Push code to GitHub repository
* Ensure code compiles and runs
* Be ready to explain your code

---

# 🏁 Expected Outcome

By completing this assignment, you will:

* Build your first real backend API
* Understand Spring Boot flow
* Gain confidence in REST development
* Be ready for database integration (next week)

---

