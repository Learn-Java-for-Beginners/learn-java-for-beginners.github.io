
---
layout: default
title: Exercises - JPA and Hibernate
parent: Week 6 - JPA and Hibernate
nav_order: 2
---

# 🧪 Exercises – JPA and Hibernate

These exercises are designed to help you **practice and internalize** JPA and Hibernate concepts.

👉 Complete all exercises before moving to the assignment.

---

# 🎯 Exercise Guidelines

- Write clean, readable code
- Follow layered architecture (Controller → Service → Repository)
- Test APIs using Postman
- Commit code after each exercise
- Do NOT copy from internet — try first

---

# 🧩 Exercise 1: Create Your First Entity

## Objective
Understand how to map a Java class to a database table.

## Task

1. Create an entity called `Student`
2. Add fields:
   - id (Primary Key)
   - name
   - email
3. Use appropriate JPA annotations

## Expected Outcome

- Table `students` should be created automatically
- Data should be stored in database

---

# 🧩 Exercise 2: Create Repository and Perform CRUD

## Objective
Learn how to use Spring Data JPA repositories.

## Task

1. Create `StudentRepository` extending `JpaRepository`
2. Implement:
   - Save a student
   - Fetch all students
   - Delete a student by ID

## Expected Outcome

- CRUD operations should work via API

---

# 🧩 Exercise 3: Build REST APIs

## Objective
Expose database operations via REST endpoints.

## Task

Create APIs:

- POST `/students` → Create student
- GET `/students` → Get all students
- DELETE `/students/{id}` → Delete student

## Expected Outcome

- APIs should work via Postman
- Data should persist in DB

---

# 🧩 Exercise 4: Custom Query Methods

## Objective
Understand how to write query methods.

## Task

Add methods in repository:

- Find student by name
- Find students containing a keyword in email

Example:

```

findByName(String name)
findByEmailContaining(String keyword)

```

## Expected Outcome

- APIs should return filtered data

---

# 🧩 Exercise 5: Add Entity Relationship

## Objective
Understand relationships in JPA.

## Task

1. Create a `Course` entity:
   - id
   - courseName

2. Establish relationship:
   - One Student → Many Courses

3. Use:
   - `@OneToMany`
   - `@ManyToOne`

## Expected Outcome

- Courses linked to students
- Foreign key created in database

---

# 🧩 Exercise 6: Implement Fetch Types

## Objective
Understand LAZY vs EAGER loading.

## Task

1. Set relationship to LAZY loading
2. Fetch student data
3. Observe behavior when accessing courses

## Expected Outcome

- Courses should load only when accessed
- Understand performance impact

---

# 🧩 Exercise 7: Handle Common Issues

## Objective
Learn debugging in JPA.

## Task

1. Intentionally break:
   - Remove `@Transactional`
   - Access lazy data outside service
2. Observe errors
3. Fix them

## Expected Outcome

- Understand LazyInitializationException
- Learn correct usage of transactions

---

# 🧩 Exercise 8: Add Validation (Basic)

## Objective
Ensure data integrity.

## Task

1. Add validation:
   - name should not be empty
   - email should be valid
2. Use annotations like:
   - `@NotNull`
   - `@Email`

## Expected Outcome

- Invalid data should be rejected

---

# 🧩 Exercise 9: Logging (Bonus)

## Objective
Improve observability.

## Task

1. Add logs in service layer:
   - When saving student
   - When fetching data
2. Use proper log levels:
   - INFO
   - ERROR

## Expected Outcome

- Logs should appear in console

---

# 🧠 Reflection Questions

After completing exercises, think:

- Why do we use ORM instead of SQL?
- When should we use LAZY vs EAGER?
- What happens if relationships are not mapped correctly?
- Why should controllers not directly access repositories?

---

# 🚀 Next Step

Once done, move to:

👉 `Quiz`

Test your understanding before starting the assignment.


---

# 🔥 Why this is strong

* Gradual progression (Entity → CRUD → API → Relationships → Debugging)
* Includes **intentional failure exercise** (very powerful learning)
* Connects to real backend thinking
* Reinforces testing mindset

---
