package Recursion;

public class sorted {
    public static boolean checksorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if( arr[i] > arr[i+1] ) {
            return false;
        }
        return checksorted(arr,i+1);
    }
    public static void main(String args[]){
        int arr[] ={1,2,3,4,6,5};
        System.out.print(checksorted(arr,0));
    }
    
}
