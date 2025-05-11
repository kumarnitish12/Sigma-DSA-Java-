package Stack;
import java.util.*;
public class Decode_a_string {
    public static void decode(String str){
        Stack<Character> s= new Stack<>();
        StringBuilder sb = new StringBuilder("");
        StringBuilder sb2 = new StringBuilder("");

        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch==']'){
                while(s.peek()!='['){
                    sb.append(s.peek());
                    s.pop();
                }
                s.pop();

                int n = s.peek()-'0';
                while(n-->0){
                    for(int j =sb.length()-1;j>=0;j--){
                        sb2.append(sb.charAt(j));
                    }
                }
                if(!s.isEmpty()){
                    s.pop();
                }


            }
            else{
                s.push(ch);
            }

            
        }
        
        String str2 = sb2.toString();
        System.out.println(str2);
    }
    public static void main(String args[]){
        String str = "3[b2[v]]L";
        decode(str);
    }
}
