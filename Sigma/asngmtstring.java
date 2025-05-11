package Sigma;
import java.util.*;
public class asngmtstring{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        int count = 0;
        for(int j=0;j<str.length();j++){
            int ch = str.charAt(j);
            if(ch=='a'|| ch=='i'|| ch=='e'|| ch=='o'||ch=='u'){
                count++;

            }

        }System.out.print(count); 
    }
}