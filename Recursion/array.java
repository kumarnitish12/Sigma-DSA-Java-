package Recursion;

public class array {
    public static int firstoccurance(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;

        }
        return firstoccurance(arr,key,i+1);
    }
    public static void main(String args[]){
        int arr[]={2,4,6,3,5,6,5};
        System.out.print(firstoccurance(arr,5,0));
    }
}
