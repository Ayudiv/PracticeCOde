import java.util.*;

public class Student {
    private  String name;
    private  int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        return id == other.id && name.equals(other.name);
    }

    public static void main(String[] args){
        ArrayList<HashMap<Student,String>> arrayList=new ArrayList<>();
        HashMap<Student, String> hashMap=new HashMap<>();
        hashMap.put(new Student("AYUSH",8),"Search for AYUSH");
        hashMap.put(new Student("Hitesh",17),"Search for Hitesh");
        arrayList.add(hashMap);
        try {
            System.out.println(arrayList.get(Integer.parseInt(hashMap.get(new Student("AYUSH",8)))));
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
