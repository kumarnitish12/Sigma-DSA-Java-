package LinkedList;

public class doublyll {
    public static class ListNode{
        int data;
        ListNode next;
        ListNode prev;
        public ListNode(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static ListNode head;
    public static ListNode tail;
    public static int size;

    public void addfirst(int data){
        ListNode newnode = new ListNode(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
        head.prev = null;
    }
    public void addlast(int data){
        ListNode newnode = new ListNode(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.prev =tail;
        tail.next = newnode;
        tail = newnode;

    }
    
    public void printdll(){
        ListNode temp = head;
        size =0;
        while(temp!=null){
            size++;
            System.out.print(temp.data+"<-->");
            temp = temp.next;
        }
    }
    public int removefirst(){
        if(head==null){
            System.out.print("dll is emprty");
            return Integer.MIN_VALUE;
        }
        if(head.next == null){
            head.next = null;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        return val;
    }
    public void removelast(){
        if(head==null){
            System.out.print("dll is emprty");
        }
        if(head.next == null){
            head = null;
        }
        tail = tail.prev;
        tail.next = null;
    }
    public void reverse(){
        if(head==null){
            System.out.print("dll is emprty");
        }
        if(head.next==null){
            return;
        }
        ListNode temp = tail;
        while(head.prev!=null){
            // System.out.print();
            temp = temp.prev;
        }
        
    }
    public static void main(String args[]){
        doublyll dll = new doublyll();
        dll.addfirst(3);
        dll.addfirst(2);
        dll.addfirst(1);
        dll.printdll();
        System.out.println();
        System.out.println(size);
        dll.removefirst();
        dll.printdll();
        System.out.println();
        System.out.println(size);
        dll.addlast(4);
        dll.addlast(5);
        dll.printdll();
        dll.removelast();
        System.out.println();
        dll.printdll();
        dll.reverse();
        dll.printdll();
        
        
    }
}
