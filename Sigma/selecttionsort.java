package Sigma;

public class selecttionsort {
    public static void basicsorting(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            int minpos = turn;
            for(int j = turn+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;

                }
            }//swap
            int temp = arr[minpos];
            arr[minpos]=arr[turn];
            arr[turn]=temp;

        }
    }
    public static void Printarr(int arr[]){
        for(int i=arr.length;i<arr.length;i){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]= {5,4,1,2,3};
        basicsorting(arr);
        Printarr(arr);

    }
    
}
