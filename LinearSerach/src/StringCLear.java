public class StringCLear {
    public static void main(String[] args) {
        String s1="AYUSH";
        String s2="AYUSH";
        String s3=new String("AYUSH");
        System.out.println(s1.equals(s3));
        System.out.println(s1 == s3);
        System.out.println(s1 == s2);

    }
}
