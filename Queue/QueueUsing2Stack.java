package Queue;
import java.util.*;
public class QueueUsing2Stack {
    public static class Queue{
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty(){
            return s1.isEmpty();
        }

        //add
        public void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        //remove

        public int remove(){
            if(s1.isEmpty()){
                System.out.print("queue is empty");
            }
            int val = s1.pop();
            return val;
        }
        public int peek(){
            if(s1.isEmpty()){
                System.out.print("queue is empty");
            }
            int val = s1.peek();
            return val;
        }

        public static void main(String srgs[]){
            Queue q = new Queue();
            q.add(1);
            q.add(2);
            q.add(3);
            while(!q.isEmpty()){
                System.out.println(q.peek());
                q.remove();
            }
        }
    }
}
