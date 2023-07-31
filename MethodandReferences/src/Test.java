import java.util.Stack;

public class Test {
    String s= "()()()";


    public boolean value(String s1){

        Stack<Character> stack = new Stack<>();
        for(char c : s1.toCharArray()){
            if(c=='('){
                stack.add(c);
            }
            if(!stack.isEmpty()){
                return false;
            }else if( c==')' ){

            }
        }
    }

}
