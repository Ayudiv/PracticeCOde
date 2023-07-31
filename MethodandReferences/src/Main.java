import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);/*
        int n = sc.nextInt();
        int h = sc.nextInt();
        isArmstrpng(n, h);*/
        String j=sc.nextLine();
        Main m= new Main();
       String a= m.palindrom(j);
        System.out.println(a);
    }

    static boolean isPrime(int n) {

        if (n < 1) {
            return false;
        }

        int c = 2;
        while (c * c <= n) {
            if (c % n == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }

    static void isArmstrpng(int x, int y) {
        int n, count = 0, b, sum = 0;
        for (int i = x; i <= y; i++) {
            n = i;
            while (n > 0) {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }

    java.lang.String palindrom(String x){
        String reverse="";
        for(int i=x.length()-1;i>=0;--i){
            reverse=reverse+x.charAt(i);
        }
        return reverse;
    }

    void integerPalindrom(int x){
        int temp=x;
        int reverse=0;
        while(temp!=0){
            int remainder=temp%10;
            reverse= (reverse*10)+remainder;
            temp=temp/10;
        }
        if(x==reverse){
            System.out.println("Integer Palindrome");
        }
    }
}