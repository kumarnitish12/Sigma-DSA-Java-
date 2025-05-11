package LinkedList;
import java.util.*;
public class addFirst {

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
            //create new ListNode
            ListNode newnode = new ListNode(data);
            //if head is null
            if(head==null){
                head = tail = newnode;
                return;
            }
            //newnode.next = head
            newnode.next = head;

            //head = newnode
            head = newnode;
    }
    int size =0;
    public void printlist(){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            size++;
            temp = temp.next;
        }
        System.out.print("Size :"+size);
    }
    
    public static void main(String [] args){
        addFirst ll = new addFirst();
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.printlist();

    }
    
}
