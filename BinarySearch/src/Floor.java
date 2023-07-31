public class Floor {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=1;
        int ans=searchFloor(arr,target);
        System.out.println(ans);
    }

    // Floor => If target is same as mid return mid if target is not in the array then
    // find the greatest number in the array that is smaller than equal to the target array

    static  int searchFloor(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        boolean isAscending = arr[start]<arr[end];
        while(start<=end) {
            int mid= start + (end-start)/2;

            if (target == arr[mid]) {
                return mid;
            }
            if (isAscending) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return end;

    }
}
