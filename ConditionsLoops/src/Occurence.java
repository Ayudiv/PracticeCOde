public class Occurence {
    public static void main(String[] args) {
        int n=1553554;
        int count=0;
        while(n>0){
            int temp=n%10;
          if(temp==5){
             count++;
          }
          n=n/10;
        }
        System.out.println(count);
    }
}
