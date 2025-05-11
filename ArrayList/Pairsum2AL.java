package ArrayList;
import java.util.ArrayList;

public class Pairsum2AL {
    public static boolean hasPairSum(ArrayList <Integer> list, int target) {
        int rp =0;
        int lp = 0;
        for(int i =0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                rp = i;
                lp = i+1;
            }

        }
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                System.out.println("Pair found: (" + list.get(lp) + ", " + list.get(rp) + ")");
                return true;
            }
            else if(list.get(lp)+list.get(rp)<target){
                lp = (lp+1)%list.size();
            }
            else if(list.get(rp)+list.get(lp)>target){
                rp = (list.size()+rp-1)%list.size();
            }
            
        }
        return false;


    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 17;
        System.out.println(hasPairSum(list, target));
    }
}
