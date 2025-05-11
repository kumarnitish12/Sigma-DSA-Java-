package Stack;
import java.util.*;


public class ALimplementation {
    public static class Stack{
        ArrayList <Integer> list = new ArrayList<>();
        //to check whether its empyty or not
        public boolean isEmpty(){
            return list.size()==0;
        }
        //push
        public void push(int data){
            list.add(data);
        }
        //pop
        public int pop(){
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        //peek
        public int peek(){
            return list.get(list.size()-1);
        }
        public static void main(String args[]){
            Stack s = new Stack();
            s.push(1);
            s.push(2);
            s.push(3);
            while(!s.isEmpty()){
                System.out.println(s.peek());
                s.pop();
            }
        }



    }
}
