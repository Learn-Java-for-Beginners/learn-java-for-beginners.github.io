import java.util.*;
import java.util.stream.*;

public class StreamExample {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(5, 10, 15, 20, 25);

        List<Integer> filtered =
                numbers.stream()
                        .filter(n -> n > 15)
                        .collect(Collectors.toList());

        System.out.println("Filtered (>15): " + filtered);

        long countEven =
                numbers.stream()
                        .filter(n -> n % 2 == 0)
                        .count();

        System.out.println("Even count: " + countEven);
    }
}
