import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args) {
       String str1="keep";
       String str2="peek";
        System.out.println(isAnagra(str1,str2));
    }

    public static boolean isAnagra(String str1,String str2){
        if(str1.length()==str2.length()){
            char[] charArray1=str1.toCharArray();
            char[] charArray2=str2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean result=Arrays.equals(charArray1,charArray2);
            if(result){
                return true;
            }else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}
