public class Orderofagnostic {
    public static void main(String[] args) {
        int[] arr={100,80,70,15,16,-45,-100};
        int target=-45;
      int ans=serachinOrderagnostic(arr,target);
        System.out.println(ans);
    }

    static int serachinOrderagnostic(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean isAscending = arr[start]<arr[end];

        while(start <= end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(isAscending){
                if(target>arr[mid]){
                        start=mid+1;
                }else{
                    end=mid-1;
                }
            }else{
                if(target<arr[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }

}
