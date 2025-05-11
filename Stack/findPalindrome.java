package Stack;
import java.util.*;
public class findPalindrome {
    public static boolean isPalindrome(LinkedList<Character> list){
        Stack<Character> s = new Stack<>();
        for(int i =0;i<list.size()/2;i++){
            s.push(list.get(i));
        }
        int start = (list.size() %2 ==0) ? list.size()/2 : list.size()/2 + 1;

        for(int i =start ;i<list.size();i++){
            if(s.pop() != list.get(i)){
                return false;
            }
        }
        return s.isEmpty();
    }
    public static void main(String srgs[]){
        LinkedList<Character> list = new LinkedList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('C');
        list.add('B');
        list.add('A');
        System.out.print(isPalindrome(list));

    }
}
