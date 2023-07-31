public class LinearSerach {
    public static void main(String[] args) {
      int arr[]={25,14,15,17,19,45};
      int target=17;
      int ans=linearSearch(arr,target);
        System.out.println(ans);
    }



    // The idea is to find the index of the element in given array


    static int linearSearch(int arr[], int target){
        if(arr.length==0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
             int element=arr[index];
             if(element==target){
                 return index;
             }
        }

        // enhanced for loop only use when you don't care about the index of the element or you can say when you want
        //element related results
       /* for(int element:arr){
            if(target==element){
                return element;
            }
        }*/

        return -1;
    }
}
