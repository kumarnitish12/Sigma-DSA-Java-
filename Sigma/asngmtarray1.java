package Sigma;

class Asngmtarray1 {
    public static boolean twiceordistinct(int nums[]){
        for(int i =0;i<nums.length;i++)
        {
            for(int j =0;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                return false;
                }
             }
        }
        return true;


    }
    public static void main(String args[]){
        int nums[]={1,2,3,4};
        System.out.println(twiceordistinct(nums));
    }
    
    
}
