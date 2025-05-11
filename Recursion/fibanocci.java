package Recursion;

public class fibanocci {
    public static int printfibanocci(int n ){
        if(n==0||n==1){
            return n;
        }
        int fibnm1= printfibanocci(n-1);
        int fibnm2=printfibanocci(n-2);
        int fibn=fibnm2+fibnm1;
        return fibn;
    }
    public static void main(String args[]){
        System.out.print(printfibanocci(6));
        // System.out.println(printfibanocci(22));
        // System.out.println(printfibanocci(23));
        // System.out.println(printfibanocci(24));
        // System.out.println(printfibanocci(25));

        
    }
    
}
