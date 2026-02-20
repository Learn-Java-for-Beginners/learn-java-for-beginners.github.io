

# ✅ Week 2 – Solutions

## Collections & Exception Handling

---

# 🔹 Section A – List Solutions

---

## 1️⃣ Basic List Operations

```java
import java.util.*;

public class ListBasicExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Aditya");
        names.add("Riya");
        names.add("Rahul");
        names.add("Sneha");
        names.add("Aman");

        names.remove("Rahul");

        // For loop
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        // Enhanced for loop
        for (String name : names) {
            System.out.println(name);
        }

        // Stream
        names.stream().forEach(System.out::println);
    }
}
```

---

## 2️⃣ Find Duplicates in List

```java
import java.util.*;

public class FindDuplicates {
    public static void main(String[] args) {
        List<String> names = List.of("A", "B", "A", "C", "B");

        Set<String> unique = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (String name : names) {
            if (!unique.add(name)) {
                duplicates.add(name);
            }
        }

        System.out.println("Duplicates: " + duplicates);
    }
}
```

---

## 3️⃣ Reverse a List

```java
import java.util.*;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(10, 20, 30, 40));

        for (int i = 0; i < numbers.size() / 2; i++) {
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(numbers.size() - 1 - i));
            numbers.set(numbers.size() - 1 - i, temp);
        }

        System.out.println(numbers);
    }
}
```

---

## 4️⃣ Filter Using Streams

```java
import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 10, 15, 20, 25);

        List<Integer> filtered = numbers.stream()
                .filter(n -> n > 15)
                .collect(Collectors.toList());

        List<Integer> squared = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        long evenCount = numbers.stream()
                .filter(n -> n % 2 == 0)
                .count();

        System.out.println(filtered);
        System.out.println(squared);
        System.out.println("Even count: " + evenCount);
    }
}
```

---

## 5️⃣ Sort List of Objects

```java
import java.util.*;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + " - " + marks;
    }
}

public class SortStudents {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Riya", 85));
        students.add(new Student(2, "Aditya", 90));
        students.add(new Student(3, "Rahul", 75));

        students.sort(Comparator.comparing(s -> s.name));
        students.forEach(System.out::println);

        students.sort(Comparator.comparingInt((Student s) -> s.marks).reversed());
        students.forEach(System.out::println);
    }
}
```

---

# 🔹 Section B – Set Solutions

---

## 6️⃣ Remove Duplicates

```java
List<Integer> numbers = List.of(1, 2, 3, 2, 4, 1);

Set<Integer> set = new HashSet<>(numbers);
List<Integer> uniqueList = new ArrayList<>(set);

System.out.println(uniqueList);
```

---

## 7️⃣ HashSet with Custom Object

Override equals & hashCode:

```java
import java.util.Objects;

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

## 8️⃣ HashSet vs LinkedHashSet

```java
Set<Integer> hashSet = new HashSet<>();
Set<Integer> linkedHashSet = new LinkedHashSet<>();

int[] values = {10, 5, 20, 1};

for (int v : values) {
    hashSet.add(v);
    linkedHashSet.add(v);
}

System.out.println(hashSet);
System.out.println(linkedHashSet);
```

---

## 9️⃣ TreeSet

```java
Set<Integer> treeSet = new TreeSet<>();
treeSet.add(50);
treeSet.add(10);
treeSet.add(40);
treeSet.add(20);

System.out.println(treeSet);
```

For custom object:

```java
class Student implements Comparable<Student> {
    int id;

    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }
}
```

---

# 🔹 Section C – Map Solutions

---

## 🔟 Basic Map Usage

```java
Map<Integer, String> map = new HashMap<>();
map.put(1, "A");
map.put(2, "B");
map.put(3, "C");

map.put(2, "Updated B");
map.remove(3);

for (Map.Entry<Integer, String> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " -> " + entry.getValue());
}
```

---

## 1️⃣1️⃣ Word Frequency

```java
String sentence = "java is powerful and java is fast";
String[] words = sentence.split(" ");

Map<String, Integer> frequency = new HashMap<>();

for (String word : words) {
    frequency.put(word, frequency.getOrDefault(word, 0) + 1);
}

System.out.println(frequency);
```

---

## 1️⃣2️⃣ First Non-Repeating Character

```java
String input = "programming";
Map<Character, Integer> countMap = new LinkedHashMap<>();

for (char c : input.toCharArray()) {
    countMap.put(c, countMap.getOrDefault(c, 0) + 1);
}

for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
    if (entry.getValue() == 1) {
        System.out.println("First non-repeating: " + entry.getKey());
        break;
    }
}
```

---

## 1️⃣3️⃣ Group Students by Marks

```java
Map<Integer, List<Student>> grouped =
    students.stream()
            .collect(Collectors.groupingBy(s -> s.marks));
```

---

## 1️⃣4️⃣ Simple Cache

```java
class SimpleCache {
    private Map<String, String> cache = new HashMap<>();

    public void put(String key, String value) {
        cache.put(key, value);
    }

    public String get(String key) {
        if (cache.containsKey(key)) {
            System.out.println("Cache hit");
            return cache.get(key);
        }
        System.out.println("Cache miss");
        return null;
    }

    public void remove(String key) {
        cache.remove(key);
    }
}
```

---

# 🔹 Section D – Streams Solutions

---

## 1️⃣5️⃣ Top 3 Students

```java
List<Student> top3 = students.stream()
        .sorted(Comparator.comparingInt((Student s) -> s.marks).reversed())
        .limit(3)
        .toList();
```

---

## 1️⃣6️⃣ Check Conditions

```java
boolean anyFail = students.stream().anyMatch(s -> s.marks < 35);
boolean allPassed = students.stream().allMatch(s -> s.marks > 40);
long distinctions = students.stream().filter(s -> s.marks > 80).count();
```

---

## 1️⃣7️⃣ Convert List to Map

```java
Map<Integer, Student> studentMap =
    students.stream()
            .collect(Collectors.toMap(s -> s.id, s -> s));
```

---

# 🔹 Section E – Exception Handling Solutions

---

## 1️⃣8️⃣ Division Handling

```java
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
}
```

---

## 1️⃣9️⃣ Custom Exception

```java
class InvalidMarksException extends RuntimeException {
    public InvalidMarksException(String message) {
        super(message);
    }
}

public void validateMarks(int marks) {
    if (marks < 0 || marks > 100) {
        throw new InvalidMarksException("Marks must be between 0 and 100");
    }
}
```

---

## 2️⃣0️⃣ StudentNotFoundException

```java
class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String message) {
        super(message);
    }
}

public Student getStudentById(int id, Map<Integer, Student> map) {
    if (!map.containsKey(id)) {
        throw new StudentNotFoundException("Student not found with id: " + id);
    }
    return map.get(id);
}
```

---

# 🎯 Mentor Note

These solutions are:

* Clean
* Production-style
* Interview-aligned
* Backend-oriented

In review session:

* Ask her to explain time complexity
* Ask why HashSet needs hashCode
* Ask what happens if duplicate key in Map
* Ask why LinkedHashMap used in non-repeating character problem

That discussion builds backend thinking.

---


