import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountEachletter {
    public static void main(String[] args) {
        //for sentence or word;
         String str="Milky is bad girl";
            HashMap<Character, Integer> charCount = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c != ' ') {
                    if (charCount.containsKey(c)) {
                        charCount.put(c, charCount.get(c) + 1);
                    } else {
                        charCount.put(c, 1);
                    }
                }
            }
            for (char c : charCount.keySet()) {
                System.out.println(c + ":" + charCount.get(c));
            }
        int maxCount = 0;
        List<Character> mostRepeated = new ArrayList<>();
        for (Map.Entry<Character,Integer> entry:charCount.entrySet()) {
            if(entry.getValue()>maxCount){
                maxCount= entry.getValue();
                mostRepeated.clear();
                mostRepeated.add((entry.getKey()));
            }else if(entry.getValue()==maxCount){
                mostRepeated.add((entry.getKey()));
            }
        }
        System.out.println(mostRepeated +":" +maxCount);

            //for numbers
        Map<Integer,Integer> countMap1= new HashMap<>();
            int[] a={1,1,3,2,4,3,4,8,7,9,5,4,5,5,6,6,8};
               for(int num:a){
                   if(countMap1.containsKey(num)){
                       countMap1.put(num,countMap1.get(num)+1);
                   }else{
                       countMap1.put(num,1);
                   }
               }
               for(int num:countMap1.keySet()){
                   System.out.println(num + ":" + countMap1.get(num));
               }

               List<Integer> mostRepeated1=new ArrayList<>();
               int maxCount1=0;
               for(Map.Entry<Integer,Integer> entry2: countMap1.entrySet()) {
                   if (entry2.getValue() > maxCount1) {
                       maxCount1 = entry2.getValue();
                       mostRepeated1.clear();
                       mostRepeated1.add(entry2.getKey());
                   } else if (entry2.getValue() == maxCount1) {
                       mostRepeated1.add(entry2.getKey());
                   }

               }
        System.out.println(mostRepeated1 + ":" + maxCount1);
            //Using Java 8 lambda Expression
        String sentenceWithoutSpaces = str.replaceAll("\\s", "");

// Create a map with the character count
        Map<Character, Long> charCount1 = sentenceWithoutSpaces.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

// Print the character count
        charCount1.forEach((c, count) -> System.out.println(c + ": " + count));
    }
    }

