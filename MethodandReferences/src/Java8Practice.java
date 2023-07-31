import java.util.*;
import java.util.stream.Collectors;

public class Java8Practice {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, (a,b)->a+b);
        System.out.println(sum);

      List<String> words = Arrays.asList("apple", "banana", "cherry");
        words.sort(String::compareTo);
        words.forEach(System.out::println);

        List<String> words1 = Arrays.asList("apple", "banana", "cherry");
        Optional<String> longestWord = words1.stream().max((a, b) -> a.length() - b.length());
        System.out.println(longestWord.orElse(""));


        Integer[] arr = {5, 4, 10, 11, 8};
        List<Integer> list = Arrays.asList(arr);

        list.stream()
                .filter(i -> i % 2 == 0)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
