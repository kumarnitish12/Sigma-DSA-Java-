package Sigma;


public class search2darray {
    public static boolean search(int matrix[][],int key)
    {
        for(int i =0;i<matrix.length;i++)
        {
            for(int j =0;j<matrix[0].length;j++)
            {
                if(matrix[i][j] == key)
                {
                    System.out.print("found the element"+"("+i+","+j+")");
                    return true;
                    

                }
                

            }
        }
        System.out.print("element not found");
        return false;

    }
    public static void main(String args[])
    {
        int matrix[][] ={{1,2,3},
                         {4,5,6},
                         {7,8,9}};
        
        search(matrix, 5);


    }
    
}
