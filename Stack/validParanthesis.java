package Stack;
import java.util.Stack;
public class validParanthesis {
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                s.push(ch);
            }else{
                if(s.isEmpty()){
                    return false;
                }else if((ch == ')' && s.peek()=='(') || (ch == ']' && s.peek() == '[') ||(ch == '}' && s.peek() == '{')){
                    s.pop();
                }

                
            }
            
        }return s.isEmpty();
        
    }
    public static void main(String args[]){
        String str = "(({[]()}()))";
        System.out.println(isValid(str));

    }
}
