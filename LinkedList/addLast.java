package LinkedList;

public class addLast {
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
    public static int size;

    public void addlast(int data){
        ListNode newnode = new ListNode(data);
        if(head==null){
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    
    }
    
    public void printlist(){

        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
            size++;
        }
    }
    public static void main(String args[]){
        
        addLast ll = new addLast();
        ll.addlast(4);
        ll.addlast(5);
        ll.addlast(6);
        ll.printlist();
        System.out.println();
        System.out.print(ll.size);
        
    }

}
