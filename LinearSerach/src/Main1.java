import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {

        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1,"AYUSH");
        map1.put(2,"SAHIL");
        map1.put(3,"RAJU");

        List<Integer> u = map1.entrySet().stream().map(Map.Entry::getKey).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        for (Integer key:u){
            System.out.println("Key is : " + key + " and Value : " + map1.get(key));
        }

  int[] a= {5,5,4,8,1,4,1,0};
     Map<Integer,Integer> mapInteger=new HashMap<>();
        for (Integer i : a) {
            if(mapInteger.containsKey(i)){
                mapInteger.put(i,mapInteger.get(i)+1);
            }else {
                mapInteger.put(i,1);
            }
            }

        List<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> maps:mapInteger.entrySet()){
            /*if(maps.getValue()==1){
                list.add(maps.getKey());*/
                System.out.println(maps.getKey() + " and : " + maps.getValue());
            //}
        }
        System.out.println(list);


        Map<Integer, Long> s = Arrays.stream(a).boxed().collect(Collectors.groupingBy(q -> q, Collectors.counting()));
        List<Integer> g = s.entrySet().stream().filter(j -> j.getValue() > 1).map(h -> h.getKey()).collect(Collectors.toList());
             System.out.println(g);

             String x="KANISHKA";
             Map<Character,Integer> map4=new HashMap<>();
        for (int i = 0; i < x.length(); i++) {
            char c=x.charAt(i);
            if (map4.containsKey(c)) {
                map4.put(c,map4.get(c)+1);
            }else{
                map4.put(c,1);
            }
            List<Character> arrayList=new ArrayList<>();
            List<Character> arrayListFindFirst=new ArrayList<>();
            for(Map.Entry<Character,Integer> maps:map4.entrySet()){
                System.out.println(maps.getKey() + " " + maps.getValue());
                if(maps.getValue()>1){
                    arrayList.add(maps.getKey());
                }
                if(maps.getValue()>1){
                    arrayListFindFirst.add(maps.getKey());
                }
            }
            System.out.println(arrayList);
            System.out.println(arrayListFindFirst);
        }

        Map<Character, Long> v = x.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<Character> f = v.entrySet().stream().filter(j -> j.getValue() > 1).map(y -> y.getKey()).collect(Collectors.toList());
        System.out.println(f);
        v.forEach((character, frequency) -> System.out.println("Character " + character + " : " + " Count " + frequency));

        
        

    }


    }



