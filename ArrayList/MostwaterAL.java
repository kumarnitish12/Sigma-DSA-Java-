package ArrayList;
import java.util.ArrayList;
//brute force in array
// public class MostwaterAL {
//     public static void main(String args[]){
//         int[] height = {1,8,6,2,5,4,8,3,7};
//         int maxwater = 0;
//         for(int i =0;i<height.length;i++){
//             for(int j =i+1;j<height.length;j++){
//                 int ht = Math.min(height[i],height[j]);
//                 int wd = j-i;
//                 int water = ht*wd;
//                 maxwater = Math.max(water, maxwater);
                
//             }
//         }System.out.print(maxwater);
        
//     }
    
// }
//Time 0(n^2)
class MostwaterAL {
    public static int StoreWater(ArrayList<Integer> list ){
        int maxwater = 0;
        for(int i =0;i<list.size();i++){
            for(int j = i+1;j<list.size();j++){
                int ht = Math.min(list.get(i), list.get(j));
                int wd = j-i;
                int water = ht*wd;
                maxwater = Math.max(water, maxwater);
            }

        }return maxwater;

    }
    //2 pointer approach 0(n)
    public static int StoreWater2(ArrayList<Integer> list){
        int maxwater = 0;
        int lp =0;
        int rp = list.size()-1;
        while(lp<rp){
            int ht = Math.min(list.get(lp),list.get(rp));
            int width = rp-lp;
            int water = ht*width;
            maxwater = Math.max(maxwater, water);
            if(list.get(lp)>list.get(rp)){
                rp--;

            }else{
                lp++;
            }
        }return maxwater;
    } 
    
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.print(StoreWater2(list));
    }
}