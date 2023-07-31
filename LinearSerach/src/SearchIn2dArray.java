import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int arr[][]={
                {1,17,21,25},
                {30,5,115},
                {11,107,210,250}
        };
        int target=11;
        int [] ans=searchIn2d(arr,target);
        System.out.println(ans);
        int ans1= maximumArray(arr);
        System.out.println(ans1);
    }

    private static int maximumArray(int[][] arr) {
        int max=arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]>max){
                    max=arr[row][col];
                }
            }

        }
        return max;
    }

    //The idea is to find the target element inside from the 2 d array
    // The first bracket is for row and 2nd bracket of the object array is for column
    // for iterating 2 d array we need to loop the row first then followed by loop the col
    //for one particular index of row the entire columns get run


    //private static int searchIn2d(int[][] arr, int target) {
    private static int[] searchIn2d(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                int element=arr[row][col];//getting the particular element from [row][col] index
                if(target==element){
                    //return element;
                    return new int[]{row,col};
                    //getting the index from {row,col} searchIn2d array method always return 1d array
                }
            }
        }
        return new int[]{-1,-1};//else false
        // return -1;
    }
}
