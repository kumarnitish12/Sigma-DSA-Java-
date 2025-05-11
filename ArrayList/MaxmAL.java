package ArrayList;
import java.util.ArrayList;
public class MaxmAL {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        Integer maxm = list.get(0);

        for(int i = list.size()-1;i>=0;i--){
            if(list.get(i)>maxm){
                maxm = list.get(i);
            }
        }
        System.out.println(maxm);
    }
    
}
