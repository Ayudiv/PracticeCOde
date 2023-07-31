//https://leetcode.com/problems/richest-customer-wealth/

public class MaxWealth {
    public static void main(String[] args) {
        int[][] z= {{1,2,3},
                   {3,4,1}};
        System.out.println(maximumWealth(z));
    }

    public static int maximumWealth(int[][] accounts) {
        int ans=Integer.MIN_VALUE;
        int sum=0;
      for(int person =0;person<accounts.length;person++){
          for(int account=0;account<accounts[person].length;account++){
              sum+=accounts[person][account];
          }
          if(sum>ans){
              ans=sum;
          }
      }
      return ans;
    }


}
