package Stack;

public class LLimplementaton {
    public static class ListNode{
        int data;
        ListNode next;
        public  ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class Stack{
         static ListNode head=null;
        //is empty
        public boolean isEmpty(){
            return head == null;
        }
        //push
        public void push(int data){
            ListNode newnode = new ListNode(data);
            if(head==null){
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }
        //pop
        public int pop(){
            if(head==null){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;

        }
        //peek
        public void peek(){
            System.out.println(head.data);
        }
        public static void main(String args[]){
            Stack s = new Stack();
            s.push(1);
            s.push(2);
            s.push(3);
            while(!s.isEmpty()){
                s.peek();
                s.pop();
            }
        }
    }
    

}
