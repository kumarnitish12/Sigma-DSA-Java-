package ArrayList;
import java.util.ArrayList;
public class Operation {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        //To add elements in the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        // To get element
        int element = list.get(1);
        System.out.println(element);

        //to remove element from list
        list.remove(1);
        System.out.println(list);
        //Now after removing the element at index 1 remaining list will return
        
        //Ser element at exixting index
        list.set(2,5);
        System.out.println(list);

        //contains
        Boolean yes = list.contains(5);
        System.out.println(yes);

        //iteration
        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
