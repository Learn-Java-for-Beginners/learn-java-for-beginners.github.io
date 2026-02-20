

# 🧠 Week 2 – Quiz

## Collections and Exception Handling

---

# 🔹 Section A – Conceptual Questions

---

### 1️⃣ What is the main difference between List and Set?

* When would you prefer Set over List in backend development?

---

### 2️⃣ Why is `HashMap` generally faster than `TreeMap`?

Explain in terms of internal data structure and time complexity.

---

### 3️⃣ What happens if you override `equals()` but NOT `hashCode()`?

Explain what issue can occur when using:

* HashSet
* HashMap

---

### 4️⃣ When should you use:

* ArrayList
* LinkedList
* HashSet
* TreeSet

Give one practical backend example for each.

---

### 5️⃣ What is the difference between checked and unchecked exceptions?

Give 2 examples of each.

---

### 6️⃣ Why should we avoid catching generic `Exception`?

What problem does it create in production systems?

---

# 🔹 Section B – Output Prediction

---

### 7️⃣ What will be the output?

```java
List<String> list = new ArrayList<>();
list.add("A");
list.add("B");
list.add("A");

System.out.println(list.size());
```

---

### 8️⃣ What will be the output?

```java
Set<Integer> set = new HashSet<>();
set.add(10);
set.add(20);
set.add(10);

System.out.println(set);
```

Explain why.

---

### 9️⃣ What will be the output?

```java
Map<String, Integer> map = new HashMap<>();
map.put("A", 1);
map.put("B", 2);
map.put("A", 5);

System.out.println(map.get("A"));
```

---

### 🔟 What happens here?

```java
List<Integer> numbers = List.of(10, 20, 30);
numbers.add(40);
```

What exception will be thrown and why?

---

### 1️⃣1️⃣ What will be printed?

```java
try {
    int result = 10 / 0;
} catch (Exception e) {
    System.out.println("Error occurred");
} finally {
    System.out.println("Finished");
}
```

---

# 🔹 Section C – Code Analysis

---

### 1️⃣2️⃣ Identify the Problem

```java
class Student {
    int id;
    String name;
}
```

```java
Set<Student> students = new HashSet<>();

students.add(new Student(1, "A"));
students.add(new Student(1, "A"));

System.out.println(students.size());
```

Why might this print 2 instead of 1?

How do you fix it?

---

### 1️⃣3️⃣ What is wrong with this code?

```java
try {
    String name = null;
    System.out.println(name.length());
} catch (Exception e) {
}
```

Why is this bad practice?

---

### 1️⃣4️⃣ Spot the Logical Issue

```java
Map<Integer, String> map = new HashMap<>();

if (!map.containsKey(1)) {
    System.out.println(map.get(1));
}
```

What will be printed?

Is this correct logic?

---

# 🔹 Section D – Streams

---

### 1️⃣5️⃣ What will this print?

```java
List<Integer> numbers = List.of(1, 2, 3, 4, 5);

numbers.stream()
       .filter(n -> n % 2 == 0)
       .map(n -> n * 2)
       .forEach(System.out::println);
```

---

### 1️⃣6️⃣ What is wrong here?

```java
List<String> names = List.of("A", "B", "C");

names.stream()
     .filter(name -> name.equals("B"));
```

Why does this not produce any output?

---

# 🔹 Section E – Scenario-Based (Backend Thinking)

---

### 1️⃣7️⃣ You are storing user emails in a collection.

Users must not register with duplicate email.

Which collection would you use and why?

---

### 1️⃣8️⃣ You are implementing a simple in-memory cache.

Which Map implementation would you choose?

What would change if multiple threads access it?

---

### 1️⃣9️⃣ You are building an API:

```java
getStudentById(int id)
```

If student is not found:

* Should you return null?
* Or throw custom exception?

Explain your reasoning.

---

### 2️⃣0️⃣ You are processing a list of 10,000 students and filtering top scorers.

Which approach is better?

* Traditional for-loop
* Stream API

Explain based on readability and maintainability.

---

# 🔥 Bonus Challenge (Advanced Thinking)

---

### 2️⃣1️⃣ Why is HashMap not thread-safe?

What problems may occur if two threads modify it simultaneously?

---

### 2️⃣2️⃣ What is the difference between:

* `map.keySet()`
* `map.entrySet()`

Which is more efficient and why?

---

# 🏆 Self-Evaluation Checklist

After attempting this quiz, you should confidently:

☐ Explain List vs Set vs Map
☐ Predict behavior of HashSet and HashMap
☐ Understand equals & hashCode importance
☐ Handle exceptions correctly
☐ Use Streams logically
☐ Think like a backend engineer

---

