import java.util.Scanner;

public class SearchInRange {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter size");
        int x=scanner.nextInt();
        int arr[]=new int[x];
        System.out.println("Please start insterting the array");
        for(int i=0;i<arr.length;i++){
            arr[i]= scanner.nextInt();
            System.out.println("For element " + arr[i] + " of index number is " + i);
        }
        int target=17;
        int ans=linearSerach(arr,17,1,4);
        System.out.println(ans);
    }

    static int linearSerach(int arr[],int target, int start,int end){
        if(arr.length==0){
            return -1;
        }

        for(int index=start;index<=end;index++){
            int element=arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
}
