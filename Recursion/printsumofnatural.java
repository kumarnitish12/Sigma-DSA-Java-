package Recursion;

public class printsumofnatural {
    public static int sumofnatural(int n){
        if(n==1){
            return 1;
        }
        int fnm1 = sumofnatural(n-1);
        int sum = n+sumofnatural(n-1);
        return sum;
    }
    public static void main(String args[]){
        System.out.println(sumofnatural(5));
    }
    
}
