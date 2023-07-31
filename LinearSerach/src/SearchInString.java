public class SearchInString {
    public static void main(String[] args) {
      String name="AYUSH";
      char target='U';
       // System.out.println(linearSerach(name,target));
        System.out.println(linearSerach2(name,target));
    }

    static boolean linearSerach(String name, char target){
        if(name.length()==0){
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if(target==name.charAt(i)){
                return true;
            }

        }
        return false;
    }

    static boolean linearSerach2(String name, char target){
        if(name.length()==0){
            return false;
        }

        for (char ch:name.toCharArray()) {
            if(target==ch){
                return true;
            }
        }
        return false;
    }
}
