import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* int a[]={10,5,6,7,8,9,10};
        System.out.println(a[1]);*/

        int[] x; //Array declaration and variable gets into the stack memory
        x=new int[4]; // Actual object creation
        Scanner sc = new Scanner(System.in);

/*        for(int i=0;i<x.length;i++){
            x[i]=sc.nextInt();
        }

        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }*/

        String[] y= new String[5];

        for(int i=0;i< y.length;i++){
            y[i]=sc.next();
        }

        System.out.println(Arrays.toString(y));
    }
}