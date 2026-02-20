import java.util.*;

public class MapExample {

    public static void main(String[] args) {

        Map<Integer, String> studentMap = new HashMap<>();

        studentMap.put(1, "Aditya");
        studentMap.put(2, "Riya");
        studentMap.put(3, "Rahul");

        System.out.println("Student with ID 2: " + studentMap.get(2));

        System.out.println("\nAll entries:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
