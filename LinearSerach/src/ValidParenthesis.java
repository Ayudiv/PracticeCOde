import java.util.HashMap;
import java.util.Stack;

class ValidParenthesis {
    public static boolean isValid(String str) {
      HashMap<Character,Character> hashMap=new HashMap<>();
      hashMap.put('{','}');
      hashMap.put('[',']');
      hashMap.put('(',')');

      Stack<Character> stack=new Stack<>();
      for(int i=0;i<str.length();i++){
          char c=str.charAt(i);
          if(hashMap.containsKey(c)){
              stack.push(c);
          }else {
              if(hashMap.isEmpty()){
                  return false;
              }else{
                  char target=stack.pop();
                  if(hashMap.get(target)!=c){
                      return false;
                  }
              }
          }
      }
      return true;
      }

    public static void main(String[] args) {
        System.out.println(isValid("{[()]}"));
    }
}