package ArrayList;
import java.util.ArrayList;
public class SwapAL {

    public static void swap(ArrayList<Integer> list, int indx1, int indx3 ){
        int temp = list.get(indx1);
        list.set(indx1, list.get(indx3));
        list.set(indx3, temp);
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int indx1 = 1, indx2 = 3;
        System.out.println("Before swapping: "+list);
        swap(list, indx1, indx2);
        System.out.println("After swapping: "+list);
    }
}
