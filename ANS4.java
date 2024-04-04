import java.util.*;
public class ANS4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();
        scanner.close();

        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c) || Character.isDigit(c)) {
                c = Character.toLowerCase(c);
                if (charCount.containsKey(c)) {
                    charCount.put(c, charCount.get(c) + 1);
                } else {
                    charCount.put(c, 1);
                }
            }
        }

        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }
    }
}