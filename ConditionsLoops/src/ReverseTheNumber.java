public class ReverseTheNumber {
    public static void main(String[] args) {
        int count=0;
        int n=4578558;
        int x = 0;
        while(n>0){
            int temp=n%10;
            x=temp;
            n=n/10;
            System.out.print(x);
        }

    }
}
