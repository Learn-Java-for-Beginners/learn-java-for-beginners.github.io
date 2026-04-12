---
layout: default
title: Quiz - JPA and Hibernate
parent: Week 6 - JPA and Hibernate
nav_order: 3
---

# 📝 Quiz – JPA and Hibernate

This quiz will help you evaluate your understanding of JPA and Hibernate.

👉 Attempt all questions without referring to notes.

---

# 🧠 Section 1: Conceptual Questions

### Q1. What is ORM? Why is it used?

---

### Q2. What is the difference between JPA and Hibernate?

---

### Q3. What does `@Entity` annotation do?

---

### Q4. What is the purpose of `@Id` and `@GeneratedValue`?

---

### Q5. What is the role of `JpaRepository`?

---

### Q6. What is the difference between `save()` and `saveAndFlush()`?

---

### Q7. What is FetchType.LAZY?

---

### Q8. When should you avoid using EAGER fetching?

---

### Q9. What is a transaction? Why is it important?

---

### Q10. Why should controllers not directly access repositories?

---

# 💻 Section 2: Code Understanding

### Q11. What will happen when this code runs?

```java
@Entity
public class Student {
    @Id
    private Long id;
    private String name;
}
````

👉 What is missing here?

---

### Q12. Identify the issue:

```java
@OneToMany
private List<Course> courses;
```

---

### Q13. What is wrong with this mapping?

```java
@ManyToOne
private Student student;
```

---

### Q14. Predict the issue:

```java
@OneToMany(fetch = FetchType.LAZY)
private List<Course> courses;
```

Accessed outside service layer.

---

### Q15. What does this method do?

```java
List<Student> findByEmailContaining(String keyword);
```

---

# 🧩 Section 3: Scenario-Based Questions

### Q16. You are fetching a Student and its Courses, but performance is slow. What could be the issue?

---

### Q17. You get a `LazyInitializationException`. Why does it occur?

---

### Q18. You need to store multiple courses for a student. Which relationship will you use?

---

### Q19. You want to ensure email is always valid before saving. What will you do?

---

### Q20. Your API is exposing database entities directly. Why is this a bad practice?

---

# 🔍 Section 4: Debug Thinking

### Q21. Your application is not creating tables automatically. What could be wrong?

---

### Q22. Data is not saving in database even after calling `save()`. What could be the issue?

---

### Q23. Duplicate records are being inserted. What might be missing?

---

### Q24. You are seeing too many SQL queries in logs. What problem is this?

---

### Q25. Your API crashes when fetching relationships. What should you check?

---

# 🧠 Self-Evaluation

After completing the quiz:

* Did you understand relationships clearly?
* Can you explain LAZY vs EAGER confidently?
* Are you comfortable with repositories?
* Can you debug common JPA issues?

---

# 🚀 Next Step

Proceed to:

👉 `Assignment`

This is where you apply everything in a real backend scenario.



---

# 🔥 Why this quiz is strong

- Covers **concept + code + real-world issues**
- Includes **debugging mindset** (critical for backend engineers)
- Prepares her for real project work
- Identifies weak areas before assignment

---
