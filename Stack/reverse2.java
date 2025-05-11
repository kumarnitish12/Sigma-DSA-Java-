package Stack;
import java.util.*;
public class reverse2 {
    public static String reverse(String str){
        Stack<Character> ch = new Stack<>();
        for(int i =0;i<str.length();i++){
            char newch = str.charAt(i);
            ch.push(newch);
        }
        StringBuilder result = new StringBuilder();
        while(!ch.isEmpty()){
            result.append(ch.pop());
        }

        return result.toString();
    }
    public static void main(String args[]){
        String str = "abcde";
        System.out.print(reverse(str));
    }
}
