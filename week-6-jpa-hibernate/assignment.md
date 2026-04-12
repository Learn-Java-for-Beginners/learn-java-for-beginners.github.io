---
layout: default
title: Assignment - JPA and Hibernate
parent: Week 6 - JPA and Hibernate
nav_order: 4
---

# 🏗 Assignment – JPA and Hibernate

This assignment will help you apply everything you have learned about **JPA and Hibernate** in a real backend scenario.

---

# 🎯 Objective

Build a **Student Course Management Backend System** using:

- Spring Boot
- JPA (Hibernate)
- MySQL/PostgreSQL

---

# 🧠 Problem Statement

You need to build a backend system where:

- A **Student** can enroll in multiple **Courses**
- Each **Course** belongs to one Student

---

# 🧱 Functional Requirements

## 👤 Student

- Create a Student
- View all Students
- Delete a Student

Fields:
- id
- name
- email

---

## 📘 Course

- Add Course to a Student
- View Courses for a Student

Fields:
- id
- courseName

---

# 🔗 Relationship Requirement

- One Student → Many Courses
- Use:
  - `@OneToMany`
  - `@ManyToOne`

---

# 🏗 Technical Requirements

## 1️⃣ Entity Design

Create:

- `Student` entity
- `Course` entity

Ensure:
- Proper mapping
- Foreign key is created

---

## 2️⃣ Repository Layer

Create:

- `StudentRepository`
- `CourseRepository`

---

## 3️⃣ Service Layer

Implement:

- Create student
- Add course to student
- Fetch students
- Fetch courses by student
- Delete student

---

## 4️⃣ Controller Layer

Create REST APIs:

### Student APIs

- POST `/students`
- GET `/students`
- DELETE `/students/{id}`

---

### Course APIs

- POST `/students/{id}/courses`
- GET `/students/{id}/courses`

---

# ⚙️ Database Configuration

Use:

- MySQL or PostgreSQL

Ensure:

- Tables are auto-created
- Relationships are reflected

---

# 🧪 Validation Requirements

- Name should not be empty
- Email should be valid

---

# ⚡ Bonus Tasks (Optional but Recommended)

- Add logging in service layer
- Handle exceptions using global exception handler
- Add DTO layer (avoid exposing entities directly)
- Implement update student API
- Add pagination for students

---

# 📦 Expected Project Structure

```

controller/
service/
repository/
entity/
dto/ (optional)
exception/ (optional)

```

---

# 🧪 Testing Instructions

Use Postman:

1. Create student
2. Add courses
3. Fetch student and courses
4. Delete student

---

# 📊 Evaluation Criteria

| Criteria | Marks |
|----------|------|
| Entity Design | 10 |
| Relationship Mapping | 15 |
| CRUD Functionality | 15 |
| Code Structure | 10 |
| Validation | 10 |
| API Design | 10 |
| Clean Code | 10 |
| Bonus Features | 20 |

---

# ⚠️ Common Mistakes to Avoid

- ❌ Missing `mappedBy` in relationships  
- ❌ Using EAGER unnecessarily  
- ❌ No validation  
- ❌ Mixing controller and service logic  
- ❌ Not testing APIs  

---

# 📌 Submission Guidelines

- Push code to GitHub repository
- Use proper commit messages
- Ensure application runs without errors
- Include sample API requests (Postman collection optional)

---

# 🧠 Reflection

After completing this assignment, ask yourself:

- Can I design entity relationships confidently?
- Do I understand how data flows from API → DB?
- Can I debug persistence issues?

---

# 🚀 Next Step

Proceed to:

👉 `Assessment`

This will help evaluate your implementation.


---

# 🔥 Why this assignment is strong

* Real backend use case
* Covers **entities + relationships + APIs + validation**
* Encourages clean architecture
* Includes optional advanced features (stretch learning)

---

