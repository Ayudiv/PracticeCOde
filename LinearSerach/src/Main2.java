import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
      int a[]=new int[size];
        for (int i = 0; i <a.length ; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if(a[j]<a[i]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        int num=3;
        System.out.println(a[a.length-num]);

        //
        String s="()P$%^&E(*&^%A$%^&*S(*&^";
        char[] charArray = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (Character.isAlphabetic(charArray[start]) && Character.isAlphabetic(charArray[end])) {
                char temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;
                start++;
                end--;
            } else {
                if (!Character.isAlphabetic(charArray[start])) {
                    start++;
                }
                if (!Character.isAlphabetic(charArray[end])) {
                    end--;
                }
            }
        }

        System.out.println(new String(charArray));

    }
}
