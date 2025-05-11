package LinkedList;
import java.util.*;
public class inbuiltll {
    public static void main(String args[]){
        LinkedList <Integer> ll = new LinkedList<>();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(0);
        ll.addFirst(0);
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        System.out.println(ll);
        // ll.removeFirst();
        // ll.removeLast();
        
        int n = 3;
        int right = ll.size()-1;
        int left = 0;
        int count = 0;
        while(left<right){
            if(ll.get(left)!=ll.get(right)){
                count++;
            }
            right--;
            left++;
        }
        if(count==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    
}
