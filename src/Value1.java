import java.util.LinkedHashMap;
import java.util.Map;

public class Value1 {

    private static final String[] inputData = {
            "aba",
            "bob", "bob", "bob",
            "cd",
            "disk",
            "error", "error",
            "finish",
            "glade", "glade", "glade",
            "hiper",
            "glade",
            "inteligID"
    };

    public static void main(String[] args) {
        Map<String, Integer> frequencyByWord = new LinkedHashMap<>();
        for (String word : inputData) {
            Integer frequency = frequencyByWord.get(word);
            if (frequency == null) {
                frequency = 0;
            }
            frequencyByWord.put(word, frequency + 1);

        }
            frequencyByWord.forEach((word, frequency) -> {
                System.out.println(word + ": " + frequency );
            });
        }
    }



