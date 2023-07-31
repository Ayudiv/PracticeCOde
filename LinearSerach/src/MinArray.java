public class MinArray {
    public static void main(String[] args) {
        int arr[]={15,25,11,35,70,4,0};
       //int ans= findMinArr(arr);
       int target=35;
       boolean ans1= targetArray(arr,target);
        //System.out.println(ans);
        System.out.println(ans1);
    }

    private static boolean targetArray(int[] arr, int target) {
        for (int i = 0; i <= arr.length; i++) {
            int element=arr[i];
            if(target==element){
                return true;
            }
        }
        return true;
    }

    // assume arr.lenhth !=0
  /*  static int findMinArr(int[] arr){
        int ans=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
      return ans;
    }*/
}

