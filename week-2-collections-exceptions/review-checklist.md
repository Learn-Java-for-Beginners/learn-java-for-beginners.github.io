

# 📋 Week 2 – Review Checklist

## Collections and Exception Handling

---

# 🎯 Review Objective

This checklist will be used during the weekly review session to evaluate:

* Concept clarity
* Collection usage correctness
* Exception design
* Code quality
* Backend thinking maturity

This is not just about working code — it is about engineering reasoning.

---

# 🔹 1️⃣ Concept Understanding (Discussion Round)

Ask verbally during review:

☐ Can you explain the difference between List, Set, and Map?
☐ When would you choose ArrayList over LinkedList?
☐ Why does HashSet require equals() and hashCode()?
☐ What happens if hashCode is not overridden properly?
☐ What is the difference between checked and unchecked exceptions?
☐ Why should we avoid catching generic Exception?
☐ Why use Streams instead of loops?

Score ( /10 ): _______

---

# 🔹 2️⃣ Collection Usage Review

### Data Structure Selection

☐ List used appropriately for ordered data
☐ Set used correctly to prevent duplicates
☐ Map used for fast lookup
☐ No unnecessary data structure usage

### Efficiency Thinking

☐ Avoided unnecessary nested loops
☐ Used Map instead of iterating List for lookup
☐ Proper time complexity reasoning explained

Score ( /10 ): _______

---

# 🔹 3️⃣ equals() and hashCode() Implementation

If custom objects used:

☐ equals() correctly overridden
☐ hashCode() correctly overridden
☐ Consistency between equals and hashCode maintained
☐ Logical identity based on meaningful fields (e.g., id)

Ask:

> Why did you choose this field for equality?

Score ( /10 ): _______

---

# 🔹 4️⃣ Stream Usage Review

☐ Stream pipeline is readable
☐ filter() used correctly
☐ sorted() used appropriately
☐ collect() used properly
☐ No unnecessary stream chaining

Ask:

> Why did you choose Stream instead of loop here?

Score ( /10 ): _______

---

# 🔹 5️⃣ Exception Handling Review

### Custom Exceptions

☐ Meaningful exception class names
☐ Extends RuntimeException appropriately
☐ Clear and helpful error messages

### Usage

☐ Exceptions thrown at correct place
☐ No silent exception swallowing
☐ No unnecessary try-catch blocks
☐ Proper handling in main()

Ask:

> Why throw exception instead of returning null?

Score ( /10 ): _______

---

# 🔹 6️⃣ Edge Case Handling

☐ Duplicate student handled
☐ Invalid marks handled
☐ Removing non-existing student handled
☐ Empty collection handled
☐ Null checks considered

Ask:

> What happens if no students exist and average is calculated?

Score ( /10 ): _______

---

# 🔹 7️⃣ Code Quality & Cleanliness

☐ Proper naming conventions
☐ No long methods (>30 lines)
☐ Proper indentation
☐ Meaningful variable names
☐ No commented-out dead code
☐ Separation of concerns (Service vs Main)

Ask:

> Can this method be simplified?

Score ( /10 ): _______

---

# 🔹 8️⃣ Backend Thinking Maturity

Observe:

☐ Thinks about performance
☐ Explains design choices confidently
☐ Justifies data structure decisions
☐ Handles unexpected input logically
☐ Understands production implications

Score ( /10 ): _______

---

# 📊 Overall Score Sheet

| Category           | Score   |
| ------------------ | ------- |
| Concept Clarity    | ___ /10 |
| Collection Usage   | ___ /10 |
| equals/hashCode    | ___ /10 |
| Streams            | ___ /10 |
| Exception Handling | ___ /10 |
| Edge Cases         | ___ /10 |
| Code Quality       | ___ /10 |
| Backend Thinking   | ___ /10 |

**Total: ____ /80**

---

# 🧠 Reflection Questions (Ask at End)

1. What was hardest this week?
2. What concept is still unclear?
3. Which part did you enjoy most?
4. If this was production code, what would you improve?

---

# 🚩 Common Red Flags to Watch

⚠️ Using List when Map is required
⚠️ Catching Exception without handling
⚠️ Not overriding hashCode
⚠️ Using Stream without understanding
⚠️ No validation for input
⚠️ Fear when explaining design

---

# 🎯 Mentor Decision

Based on performance:

☐ Ready for Week 3
☐ Needs reinforcement
☐ Repeat key exercises
☐ Provide additional mini-task

---

# 🔥 Mentor Advice (For You, Aditya)

During review:

* Let her speak 60% of the time
* Ask “why” frequently
* Encourage reasoning, not memorization
* Don’t fix immediately — guide

The goal is not correctness.
The goal is engineering thinking.

---
