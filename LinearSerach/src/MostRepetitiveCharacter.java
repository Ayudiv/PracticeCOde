import java.util.HashMap;
import java.util.Map;

public class MostRepetitiveCharacter {

    public static void main(String[] args) {
        String sentence = "This is a sentence.";
        char mostRepetitiveChar = findMostRepetitiveChar(sentence);
        System.out.println("The most repetitive character in the sentence is: " + mostRepetitiveChar);
    }

    public static char findMostRepetitiveChar(String str) {
        // Remove spaces from the string
        String strWithoutSpaces = str.replaceAll("\\s", "");

        // Create a map with the character count
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : strWithoutSpaces.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find the character with the maximum count
        char mostRepetitiveChar = ' ';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostRepetitiveChar = entry.getKey();
            }
        }

        return mostRepetitiveChar;
    }
}
