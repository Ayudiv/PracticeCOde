import java.util.ArrayList;
import java.util.List;

public class IntersectionBasedQuestion {
    public static void main(String[] args) {

        //For given two integer array find the intersection
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 2, 3};
        int[] intersection = findInterSection(arr1, arr2);
        for (Integer newIntersectionList :
                intersection) {
            System.out.println(newIntersectionList);
        }


        //For given two String sentences find the common word
        String s1 = "AYUSH IS AWESOME";
        String s2 = "AWESOME PLACE";

        String[] newS1 = s1.split(" ");
        String[] newS2 = s2.split(" ");

        String[] newS3Intersection = findIntersectionOfTwoString(newS1, newS2);

        for (String d : newS3Intersection) {
            System.out.println(d);
        }

        //For Given two string Find the common characters
        String u1 = "UMBRELLA";
        String u2 = "ANABELLA";

        String u3 = findCommonIntersectionTwoStringLetter(u1, u2);
        System.out.println(u3.replace(",", "").replace(" ", ""));
        System.out.println(RepetiviveChacterinString());
    }


    public static int[] findInterSection(int[] arr1,int[] arr2){
        List<Integer>  list1=new ArrayList<>();
        for(Integer x: arr1){
            list1.add(x);
        }
        List<Integer> list2Intersection=new ArrayList<>();
        for (Integer y:arr2){
            if(list1.contains(y)){
                list2Intersection.add(y);
            }
        }
        int[] newIntesection=new int[list2Intersection.size()];
        int i=0;
        for (Integer z: list2Intersection) {
            newIntesection[i++]=z;
        }
        return newIntesection;
    }

    private static String findCommonIntersectionTwoStringLetter(String u1, String u2) {
        List<Character> list=new ArrayList<>();
        for (int i = 0; i < u1.length(); i++) {
            char c=u1.charAt(i);
            list.add(c);
        }

        List<Character> insterSectionOfChars=new ArrayList<>();
        for (int i = 0; i < u2.length(); i++) {
            char x=u2.charAt(i);
            if(list.contains(x)){
                insterSectionOfChars.add(x);
            }

        }
        return insterSectionOfChars.toString();
    }


    public static String[] findIntersectionOfTwoString(String[] s1,String[] s2){
        List<String> list=new ArrayList<>();
        for (String x:s1){
           list.add(x);
        }
        List<String> intersectionList=new ArrayList<>();
        for(String y:s2) {
            if (list.contains(y)) {
                intersectionList.add(y);
            }
        }
            String[] z=new String[intersectionList.size()];
            int i=0;
            for(String g:intersectionList){
                z[i++]=g;
            }
        return z;
    }

    public static boolean RepetiviveChacterinString(){
        String s="INDIAN";
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            for (int j = i+1; j <s.length() ; j++) {
                char x=s.charAt(j);
                if(c==x){
                    return false;
                }
            }
        }
        return true;
    }

}
