import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListConcepts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list= new ArrayList<>();

        for(int i=0;i<5;i++){
            list.add(sc.nextInt());//adding the element dynamically through console
        }

        for (Integer integer : list) {
            System.out.println(integer.toString());
        }
    }
}
