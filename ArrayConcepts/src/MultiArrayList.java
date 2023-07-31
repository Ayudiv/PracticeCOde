import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arrayList= new ArrayList<>();

        /*acquring a space into the ram for multi arraylist
         without below code it will throw array out of bound exception*/
        for (int i = 0; i < 3; i++) {
            arrayList.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arrayList.get(i).add(sc.nextInt());
            }
        }
        System.out.println(arrayList);
    }
}

