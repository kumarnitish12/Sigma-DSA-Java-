package Queue;
import java.util.*;
public class ALImplementation {
    public static class Queue{
        static ArrayList<Integer> list;
        
        static int rear;
        Queue(int n ){
            list = new ArrayList<>();
            rear = -1;
        }
        public boolean isEmpty(){
            return rear==-1;
        }

        public static void add(int data){
            rear = rear+1;
            list.add(data);
        }

        public static int remove(){
            if (list.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = list.get(0);
            list.remove(0);
            rear = rear-1;
            return front;
        }

        public static int peek(){
            return list.get(0);
        }

        public static void main(String arg[]){
            Queue q = new Queue(5);
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
