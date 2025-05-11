package Queue;
import java.util.*;
public class FirstNonRepeatingStr {
    public static void Nonrepeating(String str){
        Queue<Character> q = new LinkedList<>();
        int n = str.length();
        int arr[]= new int[26];

        for(int j =0;j<n;j++){
            
                q.add(str.charAt(j));
                arr[str.charAt(j)-'a']++;
            
                while( !q.isEmpty() && arr[q.peek()-'a']>1 ){
                    q.remove();
                }if(q.isEmpty()){
                    System.out.print("-1"+" ");
                }else{
                    System.out.print(q.peek()+" ");
                }
            
        }
    }
    

    public static void main(String args[]){
        String str = "aabcbd";
        Nonrepeating(str);
    }
}
