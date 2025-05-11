package LinkedList;

public class findcycle {
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

    public void add(int data ){
        ListNode newnode = new ListNode(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    public static boolean iscycle(){
        ListNode slow= head;
        ListNode fast = head;
        while(fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }

        }return false;
    }

    public static void main(String args[]){
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        // head.next.next.next = head;
        System.out.println(iscycle());
    }

}
