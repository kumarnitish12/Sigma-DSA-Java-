package Sigma;

public class OOPs {
    public static void main(String args[]){
        pen p1 =new pen();
        p1.color = "Blue";
        p1.tip = 5;
        System.out.println(p1.color+" "+p1.tip);
    } 
    
}
class pen{
    String color;
    int tip;
    void setcolor(String newcolor){
        color = newcolor;
    }
    void settip(int newtip){
        tip = newtip;
    }
}
