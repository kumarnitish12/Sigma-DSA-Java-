// Online Java Compiler
// Use this editor to write, compile and run your Java code online
package LinkedList;
import java.util.Scanner;
import java.util.*;
class Main {
    public static class ListNode{
        
        int data;
        ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static ListNode head;
    public static ListNode tail;
    public void addfirst(int data){
                ArrayList<Integer> list = new ArrayList<>();

        //create newnode
        ListNode newnode = new ListNode(data);
        if(head == null){
            head = tail = newnode;
        }
        else{
            newnode.next = head;
            head = newnode;
        }
        
    }
    public void printll(){
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            list.add(temp.data);
            temp = temp.next;
            
            
        }
        System.out.println();
        System.out.println(list);
        if(ispalindrome(list)){
            System.out.print("Linkedlist is palindrome");
        }else{
            System.out.print("Linkedlist is not palindrome");
        }

    }
    public boolean ispalindrome(ArrayList list){
        int start =0; 
        int end = list.size() -1;
        while(start<end){
            if(list.get(start)!=list.get(end)){
                return false;
            }
            start++;
            end--;
        }return true;
    }
    public static void main(String args[]){
        Main ll = new Main();
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(3);
        ll.printll();
        
    }
}