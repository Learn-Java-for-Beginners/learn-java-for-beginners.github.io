

# 📚 Study Material – Week 2

## Collections and Exception Handling

---

# Part 1 – Java Collections Framework (Deep Understanding)

---

## 1️⃣ Why Collections Are Core to Backend Engineering

In backend systems:

* APIs return `List<DTO>`
* Database queries return multiple rows
* Business logic filters and groups data
* Caches use `Map`
* Deduplication uses `Set`

You cannot build a real backend system without mastering collections.

This week is about **choosing the right data structure for the right problem**.

---

# 2️⃣ Collection Hierarchy Overview

![Image](https://miro.medium.com/1%2AqgcrVwo8qzF4muOQ-kKB8A.jpeg)

![Image](https://miro.medium.com/v2/resize%3Afit%3A1016/0%2Aro8i2-Co08aBSedb.png)

![Image](https://www.codejava.net/images/articles/javacore/collections/collections%20framework%20overview.png)

![Image](https://www.uml-diagrams.org/examples/java-7-concurrent-executors-uml-class-diagram-example.png)

### Core Interfaces:

* `Collection`

  * `List`
  * `Set`
  * `Queue`
* `Map` (separate hierarchy)

---

# 3️⃣ List Interface (Ordered Collection)

### Characteristics:

* Maintains insertion order
* Allows duplicates
* Index-based access

Used heavily when:

* Returning API responses
* Maintaining ordered logs
* Preserving query results

---

## 🔹 ArrayList

### Internal Structure:

* Backed by dynamic array
* Automatically resizes
* Capacity grows when needed

### Time Complexity:

| Operation      | Time           |
| -------------- | -------------- |
| get(index)     | O(1)           |
| add(end)       | O(1) amortized |
| insert(middle) | O(n)           |
| remove(middle) | O(n)           |

### Example:

```java
List<String> names = new ArrayList<>();
names.add("Aditya");
names.add("Riya");
names.add("Aditya");
```

### When to Use:

* Read-heavy operations
* Random access required

---

## 🔹 LinkedList

### Internal Structure:

* Doubly linked list
* Each element stores pointer to next & previous

### Time Complexity:

| Operation  | Time |
| ---------- | ---- |
| get(index) | O(n) |
| insert     | O(1) |
| remove     | O(1) |

### When to Use:

* Frequent insert/delete
* Rare random access

⚠️ In backend systems, `ArrayList` is far more common.

---

# 4️⃣ Set Interface (No Duplicates)

### Characteristics:

* No duplicate values
* Usually unordered

Used when:

* Ensuring uniqueness
* Avoiding duplicate entries
* Validating unique inputs

---

## 🔹 HashSet

### Internally:

* Backed by HashMap
* Uses hashing
* Very fast lookup

### Example:

```java
Set<String> emails = new HashSet<>();
emails.add("a@test.com");
emails.add("a@test.com"); // ignored
```

---

## 🔹 LinkedHashSet

* Maintains insertion order
* Slightly slower than HashSet

---

## 🔹 TreeSet

* Sorted order
* Backed by Red-Black Tree
* O(log n) operations

Used when:

* You need sorted unique elements

---

# 5️⃣ Map Interface (Key-Value Storage)

Maps are used heavily in backend caching and indexing.

---

## 🔹 HashMap

### Internal Working (High-Level):

1. Key’s `hashCode()` is computed
2. Bucket index determined
3. Collision handled using linked list or tree (Java 8+)

### Time Complexity:

| Operation | Time |
| --------- | ---- |
| put       | O(1) |
| get       | O(1) |
| remove    | O(1) |

---

### Example:

```java
Map<Integer, String> students = new HashMap<>();
students.put(1, "Aditya");
students.put(2, "Riya");
```

---

## 🔹 LinkedHashMap

* Maintains insertion order
* Used in LRU caches

---

## 🔹 TreeMap

* Sorted by key
* O(log n)

---

## 🔹 ConcurrentHashMap

* Thread-safe
* Used in multithreaded backend systems

---

# 6️⃣ equals() and hashCode() – Critical for Hash-Based Collections

When storing custom objects in:

* HashSet
* HashMap
* LinkedHashSet

You must override:

* `equals()`
* `hashCode()`

---

## Why?

Hash-based collections:

1. Use `hashCode()` to find bucket
2. Use `equals()` to compare objects

If not overridden properly:

* Duplicate objects may appear
* Lookups may fail

---

## Correct Implementation Example

```java
@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Student)) return false;
    Student s = (Student) o;
    return id == s.id;
}

@Override
public int hashCode() {
    return Objects.hash(id);
}
```

---

# 7️⃣ Java 8 Streams

Streams allow functional-style data processing.

---

## Stream Pipeline

1. Source
2. Intermediate operations
3. Terminal operation

---

### Example:

```java
List<Student> filtered =
    students.stream()
            .filter(s -> s.getMarks() > 80)
            .sorted(Comparator.comparing(Student::getName))
            .collect(Collectors.toList());
```

---

## Common Operations:

* filter()
* map()
* collect()
* sorted()
* distinct()
* count()
* anyMatch()
* allMatch()

Streams improve readability and reduce boilerplate loops.

---

# Part 2 – Exception Handling (Professional Level)

---

# 1️⃣ Why Exception Handling Is Essential

In production systems:

* DB connections fail
* APIs timeout
* Inputs are invalid
* Null values appear

If exceptions are not handled:

* System crashes
* Data corruption
* Bad user experience

---

# 2️⃣ Exception Hierarchy

![Image](https://miro.medium.com/1%2AdK0sEcnhdaCxjkLuI1N4zQ.jpeg)

![Image](https://miro.medium.com/1%2Ajd1wo9joMCehuDqAdZ5m6A.png)

![Image](https://ik.imagekit.io/upgrad1/abroad-images/imageCompo/images/ExceptionHierarchy_in_JavaVOEECE.png?pr-true=)

![Image](https://miro.medium.com/0%2AmogvrUR71FKNSF39.jpeg)

---

### Throwable

* Error (Serious problems)
* Exception (Recoverable)

---

## Checked Exceptions

Must be handled or declared.

Example:

* IOException
* SQLException

Used when:

* External systems involved
* File handling
* Network operations

---

## Unchecked Exceptions (RuntimeException)

Not mandatory to handle.

Examples:

* NullPointerException
* IllegalArgumentException
* IndexOutOfBoundsException

Used when:

* Programming mistakes
* Invalid logic

---

# 3️⃣ Try-Catch-Finally Deep Dive

```java
try {
    validateStudent(student);
} catch (InvalidStudentException e) {
    log.error("Validation failed", e);
} finally {
    cleanup();
}
```

### finally block:

Always executes (except JVM crash).

---

# 4️⃣ Throw vs Throws

### throw

Used to explicitly throw exception.

### throws

Declares that method may throw exception.

---

# 5️⃣ Custom Exceptions (Domain-Level)

In backend systems, create meaningful exceptions.

Example:

```java
public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String message) {
        super(message);
    }
}
```

Use when:

* Entity missing
* Business rule violated

---

# 6️⃣ Best Practices in Backend Exception Handling

* Never catch generic `Exception` blindly
* Do not swallow exceptions
* Always log important errors
* Provide meaningful error messages
* Separate business exceptions from system exceptions
* Fail fast for invalid input

---

# 7️⃣ Common Mistakes

❌ Not overriding equals & hashCode
❌ Using List when Set is required
❌ Catching Exception without logging
❌ Throwing generic RuntimeException everywhere
❌ Ignoring edge cases

---

# 8️⃣ Real Backend Scenario

You will implement:

* Store students in List
* Maintain unique IDs in Set
* Map ID → Student using HashMap
* Use Stream to filter top scorers
* Throw StudentNotFoundException if missing
* Handle invalid inputs properly

This simulates real backend service logic.

---

# 🎯 Learning Outcome of This Week

After completing this study material, you should:

* Understand internal working of major collections
* Select correct data structure for problem
* Write hash-safe objects
* Use Streams fluently
* Design and throw custom exceptions
* Handle runtime failures gracefully

---

# 🔥 Mentor Advice

Mastering collections is mastering backend memory design.

Mastering exceptions is mastering backend stability.

This week builds engineering maturity.

---
