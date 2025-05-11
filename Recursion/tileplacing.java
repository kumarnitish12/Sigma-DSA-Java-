package Recursion;

public class tileplacing {
    public static int tileadjustment(int n){//2xn floor size{}
        //base
        if(n==0 || n==1){
            return 1;
        }
        //kaam 
        //vertical choice
        int fnm1 = tileadjustment(n-1);
        //horizontal choice
        int fnm2 = tileadjustment(n-2);
        int totways = fnm1+fnm2;
        return totways;
    } 
    public static void main (String a[]){
        System.out.print(tileadjustment(8));
    }
}
