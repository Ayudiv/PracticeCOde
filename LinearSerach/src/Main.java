import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // Main.nonRepetiveNumbers();
        // Main.nonRepeatitingCharacter();
        // Main.nonRepeatingWord();
        //Main.nthHighestNumber();
        Main.nthHighestNumberList();
        Main.longestWordInaString();
        Main.mapvsFlatmap();
        // Main.flatMapExampleofString();
        //Main.reverseString();
        // Main.reverseNumber();
        //Main.stringPalindrome();
        //Main.validParenthesis();
        //Main.reverseCharacter();
    }



    public static void nonRepetiveNumbers() {
        int[] a = {1, 1, 3, 2, 4, 3, 4, 7, 9, 5, 4, 5, 5, 6, 6, 8};
        Map<Integer, Integer> map = new HashMap<>();
        for (int nums : a) {
            if (map.containsKey(nums)) {
                map.put(nums, map.get(nums) + 1);
            } else {
                map.put(nums, 1);
            }
        }
        List<Integer> nonRepeatedNumber = new ArrayList<>();
        for (Map.Entry<Integer, Integer> nums : map.entrySet()) {
            if (nums.getValue() == 1) {
                nonRepeatedNumber.add(nums.getKey());
            }
        }
        System.out.println(nonRepeatedNumber);

        //////////////////////////////// using java8
        Map<Integer, Long> h = Arrays.stream(a).boxed().collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        List<Integer> e = h.entrySet().stream().filter(d -> d.getValue() == 1).map(j -> j.getKey()).collect(Collectors.toList());
        System.out.println(e);
        List<Integer> g = Collections.singletonList(h.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().map(Map.Entry::getKey).orElse(-1));
        System.out.println(g);
    }

    public static void nonRepeatitingCharacter() {
        String str = "Milky is good girl";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != ' ')
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
        }
        List<Character> nonRepeatedCharacter = new ArrayList<>();
        for (Map.Entry<Character, Integer> nums : map.entrySet()) {
            if (nums.getValue() == 1) {
                nonRepeatedCharacter.add(nums.getKey());
                break;
            }
        }
        System.out.println(nonRepeatedCharacter);

        Map<Character, Long> s = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<Character> hs = s.entrySet().stream().filter(h -> h.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(hs);
        //finding first non repeting elemenet in Chacters
        List<Character> e = Collections.singletonList(s.entrySet().stream().filter(h -> h.getValue() == 1).findFirst().map(Map.Entry::getKey).orElse('d'));
        System.out.println(e);
    }

    public static void nonRepeatingWord() {
        String str = "Milky is good girl is good is";
        String[] word = str.split("\\s+");
        Map<String, Integer> map = new HashMap<>();

        for (String words : word) {
            if (map.containsKey(words)) {
                map.put(words, map.get(words) + 1);
            } else {
                map.put(words, 1);
            }
        }
        List<String> nonRepeatingWord = new ArrayList<>();
        List<String> nonRepeatingWord1 = new ArrayList<>();
        for (Map.Entry<String, Integer> nums : map.entrySet()) {
            nonRepeatingWord1.add(nums.getKey() + " : occurence " + nums.getValue());
            if (nums.getValue() == 1) {
                nonRepeatingWord.add(nums.getKey());
            }
        }
        System.out.println(nonRepeatingWord);
        System.out.println(nonRepeatingWord1);

        Map<String, Long> s = Arrays.stream(str.split("\\s+")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<String> f = s.entrySet().stream().filter(j -> j.getValue() == 1).map(Map.Entry::getKey).toList();
        System.out.println(f);
        List<String> g = Collections.singletonList(s.entrySet().stream().filter(j -> j.getValue() == 1).map(k -> k.getKey()).findFirst().orElse("null"));
        System.out.println(g);
    }

    public static void nthHighestNumber() {
        int[] a = {50, 40, 25, 75, 100, 110, 105};
        Arrays.sort(a);
        int n = 3;
        int nthMax = a[a.length - n];
        System.out.println(nthMax);
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println(max);
    }

    public static void nthHighestNumberList() {
        List<Integer> list = Arrays.asList(10, 50, 5, 45, 1, 4);
        long n = 3;
        Stream<Integer> g = list.stream().min(Comparator.naturalOrder()).stream().skip(n - 1).findFirst().stream();
        System.out.println(g);
        Optional<Integer> j = list.stream().sorted(Comparator.reverseOrder()).skip(n - 1).findFirst();
        System.out.println(j);
    }

    public static void flatMapExampleofString() {
        List<String> ls = Arrays.asList("Hello", "World");
        List<List<Character>> o = ls.stream().map(f -> f.chars().mapToObj(c -> (char) c).distinct().collect(Collectors.toList())).collect(Collectors.toList());
        System.out.println(o);
        List<Character> k = ls.stream().flatMap(f -> f.chars().mapToObj(c -> (char) c)).distinct().toList();
        System.out.println(k);
    }

    public static void reverseString() {
        String str = "Milky is bad girl";
        String[] str1 = str.split("\\s+");
        String reverse = " ";
        for (int i = str1.length - 1; i >= 0; --i) {
            reverse = reverse + str1[i] + " ";
        }
        System.out.println(reverse);

    }

    public static void reverseCharacter() {
        String str = "Milky is bad girl";
        char[] ch = str.toCharArray();
        String reverse = " ";
        for (int i = ch.length - 1; i >= 0; --i) {
            reverse = reverse + ch[i] + "";
        }
        System.out.println(reverse);

    }

    public static void reverseNumber() {
        int[] a = {5, 4, 78, 8, 9, 86, 12, 47, 78};
        int[] reverse;
        for (int i = a.length - 1; i >= 0; --i) {
            reverse = new int[a.length];
            reverse[i] = a[i];
            System.out.print(reverse[i] + ",");
        }
    }


    public static void stringPalindrome() {
        String str = "keepeek";
        String reverse = " ";
        for (int i = str.length() - 1; i >= 0; --i) {
            reverse = reverse.trim() + str.charAt(i);
        }
        if (reverse.equals(str)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrom");
        }
    }

    public static boolean validParenthesis() {
        String str = "{}[]{[]}";
        Map<Character, Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != ' ') {
                if (map.containsKey(c)) {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    } else {
                        char target = stack.pop();
                        if (map.get(target) != c) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void longestWordInaString() {

        String s = "Ultimate lord Jagganath";
        String[] str = s.split("\\s+");
        int maxWord = 0;
        String maxWordS = null;
        for (int i = 0; i < str.length; i++) {
            if (maxWord < str[i].length()) {
                maxWordS = str[i];
                maxWord = maxWordS.length();
            }
        }
        System.out.println(maxWord + " == " + maxWordS);

    }

    public static void mapvsFlatmap(){
        List<List<String>> listofListofString=Arrays.asList(Arrays.asList("Hietsh","AYUSH","Kanda"));
        List<List<String>> p = listofListofString.stream().map(list1 -> list1.stream().collect(Collectors.toList())).collect(Collectors.toList());
        List<String> usingFlatMap = listofListofString.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(p);
        System.out.println("+++++++++++++++++++");
        System.out.println(usingFlatMap);
    }
}