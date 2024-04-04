import java.util.*;

public class ANS3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = scanner.nextLine();
        scanner.close();

        Map<String, Integer> wordCount = new HashMap<>();
        int totalWords = 0;

        String[] words = text.split("\\s+");

        for (String word : words) {
            word = word.toLowerCase();
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
            totalWords++;
        }

        System.out.println("Total number of words: " + totalWords);

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}