import java.util.*;

public class MapFrequencyExample {

    public static void main(String[] args) {

        String sentence = "java is powerful and java is fast";
        String[] words = sentence.split(" ");

        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            frequencyMap.put(word,
                    frequencyMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequency:");
        frequencyMap.forEach((k, v) ->
                System.out.println(k + " -> " + v));
    }
}
