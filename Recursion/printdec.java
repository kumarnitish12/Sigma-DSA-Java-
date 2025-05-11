package Recursion;

public class printdec {
    public static void Printdec(int n){
        if(n==1){
            System.out.print(n);
            return ;
        }System.out.print(n+" ");
        Printdec(n-1);
    }
    public static void main(String a[]){
        int n = 10;
        Printdec(n);
    }
    
}
