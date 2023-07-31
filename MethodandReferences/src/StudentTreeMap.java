import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class StudentTreeMap {


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private int id;

    public StudentTreeMap(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    static class StudentTreeMapComparator implements Comparator<StudentTreeMap> {


        @Override
        public int compare(StudentTreeMap o1, StudentTreeMap o2) {
            return o1.getName().compareTo(o2.getName());
        }

        public static void main(String[] args) {
            TreeMap<StudentTreeMap,String> treeMap= new TreeMap<>(new StudentTreeMapComparator());
            treeMap.put(new StudentTreeMap("AYUSH",1),"Search for AYUSH");
            treeMap.put(new StudentTreeMap("Hitesh",2),"Search for Hitesh");
          for(Map.Entry<StudentTreeMap, String> map:treeMap.entrySet()){
              System.out.println(map.getKey().getName() + " " + map.getValue());

          }
        }
    }
}
