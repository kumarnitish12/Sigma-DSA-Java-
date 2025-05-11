package LinkedList;

class remove {
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
        if(head == null){
            head = tail = newnode;
            return;    
        }
        newnode.next = head;
        head = newnode;
    }  
    public void addlast(int data){
        ListNode newnode = new ListNode(data);
        if(head == null){
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }  
    public void printlist(){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }
    public void removefirst(){
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            head = head.next;
        }

    }
    public void removeLast() {
        // If the list is empty
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // If there is only one element
        if (head.next == null) {
            head = tail = null;
            return;
        }

        // Traverse to the second-last node
        ListNode temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        // Update tail and remove last node
        temp.next = null;
        tail = temp;
    }
    public int itrSearch(int key){
        ListNode temp = head;
        int i =0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public void reverse(){
        ListNode prev = null;
        ListNode curr = tail = head;
        ListNode next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev= curr;
            curr = next;
        }
        head = prev;

    }
    public void removenth(int n){
        int sz = 0;
        ListNode temp = head;
        while(temp!=null){
            sz++;
        }
        if(n==sz){
            head = head.next;
            return;
        }
        int i = 1;
        int itofind = sz-n;
        ListNode prev = head;
        while(i<itofind){
            prev = prev.next;
        }
        prev = prev.next.next;
        return;
        
    }

    public static void main(String args[]){
        remove ll = new remove();
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(4);
        ll.addlast(5);
        // ll.removefirst();
        // ll.addfirst(1);
        // ll.removeLast();
        // ll.addlast(5);
        ll.printlist();
        ll.reverse();
        ll.printlist();
        


    }
}
