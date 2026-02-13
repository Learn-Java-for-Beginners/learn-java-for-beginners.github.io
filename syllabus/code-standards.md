# Code Standards & Engineering Guidelines

This document defines the coding standards to be followed throughout the mentorship program.

The objective is to build professional engineering habits from the beginning.

Clean code is not optional — it is a core skill.

---

# 1. General Principles

- Write code for humans first, machines second.
- Clarity over cleverness.
- Simplicity over complexity.
- Consistency over creativity.
- Avoid premature optimization.

---

# 2. Naming Conventions

## Classes
- Use PascalCase
- Names should represent domain meaning

Examples:
- Student
- ExpenseService
- OrderController

Avoid:
- Data1
- TestClass
- MyObject

---

## Methods
- Use camelCase
- Method name should describe action

Good:
- calculateTotal()
- findStudentById()
- validateInput()

Bad:
- doStuff()
- run()
- process()

---

## Variables
- Meaningful and descriptive
- Avoid single-letter variables (except loop counters)

Good:
- totalAmount
- studentList
- isActive

Bad:
- t
- x
- data

---

# 3. Class Design Principles

## Single Responsibility Principle

Each class should have only one reason to change.

Bad:
A class handling:
- Database
- Business logic
- Logging
- Validation

Good:
Separate into:
- Controller
- Service
- Repository

---

## Avoid God Classes

If a class exceeds:
- 300 lines
- Multiple responsibilities

Refactor immediately.

---

# 4. Method Guidelines

- Keep methods small (ideally under 30 lines)
- One logical responsibility per method
- Avoid deep nesting (max 3 levels)
- Return early when possible

Example:

Bad:
Nested if-else blocks

Good:
Use guard clauses

---

# 5. Exception Handling Standards

- Do not swallow exceptions silently.
- Avoid empty catch blocks.
- Provide meaningful error messages.
- Use custom exceptions where appropriate.

Bad:
catch (Exception e) {
}

Good:
catch (IOException e) {
    throw new FileProcessingException("Failed to read file", e);
}

---

# 6. Logging Standards (When Introduced)

- Do not use System.out.println in production code.
- Use logging framework (when introduced).
- Log meaningful information.
- Never log sensitive data (passwords, secrets).

---

# 7. Code Formatting

- Proper indentation (4 spaces recommended)
- No trailing whitespace
- One class per file
- Consistent bracket placement

---

# 8. Comments

- Avoid obvious comments.

Bad:
int count = 0; // initialize count to 0

- Write comments to explain WHY, not WHAT.

Good:
// We use lazy loading here to avoid unnecessary database queries.

---

# 9. Hardcoded Values

Avoid magic numbers.

Bad:
if (age > 18)

Good:
private static final int MINIMUM_AGE = 18;

---

# 10. Null Handling

Always consider null safety.

Before accessing:
- Validate input
- Check for null
- Use Optional where appropriate (later stages)

---

# 11. Collections Usage

- Use interfaces instead of implementations

Good:
List<String> names = new ArrayList<>();

Bad:
ArrayList<String> names = new ArrayList<>();

---

# 12. Clean Architecture Structure (When Using Spring Boot)

Follow layered structure:

- Controller → Handles HTTP
- Service → Business logic
- Repository → Data access
- Entity → Database mapping
- DTO → Data transfer

Never:
- Put business logic in Controller
- Access database directly from Controller

---

# 13. Git Standards

- Commit frequently
- Write meaningful commit messages

Good:
Add validation for student email

Bad:
update
fix
changes

---

# 14. Testing Standards

- Write tests for business logic
- Cover positive and negative scenarios
- Tests should be readable
- One logical assertion per test (preferably)

---

# 15. Performance Awareness

Even in beginner stage:

- Avoid unnecessary loops
- Avoid repeated database calls
- Avoid heavy logic inside controllers

---

# 16. Continuous Improvement Rule

Each week code quality must improve.

Before pushing code:
- Review your own changes
- Ask: “Would I be proud to show this in an interview?”

---

# Mentor Expectation

By Week 4:
- Code should look structured.
By Week 6:
- Layered architecture must be clean.
By Week 8:
- Code should resemble production-ready backend service.

---

# Final Principle

Clean code is not about perfection.
It is about clarity, responsibility, and professionalism.

Engineering discipline begins with small habits.
