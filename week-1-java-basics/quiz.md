
This quiz includes:

* 🧠 Conceptual clarity
* 🔎 Output prediction
* 🐞 Bug identification
* 🏗 Design thinking
* 🛡 Defensive programming mindset

---

# Week 1 – Quiz

## Java Fundamentals and OOP Foundations

> Do not run the code immediately.
> First predict the output.
> Then run and verify.
> Write explanations in comments.

---

# 🧠 Section 1 – Conceptual Questions

---

### 1️⃣ What is the difference between a class and an object?

Explain in your own words with an example.

---

### 2️⃣ Why should class fields usually be private?

What problems occur if fields are public?

---

### 3️⃣ What is encapsulation?

Explain using a real-world example (not textbook definition).

---

### 4️⃣ What is the difference between primitive and reference types?

Give examples of both.

---

### 5️⃣ What does the `static` keyword mean?

When should it be used?

---

---

# 🔎 Section 2 – Predict the Output

---

### 6️⃣ Question

```java
public class Test {
    public static void main(String[] args) {
        int x = 10;
        int y = x;
        y = 20;
        System.out.println(x);
    }
}
```

What is the output and why?

---

### 7️⃣ Question

```java
class Student {
    String name;
}

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Riya";

        Student s2 = s1;
        s2.name = "Anita";

        System.out.println(s1.name);
    }
}
```

What is the output and why?

---

### 8️⃣ Question

```java
class Person {
    void speak() {
        System.out.println("Person speaking");
    }
}

class Student extends Person {
    void speak() {
        System.out.println("Student speaking");
    }
}

public class Test {
    public static void main(String[] args) {
        Person p = new Student();
        p.speak();
    }
}
```

What is the output?

Explain polymorphism here.

---

### 9️⃣ Question

```java
class Test {
    int number;

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.number);
    }
}
```

What is the output?

Why?

---

---

# 🐞 Section 3 – Identify the Problem

---

### 🔟 Question

```java
class BankAccount {
    public double balance;
}
```

What is wrong with this design?

How would you fix it?

---

### 1️⃣1️⃣ Question

```java
class Student {
    private String name;

    public void setName(String name) {
        this.name = name;
    }
}
```

What problem might occur here?

How can we improve this setter?

---

### 1️⃣2️⃣ Question

```java
class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }
}
```

What issue might occur here?

How can we make this safer?

---

---

# 🏗 Section 4 – Design Thinking

---

### 1️⃣3️⃣ When should inheritance be used?

Give one good example and one bad example.

---

### 1️⃣4️⃣ Why should printing logic not be inside model classes?

Example:

```java
class Student {
    void printDetails() {
        System.out.println("...");
    }
}
```

Is this good design?

Explain.

---

### 1️⃣5️⃣ Why is constructor validation important?

What could go wrong if we skip validation?

---

---

# 🛡 Section 5 – Defensive Programming

---

### 1️⃣6️⃣ What happens here?

```java
Student s = null;
System.out.println(s.getName());
```

What exception occurs?

How can we avoid this?

---

### 1️⃣7️⃣ Suppose withdraw() does not check balance before deducting.

What real-world problem could this cause?

---

### 1️⃣8️⃣ Why should we avoid empty constructors?

Example:

```java
public Student() {}
```

When are they acceptable?

---

---

# 🎯 Bonus Challenge (Optional)

---

### 1️⃣9️⃣ Explain this in your own words:

> "Object should never enter invalid state."

Give a real backend example.

---

### 2️⃣0️⃣ If someone says:

> "Encapsulation is just about using private fields."

Would you agree?

Why or why not?

---

---

# 📌 Submission Instructions

✔ Write answers in a separate file `quiz-answers.md`
✔ Explain reasoning clearly
✔ For output questions, explain *why*
✔ Do not copy definitions from internet
✔ Think like a backend engineer

---

# 🧠 Evaluation Criteria

| Category            | Marks |
| ------------------- | ----- |
| Concept Clarity     | /10   |
| Output Accuracy     | /10   |
| Explanation Quality | /10   |
| Design Thinking     | /10   |
| Defensive Thinking  | /10   |

Total: /50

---

