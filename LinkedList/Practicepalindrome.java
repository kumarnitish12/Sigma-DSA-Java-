package LinkedList;
import java.util.*;
public class Practicepalindrome {
    public static class ListNode{
        int data;
        ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static ListNode head;

    public void addFirst(int data){
        ListNode newnode = new ListNode(data);
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    public void printll(){
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            list.add(temp.data);
            System.out.print(temp.data);
            temp = temp.next;
            
        }
        if(isPalindrome()){
            System.out.println("The list is a palindrome");
        }
        else{
            System.out.println("The list is not a palindrome");
        }
    }
    public boolean isPalindrome(){
        ArrayList<Integer> list = new ArrayList<>();
        int start = 0;
        int end = list.size()-1;
        while(start<end){
            if(list.get(start) != list.get(end)){
                return false;
            }
        }return true;
    }
    public static void main(String args[]){
        Practicepalindrome ll = new Practicepalindrome();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printll();
        
    }
}
