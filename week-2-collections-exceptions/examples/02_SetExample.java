import java.util.*;

public class SetExample {

    public static void main(String[] args) {

        Set<String> emails = new HashSet<>();

        emails.add("a@test.com");
        emails.add("b@test.com");
        emails.add("a@test.com"); // duplicate ignored

        System.out.println("Emails:");
        emails.forEach(System.out::println);

        System.out.println("Size: " + emails.size());
    }
}
