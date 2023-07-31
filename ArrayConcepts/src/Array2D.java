import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr2d = {
                {1,2,3},
                {8,9},
                {4,5,6,7}
        };

        for(int row=0;row< arr2d.length;row++){
            for(int col=0;col<arr2d[row].length;col++){
                System.out.print(arr2d[row][col] + " ");
            }
            System.out.println();
        }

        int[][] anotheranotherarr2dWayWay= new int[3][3];
       // anotheranotherarr2dWayWay mandatoaty to give row size/*
        // row size basically the first bracket of object array
        // column size is last bracket of object array*/

        //How to take the input for 2d array

        for(int row=0;row<anotheranotherarr2dWayWay.length;row++){
            for(int col=0;col<anotheranotherarr2dWayWay[row].length;col++){
                anotheranotherarr2dWayWay[row][col]=sc.nextInt();
            }
        }

        for(int row=0;row<anotheranotherarr2dWayWay.length;row++){
            for(int col=0;col<anotheranotherarr2dWayWay[row].length;col++){
                System.out.print(anotheranotherarr2dWayWay[row][col] + " ");
            }
            System.out.println();
        }


        for(int row=0;row< anotheranotherarr2dWayWay.length;row++){
            System.out.println(Arrays.toString(anotheranotherarr2dWayWay[row]));
        }

        for (int[] ints : anotheranotherarr2dWayWay) {
            System.out.println(Arrays.toString(ints));
        }


    }
}
