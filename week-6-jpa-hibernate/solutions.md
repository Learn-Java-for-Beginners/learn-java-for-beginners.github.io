---
layout: default
title: Solutions - JPA and Hibernate
parent: Week 6 - JPA and Hibernate
nav_order: 6
---

# ✅ Solutions – JPA and Hibernate

This section provides **reference solutions and guidance** for the assignment.

⚠️ Do NOT read this before attempting the assignment.

---

# 🧠 Solution Approach

The correct implementation should follow:

```

Controller → Service → Repository → Database

````

---

# 🧱 1. Entity Design

## 👤 Student Entity

```java id="stdentity01"
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Course> courses;

    // getters and setters
}
````

---

## 📘 Course Entity

```java id="courseentity01"
@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String courseName;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    // getters and setters
}
```

---

# 🔗 Key Concepts Applied

* `mappedBy` defines the owning side
* `cascade = ALL` ensures child objects persist automatically
* `FetchType.LAZY` improves performance

---

# 📦 2. Repository Layer

```java id="repo01"
public interface StudentRepository extends JpaRepository<Student, Long> {
}

public interface CourseRepository extends JpaRepository<Course, Long> {
}
```

---

# ⚙️ 3. Service Layer

```java id="service01"
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Course addCourse(Long studentId, Course course) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        course.setStudent(student);
        return courseRepository.save(course);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public List<Course> getCoursesByStudent(Long studentId) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        return student.getCourses();
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
```

---

# 🌐 4. Controller Layer

```java id="controller01"
@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return service.createStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        service.deleteStudent(id);
    }

    @PostMapping("/{id}/courses")
    public Course addCourse(@PathVariable Long id, @RequestBody Course course) {
        return service.addCourse(id, course);
    }

    @GetMapping("/{id}/courses")
    public List<Course> getCourses(@PathVariable Long id) {
        return service.getCoursesByStudent(id);
    }
}
```

---

# 🧪 5. Validation (Improved Version)

```java id="validation01"
@NotBlank
private String name;

@Email
private String email;
```

---

# ⚠️ Common Mistakes Explained

## ❌ Missing `mappedBy`

Leads to:

* Extra join table creation
* Incorrect relationship mapping

---

## ❌ Not setting parent in child

```java
course.setStudent(student);
```

Without this:

* Relationship will not persist correctly

---

## ❌ Returning Entities Directly

Problem:

* Exposes internal structure
* Causes infinite recursion (in bidirectional mapping)

👉 Solution:

* Use DTOs (advanced)

---

## ❌ Using EAGER Fetching

Problem:

* Loads unnecessary data
* Impacts performance

👉 Prefer LAZY

---

# 🔍 Debugging Tips

* Enable SQL logs:

```
spring.jpa.show-sql=true
```

* Check:

  * Tables created?
  * Foreign key exists?
  * Queries generated correctly?

---

# 🚀 Advanced Improvements (Recommended)

* Add DTO layer
* Use ModelMapper or MapStruct
* Add global exception handler
* Add logging
* Add pagination

---

# 🧠 Final Thoughts

If your solution:

* Uses proper entity relationships
* Follows layered architecture
* Handles data correctly

👉 You are thinking like a backend developer.

---

# 🏁 Next Step

Proceed to:

👉 `Assessment`

Evaluate your implementation objectively.



---

# 🔥 Why this is strong

- Doesn’t overwhelm with full project dump  
- Explains *why*, not just *what*  
- Highlights real mistakes (this is gold for learning)  
- Encourages improvement mindset  

---

