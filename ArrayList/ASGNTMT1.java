package ArrayList;
import java.util.*;
public class ASGNTMT1 {
    public static boolean monotonic(ArrayList<Integer> list){
        boolean isIncreasing = true;
        boolean isDecreasing = true;
        for(int i = 0; i < list.size()-1; i++){
            if(list.get(i) > list.get(i+1)){
                isIncreasing = false;
            }else if(list.get(i) < list.get(i+1)){
                isDecreasing=false;
            }
        }return isDecreasing || isIncreasing;


    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(3);
        System.out.print(monotonic(list));

    }
}
