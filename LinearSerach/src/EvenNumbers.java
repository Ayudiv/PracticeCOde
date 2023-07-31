public class EvenNumbers {
    public static void main(String[] args) {
        int[] a = {12, 345, 6, 1789};
        System.out.println(findNumbers(a));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums){
            if (even(num)) {
                count++;
            }
    }
  return count;
}

     static boolean even(int nums) {
        int num_of_digits=digits(nums);
        return num_of_digits%2==0;
    }

    static int digits(int num){

        if(num<0){
            num=num*-1;
        }

        if(num==0){
            return 1;
        }

        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}
