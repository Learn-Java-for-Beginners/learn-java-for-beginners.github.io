---
layout: default
title: Review Checklist
parent: Week 3 - IO & Threads
nav_order: 5
---

# Week 3 – Mentor Review Checklist  
## File IO and Multithreading

This checklist will be used during the weekly review session.

The review focuses on:

- Concept clarity
- Code correctness
- Concurrency understanding
- Engineering thinking
- Debugging ability

---

# 🟢 Part 1 – Conceptual Understanding

Ask the learner to explain verbally:

☐ What is the difference between Byte Streams and Character Streams?  
☐ Why is BufferedReader preferred over FileReader?  
☐ What problem does try-with-resources solve?  
☐ What is serialization and when is it used?  
☐ What is a thread?  
☐ What is a race condition?  
☐ Why is Runnable preferred over extending Thread?  
☐ What does synchronized do internally?  
☐ What problem does ExecutorService solve?  

Evaluation Notes:

- Can explain clearly without reading notes
- Uses correct terminology
- Connects concepts to backend systems
- Understands practical implications

---

# 🟡 Part 2 – File IO Implementation Review

☐ Uses try-with-resources everywhere  
☐ No resource leaks  
☐ Proper exception handling implemented  
☐ File existence check handled  
☐ Invalid/corrupt data handled gracefully  
☐ No unnecessary file reopening  
☐ Clear separation of IO logic from business logic  
☐ Code is readable and clean  

Common Mistakes to Watch:

- Forgetting to close resources
- Catching generic Exception without handling
- Mixing IO logic inside model classes
- Hardcoding file paths

---

# 🟠 Part 3 – Concurrency Review

☐ Threads created correctly using start()  
☐ No direct call to run()  
☐ Shared state identified correctly  
☐ Race condition demonstrated clearly  
☐ Synchronization applied correctly  
☐ Synchronization not overused unnecessarily  
☐ Final count validated after threads finish  
☐ Proper thread join() used where necessary  

Discussion Points:

- Why was the result inconsistent before synchronization?
- What happens if synchronized is removed?
- How does synchronization affect performance?

---

# 🔴 Part 4 – ExecutorService Review

☐ Uses fixed thread pool correctly  
☐ Submits tasks properly  
☐ Executor shutdown properly called  
☐ No memory leak risk  
☐ Understands difference between manual threads and thread pools  

Ask:

- Why is thread pooling important in web servers?
- What happens if executor is not shutdown?

---

# 🔵 Part 5 – Debugging Skills

Live Debug Test:

☐ Can explain unpredictable counter behavior  
☐ Can identify race condition in code  
☐ Can fix thread safety issue  
☐ Can interpret stack trace  
☐ Can debug file not found error  

Observe:

- Confidence level
- Logical reasoning
- Calmness under debugging

---

# 🟣 Part 6 – Code Quality Evaluation

☐ Proper naming conventions  
☐ Methods are small and focused  
☐ No duplicate code  
☐ Meaningful log messages  
☐ Proper indentation  
☐ Clean class structure  
☐ Comments explain intent (not obvious code)  

Score (Optional):

| Category | Score (0–10) |
|-----------|--------------|
| IO Implementation |        |
| Concurrency Understanding |        |
| Debugging Skill |        |
| Code Quality |        |
| Explanation Clarity |        |

---

# 🧠 Backend Engineering Thinking

Ask deeper questions:

☐ Why is shared mutable state dangerous in backend systems?  
☐ How does Spring Boot handle concurrent HTTP requests?  
☐ Why are thread pools preferred in production systems?  
☐ When should you avoid multithreading?  

Look for:

- Systems-level thinking
- Awareness of production risks
- Understanding of performance implications

---

# 💬 Feedback Section

Strengths Observed:

- ______________________________________
- ______________________________________
- ______________________________________

Areas to Improve:

- ______________________________________
- ______________________________________
- ______________________________________

Action Items for Next Week:

- ______________________________________
- ______________________________________
- ______________________________________

---

# 🎯 Week 3 Readiness Check

Before moving to Week 4:

☐ Understands race conditions clearly  
☐ Can implement synchronized correctly  
☐ Can use ExecutorService confidently  
☐ Uses try-with-resources consistently  
☐ Can explain concurrency risks in backend systems  

If any of the above is unclear:

Revisit exercises before proceeding.

---

This week is important.

Understanding IO and concurrency prevents many real production issues.

Mastery here builds backend engineering maturity.
