package Sigma;

public class asngmtarray2 {
    public static void findindex(int nums[],int k){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==k){
                System.out.println(i);
               
            }
        }
    }
    public static void main(String args[]){
        int nums[]={4,5,6,7,0,1,2};
        int k = 0;
        findindex(nums,k);
    }
    
}
