---
layout: default
title: Review Checklist
parent: Week 1 - Java Basics
nav_order: 4
---

# Week 1 – Review Checklist

## Java Fundamentals and OOP Foundations

> This document is used during the weekly review session.
> The goal is improvement, not criticism.
> Be honest and objective.

---

# 🧠 Section 1 – Conceptual Understanding

Ask the mentee to explain without looking at notes.

| Question                            | Clear | Partial | Weak |
| ----------------------------------- | ----- | ------- | ---- |
| What is encapsulation?              | ☐     | ☐       | ☐    |
| Why should fields be private?       | ☐     | ☐       | ☐    |
| Difference between class and object | ☐     | ☐       | ☐    |
| Primitive vs Reference types        | ☐     | ☐       | ☐    |
| What does static mean?              | ☐     | ☐       | ☐    |
| Why validate in constructor?        | ☐     | ☐       | ☐    |

Notes:

```
Add comments here during review
```

---

# 🔎 Section 2 – Code Quality Review

Open the Pull Request and verify:

---

## 1️⃣ Encapsulation

* ☐ All fields are private
* ☐ No unnecessary public setters
* ☐ Object state cannot be modified externally
* ☐ Constructor enforces valid state

---

## 2️⃣ Validation

* ☐ Null checks implemented
* ☐ Empty string validation
* ☐ Age boundary validated
* ☐ Email basic validation done
* ☐ Exceptions are meaningful

---

## 3️⃣ Clean Code

* ☐ Meaningful variable names
* ☐ No long methods (>30 lines)
* ☐ Proper indentation
* ☐ No duplicate code
* ☐ One class per file

---

## 4️⃣ Design Structure

* ☐ Model separated from printing logic
* ☐ No logic inside main() except orchestration
* ☐ Proper package structure
* ☐ Clear separation of responsibilities

---

## 5️⃣ Defensive Thinking

* ☐ Invalid object creation prevented
* ☐ No public mutable fields
* ☐ No silent failures
* ☐ Proper try-catch used in main

---

# 🐞 Section 3 – Live Debugging (During Review)

Ask the mentee to:

1. Introduce a bug intentionally.
2. Use debugger to identify issue.
3. Fix it.

Evaluate:

* ☐ Can set breakpoints
* ☐ Can inspect variables
* ☐ Can explain stack trace
* ☐ Understands exception message

Notes:

```
Add debugging observations here
```

---

# 🏗 Section 4 – Design Thinking Questions

Ask verbally:

1. What happens if someone removes validation?
2. Why should balance not have setter?
3. When should inheritance be used?
4. Why separate StudentPrinter?
5. If this project grows to 10,000 students, what changes?

Evaluate thinking depth:

* ☐ Surface level
* ☐ Logical
* ☐ Engineering mindset

---

# 📊 Section 5 – Scoring Rubric

| Category                      | Score (Out of 10) |
| ----------------------------- | ----------------- |
| Concept Clarity               | ___               |
| Encapsulation Discipline      | ___               |
| Validation & Defensive Coding | ___               |
| Clean Code Practices          | ___               |
| Design Thinking               | ___               |

Total: ___ / 50

---

# 📈 Progress Evaluation

| Area                   | Needs Improvement | Good | Strong |
| ---------------------- | ----------------- | ---- | ------ |
| OOP Basics             | ☐                 | ☐    | ☐      |
| Constructor Discipline | ☐                 | ☐    | ☐      |
| Input Validation       | ☐                 | ☐    | ☐      |
| Code Organization      | ☐                 | ☐    | ☐      |
| Debugging Ability      | ☐                 | ☐    | ☐      |

---

# 🧠 Mentor Reflection (For You)

After review, note:

* Where did she struggle?
* Was hesitation conceptual or confidence-based?
* Did she think defensively?
* Is she writing code like a student or engineer?
* Does she understand why, not just how?

Add notes:

```
Mentor private observations
```

---

# 🎯 Week 1 Readiness Check

Before moving to Week 2, she must:

* ✔ Comfortably create structured classes
* ✔ Understand private vs public deeply
* ✔ Validate inputs properly
* ✔ Avoid invalid object states
* ✔ Explain OOP in her own words
* ✔ Debug simple programs

If not, extend Week 1 by 2–3 days.

Strong foundation is non-negotiable.

---

# 🚀 End of Review Outcome

After this review, she should:

* Understand her mistakes
* Know improvement areas
* Feel encouraged
* Feel structured
* Feel guided

---

