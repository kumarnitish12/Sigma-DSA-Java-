package LinkedList;

public class llboilerplate {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        //step1- create newNode
        Node newNode =new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        

        //step2- newNode = head
        newNode.next = head;

        //step3 - head = newaNode
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print(){
        Node temp = head ;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void add(int idx, int data){
        if(idx==0){
            addFirst(data);
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i =0;

        while(i<idx-1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;


    }
    public void deletefromlast(int n){
        Node temp = head;
        int sz = 0;
        while(temp!=null){
            temp = temp.next;
            sz++;
        }
        if(sz==0){
            head = head.next;
            return;
        }
        int i = 1;
        int iTofind = sz-n;
        Node prev = head;
        while(i<iTofind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public static void main(String args[]){
        llboilerplate ll = new llboilerplate();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2, 9);
     
        ll.deletefromlast(4);
        ll.print();
        System.out.print(size);
        

    }
}
