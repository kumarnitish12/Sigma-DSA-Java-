package Sigma;

public class leetcodepractive {
    public static void Twosum(int nums[], int key){
        for(int i =0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(key==nums[i]+nums[j]){
                    System.out.println(i+","+j);
                }
            }
        }
    }
    public static void main(String args[]){
        int nums[] = {2,3,4,5,7,8};
        Twosum(nums,15);
    }
    
}
