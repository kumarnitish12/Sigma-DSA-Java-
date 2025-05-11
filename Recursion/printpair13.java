package Recursion;

public class printpair13 {
    public static int printfriendpair(int n){
        //base
        if(n==1 || n==2){
            return n;
        }
        //kaam
        int fnm1 = printfriendpair(n-1);
        int fnm2 = printfriendpair(n-2);
        int pairways = (n-1)*fnm2;
        int totways = fnm1+pairways;

         return totways;
    }
    public static void main(String args[]){
        System.out.println(printfriendpair(4));
    }
    
}
