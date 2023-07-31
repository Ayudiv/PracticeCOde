import java.util.*;
import java.util.stream.Collectors;

public class Java8Practices {
    public static void main(String[] args) {


        String str = "Milky is bad girl and bad milky girl is";
        //String removeSpace=str.replaceAll("\\s","");
        //Converting string into the list
        List<String> wordStreamOfString = Arrays.asList(str.split(" "));
        List<Character> wordStreamOfCharacters = str.replaceAll(" ","").trim().toLowerCase().chars().mapToObj(c -> (char) c).toList();
        //To count the occurence of each word of a Strinhg

        Map<String, Long> countMapforString = wordStreamOfString.stream().collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        Map<Character, Long> countMapforCharacter = wordStreamOfCharacters.stream().collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        List<String> mostRepeatedForString = countMapforString.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3).map(Map.Entry::getKey).toList();
        List<Character> mostRepeatedForCharacter = countMapforCharacter.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3).map(Map.Entry::getKey).toList();

        List<String> repeatingForString = wordStreamOfString.stream()
                .filter(c -> Collections.frequency(wordStreamOfString, c) > 1).toList();
        List<Character> repaetingForChacters= wordStreamOfCharacters.stream()
                .filter(c -> Collections.frequency(wordStreamOfCharacters, c) > 1).toList();

        System.out.println("Count number of words in String" + countMapforString);
        System.out.println("Most repeated words in String" + mostRepeatedForString);
        System.out.println("Count number of characters in String" + countMapforCharacter);
        System.out.println("Most repeated characters in String" + mostRepeatedForCharacter);
        System.out.println("String which are repeating " + repeatingForString);
        System.out.println("Characters which are repeating " + repaetingForChacters);

    }
}
