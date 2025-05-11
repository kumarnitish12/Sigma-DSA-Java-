package Sigma;

public class bubblesort1{
    public static void basicsorting(int arr[]){
        for(int turn = 0;turn<arr.length;turn++){
            for(int j = 0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

            
                }
            }
        }

    }
    public static void Printarr(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }

    }
    public static void main(String args[]){
        int arr[]={5,6,43,56,23,68};
        basicsorting(arr);
        Printarr(arr);


    }

}