

# Week 1 – Assignment

## Mini Project: Console-Based Student Management System (Phase 1)

---

# 🎯 Objective

Build a simple console-based Student Management System using pure Java (no collections yet).

This assignment focuses on:

* OOP fundamentals
* Encapsulation
* Constructor validation
* Clean code structure
* Defensive programming
* Separation of responsibility

This project will evolve in future weeks.

---

# 🏗 Project Requirements

You must implement the following classes:

---

# 1️⃣ Student Class

### Fields (All Must Be Private)

* studentId (String)
* name (String)
* age (int)
* email (String)

---

### Constructor Requirements

Constructor must:

* Validate studentId is not null or empty
* Validate name is not null or empty
* Validate age is >= 16
* Validate email contains "@"

If invalid → throw `IllegalArgumentException`

Example:

```
Age must be at least 16
Invalid email format
```

---

### Methods

* Getters for all fields
* `boolean isAdult()` → returns true if age >= 18
* Override `toString()` to print student details properly

Example output:

```
Student{id='S101', name='Riya', age=22, email='riya@email.com'}
```

---

# 2️⃣ StudentPrinter Class

Create a separate class:

```
StudentPrinter
```

It must:

* Have method `printStudent(Student student)`
* Print student details

Why separate class?

Because:

> Model class should not handle printing logic.

This introduces separation of concerns.

---

# 3️⃣ Main Class

Create a `Main` class with `main()` method.

---

## In main():

### Step 1 – Create 3 Valid Students

Example:

```
S101 – Riya – 22 – riya@email.com
S102 – Aman – 17 – aman@email.com
S103 – Kavya – 19 – kavya@email.com
```

---

### Step 2 – Print All Students

Use `StudentPrinter`.

---

### Step 3 – Test Validation

Try creating:

* Student with age < 16
* Student with invalid email
* Student with empty name

Wrap in try-catch and print error messages.

---

# 📦 Package Structure

Use proper package structure:

```
com.learnjava.week1.model
com.learnjava.week1.service
com.learnjava.week1
```

Example:

* Student → model
* StudentPrinter → service
* Main → root package

---

# 🧠 Engineering Constraints

You MUST:

✔ Use private fields
✔ Use constructor validation
✔ Avoid public setters (unless justified)
✔ Follow naming conventions
✔ Keep methods short
✔ One class per file
✔ No static abuse
✔ Proper indentation

---

# ❌ What You Must NOT Do

🚫 Do not make fields public
🚫 Do not skip validation
🚫 Do not write everything inside main()
🚫 Do not use collections yet
🚫 Do not hardcode print logic inside Student

---

# 🛡 Defensive Programming Expectations

You should handle:

* Null inputs
* Empty strings
* Invalid age
* Invalid email
* Object misuse attempts

Ask yourself:

> Can someone create an invalid student?

If yes → fix design.

---

# 🧪 Manual Testing Requirements

Test the following scenarios:

| Test Case     | Expected Result |
| ------------- | --------------- |
| Valid student | Object created  |
| Age < 16      | Exception       |
| Null name     | Exception       |
| Invalid email | Exception       |

Write test results in comments.

---

# 📊 Evaluation Criteria

| Category                     | Marks |
| ---------------------------- | ----- |
| Encapsulation                | /10   |
| Constructor Validation       | /10   |
| Clean Code                   | /10   |
| Separation of Responsibility | /10   |
| Defensive Programming        | /10   |

Total: /50

---

# 🌱 Future Evolution (Do Not Implement Yet)

This system will later:

* Use Collections (Week 2)
* Persist to file (Week 3)
* Convert to REST API (Week 5)
* Connect to database (Week 6)
* Add unit tests (Week 7)
* Dockerize (Week 8)

So design carefully.

---

# 🧠 Reflection Questions (Submit with PR)

Answer in a separate file `reflection.md`:

1. Why is constructor validation important?
2. Why did we avoid public setters?
3. Why separate StudentPrinter?
4. What happens if fields were public?
5. What design improvements would you suggest?

---

# 📌 Submission Process

1. Create feature branch:

   ```
   week-1-assignment
   ```
2. Commit properly:

   ```
   feat: implement student management system phase 1
   ```
3. Create Pull Request.
4. Add reflection answers.

---

# 🚀 End of Week Outcome

After completing this assignment, you should:

* Build structured Java classes
* Protect object state
* Validate inputs properly
* Understand separation of concerns
* Think defensively
* Follow clean coding standards

---

