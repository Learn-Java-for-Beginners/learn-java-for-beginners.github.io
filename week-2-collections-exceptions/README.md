

# 📘 Week 2 – Collections and Exceptions

---

## 🎯 Week Objective

This week focuses on two extremely important areas in backend development:

1. **Java Collections Framework**
2. **Exception Handling**

By the end of this week, you should:

* Understand how data is stored and managed in memory using collections
* Choose the correct collection based on use case
* Understand `equals()` and `hashCode()` importance
* Handle runtime errors gracefully
* Write custom exceptions
* Use Java 8 Streams for filtering and transformations

This week transitions you from “writing Java code” to “thinking like a backend developer”.

---

# 📦 Part 1 – Java Collections Framework

---

## 1️⃣ Why Collections Matter in Backend Development

In real backend systems:

* APIs return lists of objects
* Databases return collections of rows
* Services transform and filter data
* Data needs to be grouped, sorted, searched, cached

Collections are everywhere.

If you misuse them, performance suffers.

---

## 2️⃣ Overview of Collection Hierarchy

![Image](https://miro.medium.com/1%2AqgcrVwo8qzF4muOQ-kKB8A.jpeg)

![Image](https://miro.medium.com/v2/resize%3Afit%3A1016/0%2Aro8i2-Co08aBSedb.png)

![Image](https://www.codejava.net/images/articles/javacore/collections/collections%20framework%20overview.png)

![Image](https://www.uml-diagrams.org/thumbnails/java-7-concurrent-executors-uml-class-diagram-example.png)

### Core Interfaces:

* `Collection` (root interface)

  * `List`
  * `Set`
  * `Queue`

⚠️ `Map` is NOT part of Collection interface hierarchy.

---

# 📚 List Interface

### Characteristics:

* Ordered
* Allows duplicates
* Index-based access

### Common Implementations:

* `ArrayList`
* `LinkedList`

---

## ArrayList

### Internally:

* Backed by dynamic array
* Fast random access
* Slow insert/delete in middle

### Use When:

* Frequent reads
* Rare insertions in middle

Example:

```java
List<String> names = new ArrayList<>();
names.add("Aditya");
names.add("Rahul");
names.add("Aditya");  // duplicates allowed
```

---

## LinkedList

### Internally:

* Doubly linked list

### Use When:

* Frequent insertions/deletions
* Rare random access

---

### ⚠️ Interview-Level Understanding

| Operation     | ArrayList | LinkedList |
| ------------- | --------- | ---------- |
| Get by index  | O(1)      | O(n)       |
| Add at end    | O(1)      | O(1)       |
| Insert middle | O(n)      | O(1)       |

Backend engineers must choose based on usage pattern.

---

# 📚 Set Interface

### Characteristics:

* No duplicates
* Unordered (usually)

Common implementations:

* `HashSet`
* `LinkedHashSet`
* `TreeSet`

---

## HashSet

* Backed by HashMap
* No order guarantee
* Fast lookup

Important:
Uses `hashCode()` and `equals()`.

Example:

```java
Set<String> emails = new HashSet<>();
emails.add("a@test.com");
emails.add("a@test.com"); // ignored
```

---

## Why equals() and hashCode() Matter

If you store custom objects inside `HashSet` or `HashMap`, and do not override these methods, duplicates may not behave correctly.

Example:

```java
class Student {
    String name;
    int id;
}
```

Without overriding:
Two students with same id may still be treated as different.

Backend impact:

* Duplicate records
* Caching errors
* Memory waste

---

# 📚 Map Interface

### Characteristics:

* Key-value pairs
* Keys must be unique

Common implementations:

* `HashMap`
* `LinkedHashMap`
* `TreeMap`
* `ConcurrentHashMap`

---

## HashMap

* Fast lookup (O(1) average)
* Not thread-safe
* Allows one null key

Example:

```java
Map<Integer, String> studentMap = new HashMap<>();
studentMap.put(1, "Aditya");
studentMap.put(2, "Riya");
```

---

## Internal Working (High Level)

* Uses hashing
* Bucket structure
* Collision handling (Linked list / Tree in Java 8+)

Backend developers must understand this to avoid performance issues.

---

# ⚡ Java 8 Streams

Streams allow functional-style operations on collections.

Example:

```java
List<String> names = List.of("Aditya", "Riya", "Rahul");

List<String> filtered =
    names.stream()
         .filter(name -> name.startsWith("R"))
         .collect(Collectors.toList());
```

Common Stream Operations:

* filter()
* map()
* collect()
* sorted()
* distinct()
* count()

Streams are heavily used in modern backend systems.

---

# 🚨 Part 2 – Exception Handling

---

## 1️⃣ Why Exception Handling Is Critical

Backend systems must:

* Handle invalid input
* Handle database errors
* Handle null values
* Avoid crashing production systems

Good developers handle failures gracefully.

---

## 2️⃣ Exception Hierarchy

![Image](https://miro.medium.com/1%2AdK0sEcnhdaCxjkLuI1N4zQ.jpeg)

![Image](https://media.licdn.com/dms/image/v2/D4D12AQF0yLjQGK2C2w/article-cover_image-shrink_720_1280/article-cover_image-shrink_720_1280/0/1697864284432?e=2147483647\&t=oaGziOM6m0RhPdZoHFaDJ3ZHCfBBy2A0HcTmW7QK0v0\&v=beta)

![Image](https://miro.medium.com/1%2Ajd1wo9joMCehuDqAdZ5m6A.png)

![Image](https://i.sstatic.net/Rib78.png)

---

### Throwable

* Error
* Exception

---

## Checked Exceptions

Must be handled or declared.

Examples:

* IOException
* SQLException

---

## Unchecked Exceptions (RuntimeException)

Not required to handle.

Examples:

* NullPointerException
* IllegalArgumentException
* IndexOutOfBoundsException

---

# 3️⃣ Try-Catch-Finally

Example:

```java
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
} finally {
    System.out.println("Execution completed");
}
```

---

# 4️⃣ Custom Exceptions

In backend systems, we create domain-specific exceptions.

Example:

```java
public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String message) {
        super(message);
    }
}
```

Use when:

* Entity not found
* Invalid business rule
* Unauthorized operation

---

# 🧠 Best Practices for Backend

* Never swallow exceptions silently
* Always log important exceptions
* Use meaningful messages
* Don’t catch generic `Exception` unnecessarily
* Fail fast when required

---

# 🔥 Week 2 Practical Application

You will now enhance the project from Week 1:

### Add:

* Store students in List
* Prevent duplicate students using Set
* Use Map to store ID → Student
* Add filtering using Streams
* Throw custom exception when student not found

---

# 🏆 Expected Outcomes

By end of Week 2, you should be able to:

✔ Choose correct collection type
✔ Explain difference between List, Set, Map
✔ Override equals and hashCode correctly
✔ Use Streams confidently
✔ Write custom exceptions
✔ Handle runtime failures properly

---

# 📌 Mentor Note

This week is very important.

Most backend bugs happen because of:

* Wrong collection choice
* Poor exception handling
* Ignoring edge cases

Master this week and the rest becomes easier.

---


