package LinkedList;

public class removecycle {
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

    public static boolean iscycle(){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }return false;
    }public static void  removecycle(){
        //detect cycle
        ListNode slow = head;
        ListNode fast = head;
        boolean cycle = false;
        while(fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                cycle = true;
                break;
            }
        }if(cycle == false){
            return;
        }
        //find start of cycle
        slow = head;
        ListNode prev = null;
        while(slow!=fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;

    }
    public static void main(String args[]){
        head = new ListNode(1);
        ListNode temp = new ListNode(2);
        head.next = temp;
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        // head.next.next.next.next = temp;
        System.out.println(iscycle());
        removecycle();
        System.out.println(iscycle());
    }
}
