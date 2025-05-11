

package Sigma;
// in vs code it won't run so, after copying this code run it in online compiler

import java.util.*;

public class twodarray {
    public static void main(String args[]){
        int matrix[][]= new int[3][3];
        int n = matrix.length ; int m = matrix[0].length;
       
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j = 0;j<m;j++){
                matrix[i][j]= sc.nextInt();

                
            }
        } 
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
}
// in vs code it won't run so, after copying this code run it in online compiler
