package Queue;

public class CircularQueue {
    public static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        Queue(int n ){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }
        public static boolean isEmpty(){
            return (rear == -1&& front == -1);  
        }

        public static boolean isFull(){
            return ((rear+1) == front);
        }

        public static void add(data){
            if(isFull()){
                System.out.println("queue is full");
                return;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }

    }
}
