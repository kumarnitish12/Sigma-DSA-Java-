package LinkedList;

public class mergersort {
    public static class ListNode{
        int data;
        ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next = null;
        }
    }
    public static ListNode head;
    public static ListNode tail;

    public void addFirst(int data){
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
    private ListNode findmid(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private ListNode merge(ListNode head1, ListNode head2)
    {
        ListNode mergedll = new ListNode(-1);
        ListNode temp = mergedll;

        while(head1!=null && head2!=null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1!=null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2!=null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }return mergedll.next;
    }
    public ListNode mergeSort(ListNode head){
        if(head==null || head.next == null){
            return head;
        }
        //find mid
        ListNode mid = findmid(head);

        //left & right MS
        ListNode righthead = mid.next;
        mid.next = null;
        ListNode newleft = mergeSort(head);
        ListNode newRight = mergeSort(righthead);
        //merge
        return merge(newleft, newRight);
    }
    public static void main(String args[]){
        mergersort ll = new mergersort();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.print();
        System.out.println();
        ll.head = ll.mergeSort(ll.head);
        ll.print();
    }

}
