package Sigma;

public class Bbitoperator1 {
    public static void oddoreven(int n ){
        int bitmask=1;
        if((n & bitmask )== 0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The given no. is odd");
        }
    }
    public static void main(String args[]){
        oddoreven(3);
        oddoreven(16);
        
    }
    
}
