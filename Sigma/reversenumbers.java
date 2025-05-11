package Sigma;

public class reversenumbers {
    public static void main(String args[]){
        int res = 0, num = 450864, a;
        while(num!=0){
            a = num%10;
            res = (res*10)+a;
            num = num/10; 

        }
        System.out.print("The reverse no. is"+ res); 
    }
    
}
