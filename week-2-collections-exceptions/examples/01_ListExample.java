import java.util.*;

public class ListExample {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Aditya");
        names.add("Riya");
        names.add("Rahul");
        names.add("Aditya"); // duplicate allowed

        System.out.println("All Names:");
        names.forEach(System.out::println);

        System.out.println("\nAccess by index:");
        System.out.println(names.get(1));

        System.out.println("\nRemove element:");
        names.remove("Rahul");
        System.out.println(names);
    }
}
