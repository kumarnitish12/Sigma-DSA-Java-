package Stack;
import java.util.*;
public class frameworkImplm {
    public static void main(String args[]){
        Stack<Integer> list = new Stack<>();
        list.push(1);
        list.push(2);
        list.push(3);
        while(list.size()!=0){
            System.out.println(list.peek());
            list.pop();
        }

    }
}
