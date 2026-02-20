
These exercises are structured progressively:

* 🟢 Level 1 – Fundamentals
* 🟡 Level 2 – OOP Discipline
* 🔴 Level 3 – Engineering Thinking
* 🧠 Level 4 – Edge Case  and  Defensive Programming

This will push her from “student Java” to “backend mindset”.

---

# Week 1 – Exercises

## Java Fundamentals  and  OOP Discipline

> Complete all exercises in order.
> Do not skip levels.
> Follow clean code principles.
> Use Git commits properly.

---

# 🟢 Level 1 – Basic Structure  and  Syntax

---

## Exercise 1 – Create a Simple Class

Create a class called `Person` with:

* name (String)
* age (int)

Add:

* A constructor
* A method `displayDetails()` that prints details

### Requirements

✔ Use proper naming
✔ Do not use public fields
✔ Use encapsulation

---

## Exercise 2 – Constructor Validation

Modify the `Person` class:

* Age cannot be negative
* Name cannot be null or empty

If invalid → throw `IllegalArgumentException`.

Example:

```
Age cannot be negative
Name cannot be empty
```

---

## Exercise 3 – Object Creation

Create a `Main` class.

Inside `main()`:

* Create 3 Person objects
* Call displayDetails()
* Test invalid data

Observe behavior.

---

# 🟡 Level 2 – OOP Strengthening

---

## Exercise 4 – Create a Student Class

Create a class `Student` with:

* studentId (String)
* name (String)
* age (int)

Requirements:

✔ All fields private
✔ Constructor mandatory
✔ Getter methods
✔ Validation in constructor
✔ Method: `isAdult()` (returns boolean)

---

## Exercise 5 – Inheritance

Create a class `GraduateStudent` that extends `Student`.

Add:

* specialization (String)

Add a method:

```
printSpecialization()
```

Demonstrate polymorphism in `main()`.

---

## Exercise 6 – Method Overriding

Override `displayDetails()` in `GraduateStudent`.

Call:

```java
Student s = new GraduateStudent(...);
s.displayDetails();
```

Observe output.

---

# 🔴 Level 3 – Engineering Thinking

---

## Exercise 7 – BankAccount Class

Create a class `BankAccount`:

Fields:

* accountNumber
* accountHolder
* balance

Rules:

✔ balance cannot be negative
✔ deposit(double amount)
✔ withdraw(double amount)
✔ Cannot withdraw more than balance

Throw exception if withdrawal invalid.

---

## Exercise 8 – Prevent Invalid State

Modify `BankAccount`:

* balance should not be directly modifiable
* No setter for balance
* Only deposit/withdraw allowed

Question to think:

> Why should we not expose balance setter?

---

## Exercise 9 – Static Variable

Add a static variable:

```
private static int totalAccounts;
```

Increment it inside constructor.

Create 3 accounts and print total accounts.

Understand:

> Static belongs to class, not object.

---

# 🧠 Level 4 – Defensive Programming

---

## Exercise 10 – Null Safety

Create a class `Order`.

Fields:

* orderId
* amount
* customerName

Requirements:

✔ No null allowed
✔ amount must be > 0
✔ Use constructor validation

Try creating invalid object in main and observe behavior.

---

## Exercise 11 – Encapsulation Break Attempt

Try this:

1. Make fields public.
2. Modify balance directly.
3. Set negative balance.

Now revert to private fields.

Reflect:

> What problem did encapsulation solve?

Write answer in comments.

---

## Exercise 12 – Responsibility Separation

Currently, you may have printing logic inside your model class.

Refactor:

Create a new class:

```
StudentPrinter
```

Move printing logic there.

Why?

> Single Responsibility Principle (intro level)

---

# 🔍 Reflection Exercises (Write Answers in Comments)

1. Why should fields be private?
2. Why validate inside constructor?
3. What happens if withdraw() does not check balance?
4. When should inheritance be used?
5. What does static really mean?

---

# 🏗 Mini Project Task (Preparation for Assignment)

Using what you learned:

Start building:

## Simple Student Management System

Features for now:

* Add student
* Display student
* Validate input
* Prevent invalid object creation

Do NOT use collections yet.
Hardcode 3–4 objects manually.

We will improve in Week 2.

---

# 📌 Coding Rules for All Exercises

✔ Proper indentation
✔ No long methods (>30 lines)
✔ No public fields
✔ Meaningful names
✔ No code duplication
✔ Use packages properly
✔ One class per file

---

# 🧪 Testing Requirement (Manual)

For each class:

Test:

* Valid input
* Invalid input
* Edge cases
* Negative values
* Null values

Write observations in comments.

---

# 🎯 End Goal of Week 1 Exercises

After completing all exercises, you should:

* Be comfortable creating classes
* Understand encapsulation deeply
* Know why constructors matter
* Apply inheritance properly
* Think defensively
* Avoid public fields
* Write structured Java code

---

