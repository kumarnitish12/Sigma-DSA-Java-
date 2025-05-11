package ArrayList;
import java.util.*;
public class ASGNTMT2 {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> newlist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            list.add(sc.nextInt());
        }
        for(int i =0;i<list.size();i++){
            for(int j =i+1;j<list.size();j++){
                if(list.get(i)!=list.get(j) && list.get(i)!= list.get(j)-1 && list.get(i)!= list.get(j)+1){
                    newlist.add(list.get(i));
                }
            }
        }
        System.out.print(newlist);

    }
}
