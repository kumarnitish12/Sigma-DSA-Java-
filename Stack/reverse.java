package Stack;
import java.util.*;
public class reverse {
   public static void main(String args[]){
    Stack<String> s = new Stack<>();
    s.push("a");
    s.push("b");
    s.push("c");
    s.push("d");
    s.push("e");
    while(!s.isEmpty())
    System.out.print(s.pop()+" ");
   }
}
