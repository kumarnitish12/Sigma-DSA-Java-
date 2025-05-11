package Sigma;

public class reversearray {
    public static void Reverse(int nums[]){
        int first = 0; int end = nums.length-1;
        while(first<end){
            int temp = nums[first];
            nums[first] = nums[end];
            nums[end] = temp;
            first++;
            end--;
        }
        
        
    }
    public static void Printnums(int nums[]){
        for(int i =0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    
    public static void main(String args[]){
        int nums[] = {123456};
        Reverse(nums);
        Printnums(nums);

    }
    
}
