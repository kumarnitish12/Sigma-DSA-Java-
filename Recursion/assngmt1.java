package Recursion;

public class assngmt1 {
    public static void findindex(int arr[], int key){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.print(i+" ");
            }
        }

    }
    public static void main(String args[]){
        int arr[] = {3,2,4,5,6,2,7,2,2};
        int key = 2;
        findindex(arr,key);

    }
    
}
