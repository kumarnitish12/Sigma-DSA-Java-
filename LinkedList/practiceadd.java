/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class practiceadd
{
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
        ListNode newnode = new ListNode(data);
            if(head==null){
                head=tail=newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
    }
        
    public void print(){
            ListNode temp = head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
    }
        
    
    public static void main(String[] args) {
            practiceadd ll = new practiceadd();
            ll.addfirst(3);
            ll.addfirst(2);
            ll.addfirst(1);
            ll.print();
            
            
    }
}