class RighSumEqLeft {
        public static void main(String[] args) {
            int[] arr={5,-1,4,6,12,0,-4};
            int n=arr.length;
            int result=-1;
            for(int i=0;i<n;i++){
                int left_sum=0;
                int right_sum=0;

                for(int j=0;j<i;j++){
                    left_sum+=arr[j];
                }

                for(int j=i+1;j<n;j++){
                    right_sum+=arr[j];
                }

                if(left_sum==right_sum)
                    result=arr[i];
            }
            System.out.println(result);
        }
    }

