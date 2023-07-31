import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int next=1;
        int pre=0;
        int count=2;
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();

        while(count<x){
            int temp=next;
            next = next +pre;
            pre=temp;
            count++;
        }
        System.out.println(next);
        System.out.println(pre);
    }
}
