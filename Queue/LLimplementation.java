package Queue;

public class LLimplementation {
    public static class ListNode{
        int data;
        ListNode next;
        public  ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue{
        ListNode head;
        ListNode tail;

        public boolean isEmpty(){
            return head==null;
        }

        public  void add(int data){
            ListNode newnode = new ListNode(data);
            if(head == null){
                head= tail = newnode;
                return;
            }
            tail.next = newnode;
            tail = newnode;
        }
        public int remove(){
            if(head==null){
                System.out.print("Queue is null");
                return -1;
            }
            // if(head==tail){
            //     head=tail=null;
            //     return head.data;
            // }
            int val = head.data;
            head=head.next;
            return val;

        }
        public void print(){
            if(head==null){
                System.out.print("Queue is Empty");
            }
            ListNode temp = head;
            while(temp!=null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
        public int peek(){
            if(head==null){
                System.out.print("Queue is Empty");
                return -1;
            }
            return head.data;
        }

        public static void main(String args[]){
            Queue q = new Queue();
            q.add(1);
            q.add(2);
            q.add(3);
            q.print();
            System.out.println(q.peek());
            System.out.print("\n");
            while(!q.isEmpty()){
                System.out.println(q.remove());
            }
            q.print();
        }
    }
}
