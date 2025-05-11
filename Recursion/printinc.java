package Recursion;

public class printinc {
    public static void Printinc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        Printinc(n-1);
        System.out.print(n+" ");

    }
    public static void main(String ar[]){
        int n =5;
        Printinc(n);
    }
    
}
