package Sigma;

public class findlargest {
    public static void findlargest(int arr[]){
        int l= Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>l){
                l = arr[i];
            }
        }System.out.println(l);
    }
    public static void main(String args[]) {
        int arr[]={1,2,3,5,6,5,49,4};
        findlargest(arr);
        
    }
    
}
