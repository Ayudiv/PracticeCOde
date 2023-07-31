public class MaxInthArray {
    public static void main(String[] args) {
        int arr[] ={5, 8, 89, 98 ,115,4,1,6};
        int y= maxRange(arr,1,4);
        System.out.println(y);
        int x=max(arr);
        System.out.println(x);

    }

    static int max(int[] arr) {
         if(arr==null){
             return -1;
         }
         int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    //for range
    private static int maxRange(int[] arr,int start,int end) {
        if(arr==null){
            return -1;
        }
        if(end>start){
            return -1;
        }
         int max=arr[0];
        for (int i = start; i <= end; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
