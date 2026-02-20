
---
layout: default
title: Exercises
parent: Week 2 - Collections & Exceptions
nav_order: 2
---

# 🧪 Week 2 – Exercises

## Collections and Exception Handling

---

# 🔹 Section A – List Exercises (Foundation)

---

## 1️⃣ Basic List Operations

Create a `List<String>` and:

* Add 5 names
* Remove one name
* Print all names using:

  * for loop
  * enhanced for loop
  * stream

---

## 2️⃣ Find Duplicates in List

Given:

```java
List<String> names = List.of("A", "B", "A", "C", "B");
```

Write logic to:

* Identify duplicate values
* Store duplicates in a `Set`

---

## 3️⃣ Reverse a List

Given a list of integers:

```java
List<Integer> numbers = List.of(10, 20, 30, 40);
```

Reverse it without using built-in reverse methods.

---

## 4️⃣ Filter Using Streams

Given a list of integers:

```java
List<Integer> numbers = List.of(5, 10, 15, 20, 25);
```

Use Streams to:

* Filter numbers > 15
* Square all numbers
* Count even numbers

---

## 5️⃣ Sort a List of Objects

Create a `Student` class with:

* id
* name
* marks

Create a list of students and:

* Sort by name
* Sort by marks (descending)
* Use both Comparator and Streams

---

# 🔹 Section B – Set Exercises (Uniqueness & Hashing)

---

## 6️⃣ Remove Duplicates from List

Given:

```java
List<Integer> numbers = List.of(1, 2, 3, 2, 4, 1);
```

Convert it to a `Set` and remove duplicates.

Then convert back to a `List`.

---

## 7️⃣ HashSet with Custom Object

Create a `Student` class and:

* Add 3 students to a HashSet
* Add duplicate student (same id)
* Observe behavior

Then:

* Override `equals()` and `hashCode()`
* Test again

Explain the difference.

---

## 8️⃣ Compare HashSet vs LinkedHashSet

Insert values:

```
10, 5, 20, 1
```

Store in:

* HashSet
* LinkedHashSet

Print both and compare order.

---

## 9️⃣ Use TreeSet

Store numbers:

```
50, 10, 40, 20
```

Observe sorted order.

Then:

* Store custom Student objects in TreeSet
* Implement Comparable

---

# 🔹 Section C – Map Exercises (Key-Value Thinking)

---

## 🔟 Basic Map Usage

Create a `HashMap<Integer, String>`:

* Add 5 entries
* Update one value
* Remove one key
* Iterate using:

  * entrySet()
  * keySet()

---

## 1️⃣1️⃣ Count Word Frequency

Given:

```java
String sentence = "java is powerful and java is fast";
```

Use `HashMap` to count frequency of each word.

Expected output:

```
java -> 2
is -> 2
powerful -> 1
and -> 1
fast -> 1
```

---

## 1️⃣2️⃣ Find First Non-Repeating Character

Given:

```
"programming"
```

Use Map to find first non-repeating character.

---

## 1️⃣3️⃣ Group Students by Marks

Given list of students:

* Group students by marks using `Map<Integer, List<Student>>`
* Use Streams `Collectors.groupingBy()`

---

## 1️⃣4️⃣ Implement Simple Cache

Create a simple cache using `HashMap`:

* put(key, value)
* get(key)
* remove(key)

Add logging for:

* Cache hit
* Cache miss

---

# 🔹 Section D – Streams (Functional Thinking)

---

## 1️⃣5️⃣ Find Top 3 Students

Given list of students:

* Sort by marks descending
* Return top 3
* Use Stream API only

---

## 1️⃣6️⃣ Check Conditions

Given list of students:

* Check if any student has marks < 35
* Check if all students passed (> 40)
* Count number of distinctions (> 80)

---

## 1️⃣7️⃣ Convert List to Map

Convert:

```
List<Student>
```

To:

```
Map<Integer, Student>
```

Where:

* Key = student id
* Value = Student object

---

# 🔹 Section E – Exception Handling

---

## 1️⃣8️⃣ Basic Exception Handling

Write code that:

* Takes two numbers
* Divides them
* Handles division by zero properly

---

## 1️⃣9️⃣ Custom Exception

Create:

```
InvalidMarksException
```

Throw exception if:

* Marks < 0
* Marks > 100

Test it with invalid input.

---

## 2️⃣0️⃣ StudentNotFoundException

In your Student Management system:

* Create method:

```
getStudentById(int id)
```

If student not found:

* Throw `StudentNotFoundException`

Handle it gracefully in calling method.

---

# 🔹 Bonus (Advanced Thinking)

(Optional for challenge)

* Implement thread-safe Map using `ConcurrentHashMap`
* Compare performance with HashMap
* Simulate 2 threads writing to Map

---

# 🎯 Outcome After Exercises

If you complete all exercises:

✔ You can choose correct collection
✔ You understand hashing deeply
✔ You can use Streams confidently
✔ You can design exception hierarchy
✔ You can think like backend engineer

---
