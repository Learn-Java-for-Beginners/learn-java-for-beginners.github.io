import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override equals and hashCode

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
}

public class EqualsHashCodeExample {

    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();

        students.add(new Student(1, "A"));
        students.add(new Student(1, "A")); // duplicate logically

        System.out.println("Size of Set: " + students.size());
    }
}
