package Sigma;

public class insertionsort {
    public static void basicsorting(int arr[]){
        for(int i =1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] > arr[curr]){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=arr[curr];

        }        
    }
    public static void Printarr(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[]){
        int[] arr = {12,34,22,8,89,78};
        basicsorting(arr);
        Printarr(arr);
    }
    
}
