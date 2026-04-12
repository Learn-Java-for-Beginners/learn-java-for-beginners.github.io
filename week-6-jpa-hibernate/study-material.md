---
layout: default
title: Study Material - JPA and Hibernate
parent: Week 6 - JPA and Hibernate
nav_order: 1
---

# 📖 Study Material – JPA and Hibernate

Welcome to Week 6. In this module, you will learn how backend applications interact with databases using **JPA and Hibernate**.

---

# 🧠 1. What is ORM (Object Relational Mapping)?

In Java, we work with **objects**.  
In databases, data is stored in **tables**.

ORM helps us map:

| Java | Database |
|------|----------|
| Class | Table |
| Object | Row |
| Field | Column |

Without ORM:
- You write SQL manually
- You map data manually

With ORM:
- Java objects are automatically mapped to database tables
- You focus on business logic instead of SQL

---

# 🧩 2. What is JPA?

**JPA (Java Persistence API)** is a specification.

It defines:
- How Java objects should be mapped to database tables
- Standard annotations
- APIs for persistence

👉 JPA itself does NOT implement anything.

---

# ⚙️ 3. What is Hibernate?

**Hibernate** is the most popular implementation of JPA.

It provides:
- Actual ORM functionality
- Query execution
- Caching
- Transaction handling

👉 In simple terms:
- JPA = Rules
- Hibernate = Implementation

---

# 🏗 4. Basic JPA Setup in Spring Boot

Spring Boot simplifies everything.

Add dependency:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
````

Database configuration (`application.properties`):

```
spring.datasource.url=jdbc:mysql://localhost:3306/testdb
spring.datasource.username=root
spring.datasource.password=password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

# 🧱 5. Creating an Entity

An entity represents a table in the database.

Example:

```java
import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    // Getters and Setters
}
```

---

## 🔑 Important Annotations

* `@Entity` → Marks class as database entity
* `@Table` → Specifies table name
* `@Id` → Primary key
* `@GeneratedValue` → Auto-generates ID

---

# 📦 6. Repository Layer

Spring Data JPA provides ready-to-use repository interfaces.

```java
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
```

---

## 🔥 What You Get Automatically

Without writing any code, you get:

* save()
* findById()
* findAll()
* deleteById()

---

# 🔁 7. CRUD Operations

Example Service:

```java
@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public Student save(Student student) {
        return repository.save(student);
    }

    public List<Student> getAll() {
        return repository.findAll();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
```

---

# 🔗 8. Entity Relationships

Real-world data is connected.

---

## 🔹 One-to-Many

Example:

* One Student → Many Courses

```java
@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
private List<Course> courses;
```

---

## 🔹 Many-to-One

```java
@ManyToOne
@JoinColumn(name = "student_id")
private Student student;
```

---

## 🔹 One-to-One

```java
@OneToOne
@JoinColumn(name = "profile_id")
private Profile profile;
```

---

# ⚡ 9. Fetch Types

Defines when data is loaded.

---

## 🔹 EAGER

* Loads data immediately
* Can impact performance

---

## 🔹 LAZY

* Loads data only when needed
* Recommended in most cases

```java
@OneToMany(fetch = FetchType.LAZY)
```

---

# ⚠️ 10. Common Pitfalls

### ❌ LazyInitializationException

Occurs when:

* Session is closed
* Lazy data accessed outside transaction

---

### ❌ N+1 Query Problem

Too many queries executed unnecessarily.

---

### ❌ Missing Transactions

Always ensure service methods are transactional when needed.

---

# 🔍 11. Query Methods

Spring Data JPA allows custom queries using method names.

```java
List<Student> findByName(String name);
List<Student> findByEmailContaining(String keyword);
```

---

# 🧪 12. Testing APIs

Use Postman:

* POST → Create student
* GET → Fetch students
* DELETE → Remove student

---

# 🧱 13. Layered Architecture

Follow this structure:

```
Controller → Service → Repository → Database
```

Never:

* Access repository directly from controller
* Mix business logic in controller

---

# 💡 14. Best Practices

* Use DTOs (Do not expose entities directly)
* Keep entities simple
* Avoid bidirectional relationships unless needed
* Use LAZY fetching
* Write clean repository methods
* Handle exceptions properly

---

# 🧠 Summary

In this module, you learned:

* What ORM is
* Difference between JPA and Hibernate
* How to create entities
* How to use repositories
* How to implement relationships
* How backend applications persist data

---

# 🚀 What’s Next?

Proceed to:

👉 `Exercises`

Practice is critical for mastering JPA and Hibernate.


---

# 🔥 Why this is effective

- Progressive learning (concept → code → pitfalls → best practices)
- Avoids overwhelming theory
- Includes real-world warnings (very important for beginners)
- Prepares her for assignment + review

---
